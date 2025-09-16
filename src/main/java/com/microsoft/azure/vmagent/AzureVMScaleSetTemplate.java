package com.microsoft.azure.vmagent;

import com.cloudbees.jenkins.plugins.sshcredentials.SSHUserPrivateKey;
import com.cloudbees.plugins.credentials.common.StandardListBoxModel;
import com.cloudbees.plugins.credentials.common.StandardUsernameCredentials;
import com.cloudbees.plugins.credentials.common.StandardUsernamePasswordCredentials;
import com.microsoft.azure.util.AzureBaseCredentials;
import com.microsoft.azure.util.AzureCredentialUtil;
import com.microsoft.azure.vmagent.exceptions.AzureCloudException;
import com.microsoft.azure.vmagent.util.AzureClientHolder;
import com.microsoft.azure.vmagent.util.AzureUtil;
import hudson.Extension;
import hudson.model.Describable;
import hudson.model.Descriptor;
import hudson.model.Node;
import hudson.security.ACL;
import hudson.slaves.Cloud;
import hudson.slaves.RetentionStrategy;
import hudson.util.ListBoxModel;
import jakarta.servlet.ServletException;
import jenkins.model.Jenkins;
import org.apache.commons.lang3.StringUtils;
import org.kohsuke.stapler.DataBoundConstructor;
import org.kohsuke.stapler.DataBoundSetter;
import org.kohsuke.stapler.QueryParameter;
import org.kohsuke.stapler.verb.POST;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class AzureVMScaleSetTemplate extends AzureVMAgentBaseTemplate implements Describable<AzureVMScaleSetTemplate>, Serializable {

    private final String location;
    private final String credentialsId;

    private String templateDescription;
    private String agentWorkspace;

    private transient AzureVMCloud azureCloud;

    @DataBoundConstructor
    public AzureVMScaleSetTemplate(String templateName, String location, String credentialsId) {
        super(templateName);
        this.location = location;
        this.credentialsId = credentialsId;
    }

    @Override
    public AzureVMDeploymentInfo provisionAgents(int numberOfAgents) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    List<String> verifyTemplate() {
        return List.of();
    }

    public AzureVMCloud retrieveAzureCloudReference() {
        return azureCloud;
    }

    public String getAgentWorkspace() {
        return agentWorkspace;
    }

    @DataBoundSetter
    public void setAgentWorkspace(String agentWorkspace) {
        this.agentWorkspace = agentWorkspace;
    }

    public String getTemplateName() {
        return templateName;
    }

    public String getCredentialsId() {
        return credentialsId;
    }

    public StandardUsernameCredentials getVMCredentials() throws AzureCloudException {
        return AzureUtil.getCredentials(credentialsId);
    }

    public String getLocation() {
        return location;
    }

    public String getTemplateDescription() {
        return templateDescription;
    }

    @DataBoundSetter
    public void setTemplateDescription(String templateDescription) {
        this.templateDescription = templateDescription;
    }

    public String getLabels() {
        return labels;
    }

    @DataBoundSetter
    public void setLabels(String labels) {
        this.labels = labels;
    }

    @Extension
    public static final class DescriptorImpl extends Descriptor<AzureVMScaleSetTemplate> {
        @POST
        public ListBoxModel doFillUsageModeItems() throws IOException, ServletException {
            ListBoxModel model = new ListBoxModel();
            for (Node.Mode m : hudson.Functions.getNodeModes()) {
                model.add(m.getDescription(), m.getName());
            }
            return model;
        }

        @POST
        // TODO reduce code duplication
        public ListBoxModel doFillCredentialsIdItems(@QueryParameter String credentialsId) {
            StandardListBoxModel model = new StandardListBoxModel();
            Jenkins context = Jenkins.get();
            if (!context.hasPermission(Jenkins.ADMINISTER)) {
                return model.includeCurrentValue(credentialsId);
            }

            return model
                    .includeAs(ACL.SYSTEM, context, SSHUserPrivateKey.class)
                    .includeAs(ACL.SYSTEM, context, StandardUsernamePasswordCredentials.class);
        }

        private AzureVMCloud getAzureCloud(String cloudName) {
            Cloud cloud = Jenkins.get().getCloud(cloudName);

            if (cloud instanceof AzureVMCloud) {
                return (AzureVMCloud) cloud;
            }

            return null;
        }

        private String getAzureCredentialsIdFromCloud(String cloudName) {
            AzureVMCloud cloud = getAzureCloud(cloudName);

            if (cloud != null) {
                return cloud.getAzureCredentialsId();
            }

            return null;
        }

        public List<Descriptor<RetentionStrategy<?>>> getAzureVMRetentionStrategy() {
            List<Descriptor<RetentionStrategy<?>>> list = new ArrayList<>();
            list.add(AzureVMCloudRetensionStrategy.DESCRIPTOR);
            list.add(AzureVMCloudPoolRetentionStrategy.DESCRIPTOR);
            list.add(AzureVMCloudOnceRetentionStrategy.DESCRIPTOR);
            return list;
        }


        @POST
        public ListBoxModel doFillLocationItems(
                @QueryParameter("cloudName") String cloudName
        ) {
            Jenkins.get().checkPermission(Jenkins.SYSTEM_READ);

            String azureCredentialsId = getAzureCredentialsIdFromCloud(cloudName);

            ListBoxModel model = new ListBoxModel();
            if (StringUtils.isBlank(azureCredentialsId)) {
                return model;
            }

            AzureBaseCredentials credential = AzureCredentialUtil.getCredential(null, azureCredentialsId);
            if (credential != null) {
                String envName = credential.getAzureEnvironmentName();
                String managementEndpoint = credential.getManagementEndpoint();
                AzureVMManagementServiceDelegate delegate = AzureClientHolder.getDelegate(azureCredentialsId);
                if (delegate != null) {
                    Set<String> locations = delegate
                            .getVirtualMachineLocations(managementEndpoint != null ? managementEndpoint : envName);
                    if (locations != null) {
                        Set<String> sortedLocations = new TreeSet<>(locations);
                        for (String location : sortedLocations) {
                            model.add(location);
                        }
                    }
                }
            }

            return model;
        }
    }
}
