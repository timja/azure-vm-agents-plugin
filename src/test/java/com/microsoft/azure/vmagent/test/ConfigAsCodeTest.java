package com.microsoft.azure.vmagent.test;

import com.microsoft.azure.vmagent.AzureVMCloud;
import io.jenkins.plugins.casc.ConfigurationAsCode;
import io.jenkins.plugins.casc.ConfiguratorException;
import org.junit.Rule;
import org.junit.Test;
import org.jvnet.hudson.test.JenkinsRule;

import java.io.ByteArrayOutputStream;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ConfigAsCodeTest {

    @Rule
    public JenkinsRule r = new JenkinsRule();

    @Test
    public void should_support_configuration_as_code() throws Exception {
        configure();
        AzureVMCloud cloud = (AzureVMCloud) r.jenkins.clouds.get(0);
        assertThat(cloud.getCloudName(), is("test-cloud"));
    }

    private void configure() throws ConfiguratorException {
        String s = getClass().getResource("/configuration-as-code.yml").toString();
        ConfigurationAsCode.get().configure(s);
    }

    @Test
    public void export_configuration() throws Exception {
        configure();

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ConfigurationAsCode.get().export(out);

        String exportedConfig = out.toString();
        assertThat(exportedConfig, containsString("test-cloud"));
    }
}
