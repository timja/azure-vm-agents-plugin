package com.microsoft.azure.vmagent.test.jcasc;

import com.microsoft.azure.vmagent.AzureVMAgentTemplate;
import com.microsoft.azure.vmagent.AzureVMCloud;
import com.microsoft.azure.vmagent.AzureVMCloudRetensionStrategy;
import com.microsoft.azure.vmagent.builders.AzureVMCloudBuilder;
import io.jenkins.plugins.casc.ConfigurationAsCode;
import io.jenkins.plugins.casc.misc.ConfiguredWithCode;
import io.jenkins.plugins.casc.misc.JenkinsConfiguredWithCodeRule;
import jenkins.model.Jenkins;
import org.junit.Rule;
import org.junit.Test;
import org.jvnet.hudson.test.JenkinsRule;

import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConfigAsCodeTest {

    @Rule
    public JenkinsConfiguredWithCodeRule r = new JenkinsConfiguredWithCodeRule();

    @Test
    @ConfiguredWithCode("basic.yaml")
    public void importBasicConfiguration() {
        AzureVMCloud cloud = (AzureVMCloud) r.jenkins.clouds.get(0);

        // cloud
        assertThat(cloud.getCloudName(), is("azure"));
        assertThat(cloud.getAzureCredentialsId(), is("azure-cred"));
        assertThat(cloud.getDeploymentTimeout(), is(1200));
        assertThat(cloud.getMaxVirtualMachinesLimit(), is(10));

        assertThat(cloud.getNewResourceGroupName(), is("vm-agent"));
        assertThat(cloud.getResourceGroupReferenceType(), is("new"));

        // vmTemplate
        AzureVMAgentTemplate template = cloud.getVmTemplates().get(0);

        assertThat(template.getAgentLaunchMethod(), is("SSH"));
        assertThat(template.getBuiltInImage(), is("Ubuntu 16.14 LTS"));
        assertThat(template.getCredentialsId(), is("admin-cred"));
        assertThat(template.getDiskType(), is("managed"));
        assertThat(template.getDoNotUseMachineIfInitFails(), is(true));
        assertThat(template.isEnableMSI(), is(false));
        assertThat(template.getExecuteInitScriptAsRoot(), is(true));

        AzureVMAgentTemplate.ImageReferenceTypeClass imageReference = template.getImageReferenceType();
        assertThat(imageReference.getImageVersion(), is("latest"));

        assertThat(template.getImageTopLevelType(), is("basic"));

        assertThat(template.getIsInstallDocker(), is(true));
        assertThat(template.getIsInstallGit(), is(true));
        assertThat(template.getIsInstallMaven(), is(true));

        assertThat(template.getLabels(), is("ubuntu"));
        assertThat(template.getLocation(), is("East US"));
        assertThat(template.getNewStorageAccountName(), is("agent-storage"));

        assertThat(template.getNoOfParallelJobs(), is(1));
        assertThat(template.getOsDiskSize(), is(0));
        assertThat(template.getOsType(), is("Linux"));

        assertThat(template.getPreInstallSsh(), is(true));

        AzureVMCloudRetensionStrategy retentionStrategy = (AzureVMCloudRetensionStrategy) template.getRetentionStrategy();
        assertThat(retentionStrategy.getIdleTerminationMinutes(), is(60));

        assertThat(template.isShutdownOnIdle(), is(false));

        assertThat(template.getStorageAccountNameReferenceType(), is("new"));
        assertThat(template.getStorageAccountType(), is("Standard_LRS"));

        assertThat(template.isTemplateDisabled(), is(false));
        assertThat(template.getTemplateName(), is("ubuntu"));

        assertThat(template.getUsageMode(), is("Use this node as much as possible"));
        assertThat(template.getUsePrivateIP(), is(false));

        assertThat(template.getVirtualMachineSize(), is("Standard_DS2_v2"));
    }

    @Test
    public void export_configuration() throws Exception {
        AzureVMCloud myCloud = new AzureVMCloudBuilder()
                .withCloudName("myAzure")
                .withAzureCredentialsId("<your azure credential ID>")
                .withNewResourceGroupName("<your Resource Group Name>")
                .addNewTemplate()
                .withName("ubuntu")
                .withLabels("ubuntu")
                .withLocation("East US")
                .withVirtualMachineSize("Standard_DS2_v2")
                .withNewStorageAccount("<your Storage Account Name>")
                .addNewBuiltInImage()
                .withBuiltInImageName("Ubuntu 16.14 LTS")
                .withInstallGit(true)
                .withInstallMaven(true)
                .withInstallDocker(true)
                .endBuiltInImage()
                .withAdminCredential("<your admin credential ID>")
                .endTemplate()
                .build();

        Jenkins.get().clouds.add(myCloud);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        ConfigurationAsCode.get().export(outputStream);

        String output = outputStream.toString(StandardCharsets.UTF_8.name());

        System.out.println(output);
    }
}