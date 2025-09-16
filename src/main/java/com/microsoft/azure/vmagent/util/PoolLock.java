package com.microsoft.azure.vmagent.util;

import com.microsoft.azure.vmagent.AzureVMAgentBaseTemplate;
import com.microsoft.azure.vmagent.AzureVMAgentTemplate;

import java.util.HashMap;
import java.util.Map;

public final class PoolLock {

    private static final Map<AzureVMAgentBaseTemplate, Integer> templateProvisionLock = new HashMap<>();

    public static synchronized void provisionLock(AzureVMAgentBaseTemplate template) {
        Integer value = templateProvisionLock.get(template);
        if (value == null) {
            value = 0;
        }
        templateProvisionLock.put(template, value + 1);
    }

    public static synchronized void provisionUnlock(AzureVMAgentBaseTemplate template) {
        Integer value = templateProvisionLock.get(template);
        if (value != null) {
            value = value - 1;
            if (value > 0) {
                templateProvisionLock.put(template, value);
            } else {
                templateProvisionLock.remove(template);
            }
        }
    }

    public static synchronized boolean checkProvisionLock(AzureVMAgentBaseTemplate template) {
        return templateProvisionLock.containsKey(template);
    }

    private PoolLock() {

    }
}
