package com.microsoft.azure.vmagent;

import com.microsoft.azure.vmagent.util.FailureStage;
import hudson.model.Label;
import hudson.model.Node;
import hudson.model.labels.LabelAtom;
import hudson.slaves.RetentionStrategy;
import jenkins.security.stapler.StaplerAccessibleType;
import org.kohsuke.stapler.DataBoundSetter;

import java.util.List;
import java.util.Set;

@StaplerAccessibleType
public abstract class AzureVMAgentBaseTemplate {

    protected transient AzureVMCloud azureCloud;
    protected final String templateName;
    protected int noOfParallelJobs;
    protected Node.Mode usageMode;
    protected String labels;
    protected boolean usePrivateIP;
    protected transient String templateStatusDetails;
    protected boolean templateDisabled;
    protected int maxVirtualMachinesLimit;
    protected RetentionStrategy<?> retentionStrategy;

    private transient ProvisionStrategy templateProvisionStrategy;

    protected transient Set<LabelAtom> labelDataSet;

    public AzureVMAgentBaseTemplate(String templateName) {
        this.templateName = templateName;

        // Reset the template verification status.
        this.templateProvisionStrategy = new ProvisionStrategy();
    }

    public AzureVMCloud retrieveAzureCloudReference() {
        return azureCloud;
    }

    public String getResourceGroupName() {
        // Allow overriding?
        return retrieveAzureCloudReference().getResourceGroupName();
    }

    public int getMaxVirtualMachinesLimit() {
        return maxVirtualMachinesLimit;
    }

    @DataBoundSetter
    public void setMaxVirtualMachinesLimit(int maxVirtualMachinesLimit) {
        this.maxVirtualMachinesLimit = maxVirtualMachinesLimit;
    }


    @DataBoundSetter
    public void setNoOfParallelJobs(int noOfParallelJobs) {
        this.noOfParallelJobs = noOfParallelJobs;
    }

    public RetentionStrategy<?> getRetentionStrategy() {
        return retentionStrategy;
    }

    @DataBoundSetter
    public void setRetentionStrategy(RetentionStrategy<?> retentionStrategy) {
        this.retentionStrategy = retentionStrategy;
    }

    /**
     * Provision new agents using this template.
     *
     * @param numberOfAgents Number of agents to provision
     * @return New deployment info if the provisioning was successful.
     * @throws Exception May throw if provisioning was not successful.
     */
    abstract AzureVMDeploymentInfo provisionAgents(int numberOfAgents) throws Exception;

    abstract List<String> verifyTemplate() throws Exception;

    /**
     * If provisioning failed, handle the status and queue the template for
     * verification.
     *
     * @param message     Failure message
     * @param failureStep Stage that failure occurred
     */
    public void handleTemplateProvisioningFailure(String message, FailureStage failureStep) {
        // Set as failed, waiting for the next interval
        templateProvisionStrategy.failure();
        // Set the details so that it's easier to see what's going on from the configuration UI.
        setTemplateStatusDetails(message);
    }

    public String getTemplateStatusDetails() {
        return templateStatusDetails;
    }

    public ProvisionStrategy getTemplateProvisionStrategy() {
        return templateProvisionStrategy;
    }

    public void setTemplateProvisionStrategy(ProvisionStrategy templateProvisionStrategy) {
        this.templateProvisionStrategy = templateProvisionStrategy;
    }

    public void setTemplateStatusDetails(String templateStatusDetails) {
        this.templateStatusDetails = templateStatusDetails;
    }

    public void addAzureCloudReference(AzureVMCloud cloud) {
        azureCloud = cloud;
    }

    public String getTemplateName() {
        return templateName;
    }

    public Node.Mode getUsageMode() {
        return usageMode == null ? Node.Mode.NORMAL : usageMode;
    }

    @DataBoundSetter
    public void setUsageMode(Node.Mode usageMode) {
        this.usageMode = usageMode;
    }

    public Set<LabelAtom> getLabelDataSet() {
        return labelDataSet;
    }

    public String getLabels() {
        return labels;
    }

    public boolean isTemplateDisabled() {
        return templateDisabled;
    }

    @DataBoundSetter
    public void setTemplateDisabled(boolean templateDisabled) {
        this.templateDisabled = templateDisabled;
    }

    @DataBoundSetter
    public void setLabels(String labels) {
        this.labels = labels;
        this.labelDataSet = Label.parse(labels);
    }

    public int getNoOfParallelJobs() {
        if (noOfParallelJobs <= 0) {
            return 1;
        }
        return noOfParallelJobs;
    }

    public boolean isUsePrivateIP() {
        return usePrivateIP;
    }

    @DataBoundSetter
    public void setUsePrivateIP(boolean usePrivateIP) {
        this.usePrivateIP = usePrivateIP;
    }

    protected Object readResolve() {
        templateProvisionStrategy = new ProvisionStrategy();

        if (retentionStrategy == null) {
            retentionStrategy = new AzureVMCloudRetensionStrategy(0);
        }


        return this;
    }
}
