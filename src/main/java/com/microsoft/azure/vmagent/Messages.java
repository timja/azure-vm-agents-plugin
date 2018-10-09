// CHECKSTYLE:OFF

package com.microsoft.azure.vmagent;

import org.jvnet.localizer.Localizable;
import org.jvnet.localizer.ResourceBundleHolder;


/**
 * Generated localization support class.
 * 
 */
@SuppressWarnings({
    "",
    "PMD",
    "all"
})
public class Messages {

    /**
     * The resource bundle reference
     * 
     */
    private final static ResourceBundleHolder holder = ResourceBundleHolder.get(Messages.class);

    /**
     * Key {@code Build_Action_Delete_Agent}: {@code Delete agent after build
     * execution (when idle).}.
     * 
     * @return
     *     {@code Delete agent after build execution (when idle).}
     */
    public static String Build_Action_Delete_Agent() {
        return holder.format("Build_Action_Delete_Agent");
    }

    /**
     * Key {@code Build_Action_Delete_Agent}: {@code Delete agent after build
     * execution (when idle).}.
     * 
     * @return
     *     {@code Delete agent after build execution (when idle).}
     */
    public static Localizable _Build_Action_Delete_Agent() {
        return new Localizable(holder, "Build_Action_Delete_Agent");
    }

    /**
     * Key {@code Azure_GC_TemplateStatus_Warn_Msg}: {@code The template is
     * marked as disabled. Check the template status details in the Advanced
     * section.}.
     * 
     * @return
     *     {@code The template is marked as disabled. Check the template status
     *     details in the Advanced section.}
     */
    public static String Azure_GC_TemplateStatus_Warn_Msg() {
        return holder.format("Azure_GC_TemplateStatus_Warn_Msg");
    }

    /**
     * Key {@code Azure_GC_TemplateStatus_Warn_Msg}: {@code The template is
     * marked as disabled. Check the template status details in the Advanced
     * section.}.
     * 
     * @return
     *     {@code The template is marked as disabled. Check the template status
     *     details in the Advanced section.}
     */
    public static Localizable _Azure_GC_TemplateStatus_Warn_Msg() {
        return new Localizable(holder, "Azure_GC_TemplateStatus_Warn_Msg");
    }

    /**
     * Key {@code Azure_GC_Template_VirtualNetwork_NotFound}: {@code The
     * virtual network {0} does not exist in the resource group {1} in this
     * subscription.}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code The virtual network {0} does not exist in the resource group
     *     {1} in this subscription.}
     */
    public static String Azure_GC_Template_VirtualNetwork_NotFound(Object arg0, Object arg1) {
        return holder.format("Azure_GC_Template_VirtualNetwork_NotFound", arg0, arg1);
    }

    /**
     * Key {@code Azure_GC_Template_VirtualNetwork_NotFound}: {@code The
     * virtual network {0} does not exist in the resource group {1} in this
     * subscription.}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code The virtual network {0} does not exist in the resource group
     *     {1} in this subscription.}
     */
    public static Localizable _Azure_GC_Template_VirtualNetwork_NotFound(Object arg0, Object arg1) {
        return new Localizable(holder, "Azure_GC_Template_VirtualNetwork_NotFound", arg0, arg1);
    }

    /**
     * Key {@code Azure_GC_Template_SA_LOC_No_Match}: {@code Error: The
     * storage account location {0} and the location selected {1} do not
     * match.}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Error: The storage account location {0} and the location
     *     selected {1} do not match.}
     */
    public static String Azure_GC_Template_SA_LOC_No_Match(Object arg0, Object arg1) {
        return holder.format("Azure_GC_Template_SA_LOC_No_Match", arg0, arg1);
    }

    /**
     * Key {@code Azure_GC_Template_SA_LOC_No_Match}: {@code Error: The
     * storage account location {0} and the location selected {1} do not
     * match.}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Error: The storage account location {0} and the location
     *     selected {1} do not match.}
     */
    public static Localizable _Azure_GC_Template_SA_LOC_No_Match(Object arg0, Object arg1) {
        return new Localizable(holder, "Azure_GC_Template_SA_LOC_No_Match", arg0, arg1);
    }

    /**
     * Key {@code Azure_GC_Template_NSG_NotFound}: {@code The Network
     * Security Group {0} does not exist in the Resource Group.}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code The Network Security Group {0} does not exist in the Resource
     *     Group.}
     */
    public static String Azure_GC_Template_NSG_NotFound(Object arg0) {
        return holder.format("Azure_GC_Template_NSG_NotFound", arg0);
    }

    /**
     * Key {@code Azure_GC_Template_NSG_NotFound}: {@code The Network
     * Security Group {0} does not exist in the Resource Group.}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code The Network Security Group {0} does not exist in the Resource
     *     Group.}
     */
    public static Localizable _Azure_GC_Template_NSG_NotFound(Object arg0) {
        return new Localizable(holder, "Azure_GC_Template_NSG_NotFound", arg0);
    }

    /**
     * Key {@code Agent_Failed_To_Connect}: {@code The agent failed to
     * connect. The node has been marked for deletion. Make sure that the
     * appropriate firewall exceptions have been configured for the agent to
     * connect to the master.}.
     * 
     * @return
     *     {@code The agent failed to connect. The node has been marked for
     *     deletion. Make sure that the appropriate firewall exceptions have been
     *     configured for the agent to connect to the master.}
     */
    public static String Agent_Failed_To_Connect() {
        return holder.format("Agent_Failed_To_Connect");
    }

    /**
     * Key {@code Agent_Failed_To_Connect}: {@code The agent failed to
     * connect. The node has been marked for deletion. Make sure that the
     * appropriate firewall exceptions have been configured for the agent to
     * connect to the master.}.
     * 
     * @return
     *     {@code The agent failed to connect. The node has been marked for
     *     deletion. Make sure that the appropriate firewall exceptions have been
     *     configured for the agent to connect to the master.}
     */
    public static Localizable _Agent_Failed_To_Connect() {
        return new Localizable(holder, "Agent_Failed_To_Connect");
    }

    /**
     * Key {@code Azure_GC_Template_Val_Profile_Err}: {@code Failed to
     * validate the Azure profile. Verify the subscription Id, client Id and
     * secret, OAUth 2.0 Token Endpoint and the URL information.}.
     * 
     * @return
     *     {@code Failed to validate the Azure profile. Verify the subscription
     *     Id, client Id and secret, OAUth 2.0 Token Endpoint and the URL
     *     information.}
     */
    public static String Azure_GC_Template_Val_Profile_Err() {
        return holder.format("Azure_GC_Template_Val_Profile_Err");
    }

    /**
     * Key {@code Azure_GC_Template_Val_Profile_Err}: {@code Failed to
     * validate the Azure profile. Verify the subscription Id, client Id and
     * secret, OAUth 2.0 Token Endpoint and the URL information.}.
     * 
     * @return
     *     {@code Failed to validate the Azure profile. Verify the subscription
     *     Id, client Id and secret, OAUth 2.0 Token Endpoint and the URL
     *     information.}
     */
    public static Localizable _Azure_GC_Template_Val_Profile_Err() {
        return new Localizable(holder, "Azure_GC_Template_Val_Profile_Err");
    }

    /**
     * Key {@code Azure_GC_Template_Executors_Not_Positive}: {@code The
     * number of executors must be a positive integer.}.
     * 
     * @return
     *     {@code The number of executors must be a positive integer.}
     */
    public static String Azure_GC_Template_Executors_Not_Positive() {
        return holder.format("Azure_GC_Template_Executors_Not_Positive");
    }

    /**
     * Key {@code Azure_GC_Template_Executors_Not_Positive}: {@code The
     * number of executors must be a positive integer.}.
     * 
     * @return
     *     {@code The number of executors must be a positive integer.}
     */
    public static Localizable _Azure_GC_Template_Executors_Not_Positive() {
        return new Localizable(holder, "Azure_GC_Template_Executors_Not_Positive");
    }

    /**
     * Key {@code Azure_GC_Template_RT_Not_Positive}: {@code The retention
     * time must be a positive integer.}.
     * 
     * @return
     *     {@code The retention time must be a positive integer.}
     */
    public static String Azure_GC_Template_RT_Not_Positive() {
        return holder.format("Azure_GC_Template_RT_Not_Positive");
    }

    /**
     * Key {@code Azure_GC_Template_RT_Not_Positive}: {@code The retention
     * time must be a positive integer.}.
     * 
     * @return
     *     {@code The retention time must be a positive integer.}
     */
    public static Localizable _Azure_GC_Template_RT_Not_Positive() {
        return new Localizable(holder, "Azure_GC_Template_RT_Not_Positive");
    }

    /**
     * Key {@code Idle_Timeout_Delete}: {@code Node is being deleted by
     * Jenkins after idle timeout}.
     * 
     * @return
     *     {@code Node is being deleted by Jenkins after idle timeout}
     */
    public static String Idle_Timeout_Delete() {
        return holder.format("Idle_Timeout_Delete");
    }

    /**
     * Key {@code Idle_Timeout_Delete}: {@code Node is being deleted by
     * Jenkins after idle timeout}.
     * 
     * @return
     *     {@code Node is being deleted by Jenkins after idle timeout}
     */
    public static Localizable _Idle_Timeout_Delete() {
        return new Localizable(holder, "Idle_Timeout_Delete");
    }

    /**
     * Key {@code Azure_GC_Template_Name_Reserved}: {@code The template name
     * is using reserved words: login, microsoft, windows, xbox.}.
     * 
     * @return
     *     {@code The template name is using reserved words: login, microsoft,
     *     windows, xbox.}
     */
    public static String Azure_GC_Template_Name_Reserved() {
        return holder.format("Azure_GC_Template_Name_Reserved");
    }

    /**
     * Key {@code Azure_GC_Template_Name_Reserved}: {@code The template name
     * is using reserved words: login, microsoft, windows, xbox.}.
     * 
     * @return
     *     {@code The template name is using reserved words: login, microsoft,
     *     windows, xbox.}
     */
    public static Localizable _Azure_GC_Template_Name_Reserved() {
        return new Localizable(holder, "Azure_GC_Template_Name_Reserved");
    }

    /**
     * Key {@code Azure_GC_Template_Executors_Null_Or_Empty}: {@code Missing
     * number of executors.}.
     * 
     * @return
     *     {@code Missing number of executors.}
     */
    public static String Azure_GC_Template_Executors_Null_Or_Empty() {
        return holder.format("Azure_GC_Template_Executors_Null_Or_Empty");
    }

    /**
     * Key {@code Azure_GC_Template_Executors_Null_Or_Empty}: {@code Missing
     * number of executors.}.
     * 
     * @return
     *     {@code Missing number of executors.}
     */
    public static Localizable _Azure_GC_Template_Executors_Null_Or_Empty() {
        return new Localizable(holder, "Azure_GC_Template_Executors_Null_Or_Empty");
    }

    /**
     * Key {@code SA_Blank_Create_New}: {@code (Leave blank to create a new
     * storage account)}.
     * 
     * @return
     *     {@code (Leave blank to create a new storage account)}
     */
    public static String SA_Blank_Create_New() {
        return holder.format("SA_Blank_Create_New");
    }

    /**
     * Key {@code SA_Blank_Create_New}: {@code (Leave blank to create a new
     * storage account)}.
     * 
     * @return
     *     {@code (Leave blank to create a new storage account)}
     */
    public static Localizable _SA_Blank_Create_New() {
        return new Localizable(holder, "SA_Blank_Create_New");
    }

    /**
     * Key {@code User_Delete}: {@code Node is being deleted by the user}.
     * 
     * @return
     *     {@code Node is being deleted by the user}
     */
    public static String User_Delete() {
        return holder.format("User_Delete");
    }

    /**
     * Key {@code User_Delete}: {@code Node is being deleted by the user}.
     * 
     * @return
     *     {@code Node is being deleted by the user}
     */
    public static Localizable _User_Delete() {
        return new Localizable(holder, "User_Delete");
    }

    /**
     * Key {@code Azure_GC_Template_CS_LOC_No_Match}: {@code The cloud
     * service location and the location selected do not match. Use a
     * different cloud service or location.}.
     * 
     * @return
     *     {@code The cloud service location and the location selected do not
     *     match. Use a different cloud service or location.}
     */
    public static String Azure_GC_Template_CS_LOC_No_Match() {
        return holder.format("Azure_GC_Template_CS_LOC_No_Match");
    }

    /**
     * Key {@code Azure_GC_Template_CS_LOC_No_Match}: {@code The cloud
     * service location and the location selected do not match. Use a
     * different cloud service or location.}.
     * 
     * @return
     *     {@code The cloud service location and the location selected do not
     *     match. Use a different cloud service or location.}
     */
    public static Localizable _Azure_GC_Template_CS_LOC_No_Match() {
        return new Localizable(holder, "Azure_GC_Template_CS_LOC_No_Match");
    }

    /**
     * Key {@code Azure_GC_Template_SA_Cant_Validate}: {@code Could not
     * validate the storage account name.}.
     * 
     * @return
     *     {@code Could not validate the storage account name.}
     */
    public static String Azure_GC_Template_SA_Cant_Validate() {
        return holder.format("Azure_GC_Template_SA_Cant_Validate");
    }

    /**
     * Key {@code Azure_GC_Template_SA_Cant_Validate}: {@code Could not
     * validate the storage account name.}.
     * 
     * @return
     *     {@code Could not validate the storage account name.}
     */
    public static Localizable _Azure_GC_Template_SA_Cant_Validate() {
        return new Localizable(holder, "Azure_GC_Template_SA_Cant_Validate");
    }

    /**
     * Key {@code Azure_GC_Template_RT_Null_Or_Empty}: {@code Missing
     * retention time.}.
     * 
     * @return
     *     {@code Missing retention time.}
     */
    public static String Azure_GC_Template_RT_Null_Or_Empty() {
        return holder.format("Azure_GC_Template_RT_Null_Or_Empty");
    }

    /**
     * Key {@code Azure_GC_Template_RT_Null_Or_Empty}: {@code Missing
     * retention time.}.
     * 
     * @return
     *     {@code Missing retention time.}
     */
    public static Localizable _Azure_GC_Template_RT_Null_Or_Empty() {
        return new Localizable(holder, "Azure_GC_Template_RT_Null_Or_Empty");
    }

    /**
     * Key {@code Azure_GC_Template_SA_Type_Not_Match}: {@code The chosen
     * storage type: {0} and the existing account type: {1} do not match.}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code The chosen storage type: {0} and the existing account type: {1}
     *     do not match.}
     */
    public static String Azure_GC_Template_SA_Type_Not_Match(Object arg0, Object arg1) {
        return holder.format("Azure_GC_Template_SA_Type_Not_Match", arg0, arg1);
    }

    /**
     * Key {@code Azure_GC_Template_SA_Type_Not_Match}: {@code The chosen
     * storage type: {0} and the existing account type: {1} do not match.}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code The chosen storage type: {0} and the existing account type: {1}
     *     do not match.}
     */
    public static Localizable _Azure_GC_Template_SA_Type_Not_Match(Object arg0, Object arg1) {
        return new Localizable(holder, "Azure_GC_Template_SA_Type_Not_Match", arg0, arg1);
    }

    /**
     * Key {@code Azure_VM_Agent_Attach_Public_IP_Success}: {@code
     * Successfully attached a public IP}.
     * 
     * @return
     *     {@code Successfully attached a public IP}
     */
    public static String Azure_VM_Agent_Attach_Public_IP_Success() {
        return holder.format("Azure_VM_Agent_Attach_Public_IP_Success");
    }

    /**
     * Key {@code Azure_VM_Agent_Attach_Public_IP_Success}: {@code
     * Successfully attached a public IP}.
     * 
     * @return
     *     {@code Successfully attached a public IP}
     */
    public static Localizable _Azure_VM_Agent_Attach_Public_IP_Success() {
        return new Localizable(holder, "Azure_VM_Agent_Attach_Public_IP_Success");
    }

    /**
     * Key {@code Azure_GC_Template_JNLP_Not_Supported}: {@code The JNLP
     * launch method is supported only for Windows.}.
     * 
     * @return
     *     {@code The JNLP launch method is supported only for Windows.}
     */
    public static String Azure_GC_Template_JNLP_Not_Supported() {
        return holder.format("Azure_GC_Template_JNLP_Not_Supported");
    }

    /**
     * Key {@code Azure_GC_Template_JNLP_Not_Supported}: {@code The JNLP
     * launch method is supported only for Windows.}.
     * 
     * @return
     *     {@code The JNLP launch method is supported only for Windows.}
     */
    public static Localizable _Azure_GC_Template_JNLP_Not_Supported() {
        return new Localizable(holder, "Azure_GC_Template_JNLP_Not_Supported");
    }

    /**
     * Key {@code Azure_GC_Password_Err}: {@code Required: Not a valid
     * password. The password length must be between 8 and 123 characters. It
     * also needs to have at least one digit, one lowercase and one uppercase
     * letter.}.
     * 
     * @return
     *     {@code Required: Not a valid password. The password length must be
     *     between 8 and 123 characters. It also needs to have at least one
     *     digit, one lowercase and one uppercase letter.}
     */
    public static String Azure_GC_Password_Err() {
        return holder.format("Azure_GC_Password_Err");
    }

    /**
     * Key {@code Azure_GC_Password_Err}: {@code Required: Not a valid
     * password. The password length must be between 8 and 123 characters. It
     * also needs to have at least one digit, one lowercase and one uppercase
     * letter.}.
     * 
     * @return
     *     {@code Required: Not a valid password. The password length must be
     *     between 8 and 123 characters. It also needs to have at least one
     *     digit, one lowercase and one uppercase letter.}
     */
    public static Localizable _Azure_GC_Password_Err() {
        return new Localizable(holder, "Azure_GC_Password_Err");
    }

    /**
     * Key {@code Azure_GC_Template_ImageURI_Wrong_Storage_Account}: {@code
     * The reference image should be in the same storage account as the one
     * declared in the template.}.
     * 
     * @return
     *     {@code The reference image should be in the same storage account as
     *     the one declared in the template.}
     */
    public static String Azure_GC_Template_ImageURI_Wrong_Storage_Account() {
        return holder.format("Azure_GC_Template_ImageURI_Wrong_Storage_Account");
    }

    /**
     * Key {@code Azure_GC_Template_ImageURI_Wrong_Storage_Account}: {@code
     * The reference image should be in the same storage account as the one
     * declared in the template.}.
     * 
     * @return
     *     {@code The reference image should be in the same storage account as
     *     the one declared in the template.}
     */
    public static Localizable _Azure_GC_Template_ImageURI_Wrong_Storage_Account() {
        return new Localizable(holder, "Azure_GC_Template_ImageURI_Wrong_Storage_Account");
    }

    /**
     * Key {@code Build_Action_Delete_Agent_If_Not_Success}: {@code Delete
     * agent if the build was not successful (when idle).}.
     * 
     * @return
     *     {@code Delete agent if the build was not successful (when idle).}
     */
    public static String Build_Action_Delete_Agent_If_Not_Success() {
        return holder.format("Build_Action_Delete_Agent_If_Not_Success");
    }

    /**
     * Key {@code Build_Action_Delete_Agent_If_Not_Success}: {@code Delete
     * agent if the build was not successful (when idle).}.
     * 
     * @return
     *     {@code Delete agent if the build was not successful (when idle).}
     */
    public static Localizable _Build_Action_Delete_Agent_If_Not_Success() {
        return new Localizable(holder, "Build_Action_Delete_Agent_If_Not_Success");
    }

    /**
     * Key {@code Build_Action_Shutdown_Agent}: {@code Shutdown Azure agent
     * after build execution.}.
     * 
     * @return
     *     {@code Shutdown Azure agent after build execution.}
     */
    public static String Build_Action_Shutdown_Agent() {
        return holder.format("Build_Action_Shutdown_Agent");
    }

    /**
     * Key {@code Build_Action_Shutdown_Agent}: {@code Shutdown Azure agent
     * after build execution.}.
     * 
     * @return
     *     {@code Shutdown Azure agent after build execution.}
     */
    public static Localizable _Build_Action_Shutdown_Agent() {
        return new Localizable(holder, "Build_Action_Shutdown_Agent");
    }

    /**
     * Key {@code Shutdown_Agent_Failed_To_Revive}: {@code The previously
     * shut down agent failed to start.}.
     * 
     * @return
     *     {@code The previously shut down agent failed to start.}
     */
    public static String Shutdown_Agent_Failed_To_Revive() {
        return holder.format("Shutdown_Agent_Failed_To_Revive");
    }

    /**
     * Key {@code Shutdown_Agent_Failed_To_Revive}: {@code The previously
     * shut down agent failed to start.}.
     * 
     * @return
     *     {@code The previously shut down agent failed to start.}
     */
    public static Localizable _Shutdown_Agent_Failed_To_Revive() {
        return new Localizable(holder, "Shutdown_Agent_Failed_To_Revive");
    }

    /**
     * Key {@code Azure_GC_Template_Error_List}: {@code The following errors
     * occurred while validating the template.}.
     * 
     * @return
     *     {@code The following errors occurred while validating the template.}
     */
    public static String Azure_GC_Template_Error_List() {
        return holder.format("Azure_GC_Template_Error_List");
    }

    /**
     * Key {@code Azure_GC_Template_Error_List}: {@code The following errors
     * occurred while validating the template.}.
     * 
     * @return
     *     {@code The following errors occurred while validating the template.}
     */
    public static Localizable _Azure_GC_Template_Error_List() {
        return new Localizable(holder, "Azure_GC_Template_Error_List");
    }

    /**
     * Key {@code Azure_GC_UserName_Err}: {@code Not a valid user name. The
     * user name must contain between 3 and 15 characters: alphanumerics,
     * underscore or hyphen.}.
     * 
     * @return
     *     {@code Not a valid user name. The user name must contain between 3 and
     *      15 characters: alphanumerics, underscore or hyphen.}
     */
    public static String Azure_GC_UserName_Err() {
        return holder.format("Azure_GC_UserName_Err");
    }

    /**
     * Key {@code Azure_GC_UserName_Err}: {@code Not a valid user name. The
     * user name must contain between 3 and 15 characters: alphanumerics,
     * underscore or hyphen.}.
     * 
     * @return
     *     {@code Not a valid user name. The user name must contain between 3 and
     *      15 characters: alphanumerics, underscore or hyphen.}
     */
    public static Localizable _Azure_GC_UserName_Err() {
        return new Localizable(holder, "Azure_GC_UserName_Err");
    }

    /**
     * Key {@code Azure_GC_Template_BuiltIn_Not_Valid}: {@code Azure build-in
     * image is not valid.}.
     * 
     * @return
     *     {@code Azure build-in image is not valid.}
     */
    public static String Azure_GC_Template_BuiltIn_Not_Valid() {
        return holder.format("Azure_GC_Template_BuiltIn_Not_Valid");
    }

    /**
     * Key {@code Azure_GC_Template_BuiltIn_Not_Valid}: {@code Azure build-in
     * image is not valid.}.
     * 
     * @return
     *     {@code Azure build-in image is not valid.}
     */
    public static Localizable _Azure_GC_Template_BuiltIn_Not_Valid() {
        return new Localizable(holder, "Azure_GC_Template_BuiltIn_Not_Valid");
    }

    /**
     * Key {@code Azure_GC_Template_SA_Already_Exists}: {@code The storage
     * account name already exists. Use a different name.}.
     * 
     * @return
     *     {@code The storage account name already exists. Use a different name.}
     */
    public static String Azure_GC_Template_SA_Already_Exists() {
        return holder.format("Azure_GC_Template_SA_Already_Exists");
    }

    /**
     * Key {@code Azure_GC_Template_SA_Already_Exists}: {@code The storage
     * account name already exists. Use a different name.}.
     * 
     * @return
     *     {@code The storage account name already exists. Use a different name.}
     */
    public static Localizable _Azure_GC_Template_SA_Already_Exists() {
        return new Localizable(holder, "Azure_GC_Template_SA_Already_Exists");
    }

    /**
     * Key {@code Azure_Agent_Post_Build_Action}: {@code Perform an action if
     * the job was performed on an Azure VM Agent.}.
     * 
     * @return
     *     {@code Perform an action if the job was performed on an Azure VM
     *     Agent.}
     */
    public static String Azure_Agent_Post_Build_Action() {
        return holder.format("Azure_Agent_Post_Build_Action");
    }

    /**
     * Key {@code Azure_Agent_Post_Build_Action}: {@code Perform an action if
     * the job was performed on an Azure VM Agent.}.
     * 
     * @return
     *     {@code Perform an action if the job was performed on an Azure VM
     *     Agent.}
     */
    public static Localizable _Azure_Agent_Post_Build_Action() {
        return new Localizable(holder, "Azure_Agent_Post_Build_Action");
    }

    /**
     * Key {@code Azure_GC_Template_Name_Shortened}: {@code The template name
     * is valid, but VM names will be shortened to: {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code The template name is valid, but VM names will be shortened to:
     *     {0}}
     */
    public static String Azure_GC_Template_Name_Shortened(Object arg0) {
        return holder.format("Azure_GC_Template_Name_Shortened", arg0);
    }

    /**
     * Key {@code Azure_GC_Template_Name_Shortened}: {@code The template name
     * is valid, but VM names will be shortened to: {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code The template name is valid, but VM names will be shortened to:
     *     {0}}
     */
    public static Localizable _Azure_GC_Template_Name_Shortened(Object arg0) {
        return new Localizable(holder, "Azure_GC_Template_Name_Shortened", arg0);
    }

    /**
     * Key {@code Azure_GC_Template_subnet_NotFound}: {@code The subnet {0}
     * does not belong to the specified virtual network.}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code The subnet {0} does not belong to the specified virtual
     *     network.}
     */
    public static String Azure_GC_Template_subnet_NotFound(Object arg0) {
        return holder.format("Azure_GC_Template_subnet_NotFound", arg0);
    }

    /**
     * Key {@code Azure_GC_Template_subnet_NotFound}: {@code The subnet {0}
     * does not belong to the specified virtual network.}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code The subnet {0} does not belong to the specified virtual
     *     network.}
     */
    public static Localizable _Azure_GC_Template_subnet_NotFound(Object arg0) {
        return new Localizable(holder, "Azure_GC_Template_subnet_NotFound", arg0);
    }

    /**
     * Key {@code Azure_GC_Template_PWD_Null_Or_Empty}: {@code Missing admin
     * password.}.
     * 
     * @return
     *     {@code Missing admin password.}
     */
    public static String Azure_GC_Template_PWD_Null_Or_Empty() {
        return holder.format("Azure_GC_Template_PWD_Null_Or_Empty");
    }

    /**
     * Key {@code Azure_GC_Template_PWD_Null_Or_Empty}: {@code Missing admin
     * password.}.
     * 
     * @return
     *     {@code Missing admin password.}
     */
    public static Localizable _Azure_GC_Template_PWD_Null_Or_Empty() {
        return new Localizable(holder, "Azure_GC_Template_PWD_Null_Or_Empty");
    }

    /**
     * Key {@code Azure_GC_Template_Deployment_Timeout_Err}: {@code
     * Deployment Timeout value is invalid. Should be a positive integer and
     * more than 1200 seconds.}.
     * 
     * @return
     *     {@code Deployment Timeout value is invalid. Should be a positive
     *     integer and more than 1200 seconds.}
     */
    public static String Azure_GC_Template_Deployment_Timeout_Err() {
        return holder.format("Azure_GC_Template_Deployment_Timeout_Err");
    }

    /**
     * Key {@code Azure_GC_Template_Deployment_Timeout_Err}: {@code
     * Deployment Timeout value is invalid. Should be a positive integer and
     * more than 1200 seconds.}.
     * 
     * @return
     *     {@code Deployment Timeout value is invalid. Should be a positive
     *     integer and more than 1200 seconds.}
     */
    public static Localizable _Azure_GC_Template_Deployment_Timeout_Err() {
        return new Localizable(holder, "Azure_GC_Template_Deployment_Timeout_Err");
    }

    /**
     * Key {@code Azure_GC_Template_UN_Null_Or_Empty}: {@code Missing admin
     * user name.}.
     * 
     * @return
     *     {@code Missing admin user name.}
     */
    public static String Azure_GC_Template_UN_Null_Or_Empty() {
        return holder.format("Azure_GC_Template_UN_Null_Or_Empty");
    }

    /**
     * Key {@code Azure_GC_Template_UN_Null_Or_Empty}: {@code Missing admin
     * user name.}.
     * 
     * @return
     *     {@code Missing admin user name.}
     */
    public static Localizable _Azure_GC_Template_UN_Null_Or_Empty() {
        return new Localizable(holder, "Azure_GC_Template_UN_Null_Or_Empty");
    }

    /**
     * Key {@code Azure_Template_Config_Success}: {@code Verified the
     * template configuration successfully.}.
     * 
     * @return
     *     {@code Verified the template configuration successfully.}
     */
    public static String Azure_Template_Config_Success() {
        return holder.format("Azure_Template_Config_Success");
    }

    /**
     * Key {@code Azure_Template_Config_Success}: {@code Verified the
     * template configuration successfully.}.
     * 
     * @return
     *     {@code Verified the template configuration successfully.}
     */
    public static Localizable _Azure_Template_Config_Success() {
        return new Localizable(holder, "Azure_Template_Config_Success");
    }

    /**
     * Key {@code Azure_GC_OS_Type_Unknown_Err}: {@code Unknown OS type. 
     * Should be Linux or Windows}.
     * 
     * @return
     *     {@code Unknown OS type.  Should be Linux or Windows}
     */
    public static String Azure_GC_OS_Type_Unknown_Err() {
        return holder.format("Azure_GC_OS_Type_Unknown_Err");
    }

    /**
     * Key {@code Azure_GC_OS_Type_Unknown_Err}: {@code Unknown OS type. 
     * Should be Linux or Windows}.
     * 
     * @return
     *     {@code Unknown OS type.  Should be Linux or Windows}
     */
    public static Localizable _Azure_GC_OS_Type_Unknown_Err() {
        return new Localizable(holder, "Azure_GC_OS_Type_Unknown_Err");
    }

    /**
     * Key {@code Azure_GC_Template_ImageURI_Not_In_Same_Account}: {@code The
     * image URI is not located in the same storage account as the target
     * storage account for the VM}.
     * 
     * @return
     *     {@code The image URI is not located in the same storage account as the
     *     target storage account for the VM}
     */
    public static String Azure_GC_Template_ImageURI_Not_In_Same_Account() {
        return holder.format("Azure_GC_Template_ImageURI_Not_In_Same_Account");
    }

    /**
     * Key {@code Azure_GC_Template_ImageURI_Not_In_Same_Account}: {@code The
     * image URI is not located in the same storage account as the target
     * storage account for the VM}.
     * 
     * @return
     *     {@code The image URI is not located in the same storage account as the
     *     target storage account for the VM}
     */
    public static Localizable _Azure_GC_Template_ImageURI_Not_In_Same_Account() {
        return new Localizable(holder, "Azure_GC_Template_ImageURI_Not_In_Same_Account");
    }

    /**
     * Key {@code Azure_GC_Template_ImageReference_Not_Valid}: {@code Failed
     * to validate the provided image reference: {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Failed to validate the provided image reference: {0}}
     */
    public static String Azure_GC_Template_ImageReference_Not_Valid(Object arg0) {
        return holder.format("Azure_GC_Template_ImageReference_Not_Valid", arg0);
    }

    /**
     * Key {@code Azure_GC_Template_ImageReference_Not_Valid}: {@code Failed
     * to validate the provided image reference: {0}}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Failed to validate the provided image reference: {0}}
     */
    public static Localizable _Azure_GC_Template_ImageReference_Not_Valid(Object arg0) {
        return new Localizable(holder, "Azure_GC_Template_ImageReference_Not_Valid", arg0);
    }

    /**
     * Key {@code Azure_GC_Template_ImageURI_Not_Valid}: {@code Failed to
     * validate the provided image location.}.
     * 
     * @return
     *     {@code Failed to validate the provided image location.}
     */
    public static String Azure_GC_Template_ImageURI_Not_Valid() {
        return holder.format("Azure_GC_Template_ImageURI_Not_Valid");
    }

    /**
     * Key {@code Azure_GC_Template_ImageURI_Not_Valid}: {@code Failed to
     * validate the provided image location.}.
     * 
     * @return
     *     {@code Failed to validate the provided image location.}
     */
    public static Localizable _Azure_GC_Template_ImageURI_Not_Valid() {
        return new Localizable(holder, "Azure_GC_Template_ImageURI_Not_Valid");
    }

    /**
     * Key {@code Azure_GC_Template_subnet_Empty}: {@code The subnet name
     * cannot be empty}.
     * 
     * @return
     *     {@code The subnet name cannot be empty}
     */
    public static String Azure_GC_Template_subnet_Empty() {
        return holder.format("Azure_GC_Template_subnet_Empty");
    }

    /**
     * Key {@code Azure_GC_Template_subnet_Empty}: {@code The subnet name
     * cannot be empty}.
     * 
     * @return
     *     {@code The subnet name cannot be empty}
     */
    public static Localizable _Azure_GC_Template_subnet_Empty() {
        return new Localizable(holder, "Azure_GC_Template_subnet_Empty");
    }

    /**
     * Key {@code Azure_GC_LaunchMethod_Warn_Msg}: {@code Make sure the Azure
     * agent can reach the master via the Jenkins URL. Refer to the help for
     * details.}.
     * 
     * @return
     *     {@code Make sure the Azure agent can reach the master via the Jenkins
     *     URL. Refer to the help for details.}
     */
    public static String Azure_GC_LaunchMethod_Warn_Msg() {
        return holder.format("Azure_GC_LaunchMethod_Warn_Msg");
    }

    /**
     * Key {@code Azure_GC_LaunchMethod_Warn_Msg}: {@code Make sure the Azure
     * agent can reach the master via the Jenkins URL. Refer to the help for
     * details.}.
     * 
     * @return
     *     {@code Make sure the Azure agent can reach the master via the Jenkins
     *     URL. Refer to the help for details.}
     */
    public static Localizable _Azure_GC_LaunchMethod_Warn_Msg() {
        return new Localizable(holder, "Azure_GC_LaunchMethod_Warn_Msg");
    }

    /**
     * Key {@code Azure_VM_Agent_Attach_Public_IP_Failure}: {@code Failed to
     * attach a public IP}.
     * 
     * @return
     *     {@code Failed to attach a public IP}
     */
    public static String Azure_VM_Agent_Attach_Public_IP_Failure() {
        return holder.format("Azure_VM_Agent_Attach_Public_IP_Failure");
    }

    /**
     * Key {@code Azure_VM_Agent_Attach_Public_IP_Failure}: {@code Failed to
     * attach a public IP}.
     * 
     * @return
     *     {@code Failed to attach a public IP}
     */
    public static Localizable _Azure_VM_Agent_Attach_Public_IP_Failure() {
        return new Localizable(holder, "Azure_VM_Agent_Attach_Public_IP_Failure");
    }

    /**
     * Key {@code Azure_GC_Template_Name_Not_Valid}: {@code The template name
     * is not valid.  Must begin with a letter, and contain only lowercase
     * letters, numbers, or dashes}.
     * 
     * @return
     *     {@code The template name is not valid.  Must begin with a letter, and
     *     contain only lowercase letters, numbers, or dashes}
     */
    public static String Azure_GC_Template_Name_Not_Valid() {
        return holder.format("Azure_GC_Template_Name_Not_Valid");
    }

    /**
     * Key {@code Azure_GC_Template_Name_Not_Valid}: {@code The template name
     * is not valid.  Must begin with a letter, and contain only lowercase
     * letters, numbers, or dashes}.
     * 
     * @return
     *     {@code The template name is not valid.  Must begin with a letter, and
     *     contain only lowercase letters, numbers, or dashes}
     */
    public static Localizable _Azure_GC_Template_Name_Not_Valid() {
        return new Localizable(holder, "Azure_GC_Template_Name_Not_Valid");
    }

    /**
     * Key {@code Azure_GC_Template_SA_Null_Or_Empty}: {@code The storage
     * account name is null or empty.}.
     * 
     * @return
     *     {@code The storage account name is null or empty.}
     */
    public static String Azure_GC_Template_SA_Null_Or_Empty() {
        return holder.format("Azure_GC_Template_SA_Null_Or_Empty");
    }

    /**
     * Key {@code Azure_GC_Template_SA_Null_Or_Empty}: {@code The storage
     * account name is null or empty.}.
     * 
     * @return
     *     {@code The storage account name is null or empty.}
     */
    public static Localizable _Azure_GC_Template_SA_Null_Or_Empty() {
        return new Localizable(holder, "Azure_GC_Template_SA_Null_Or_Empty");
    }

    /**
     * Key {@code Azure_GC_Template_ImageFamilyOrID_Null_Or_Empty}: {@code
     * Missing image family or image ID.}.
     * 
     * @return
     *     {@code Missing image family or image ID.}
     */
    public static String Azure_GC_Template_ImageFamilyOrID_Null_Or_Empty() {
        return holder.format("Azure_GC_Template_ImageFamilyOrID_Null_Or_Empty");
    }

    /**
     * Key {@code Azure_GC_Template_ImageFamilyOrID_Null_Or_Empty}: {@code
     * Missing image family or image ID.}.
     * 
     * @return
     *     {@code Missing image family or image ID.}
     */
    public static Localizable _Azure_GC_Template_ImageFamilyOrID_Null_Or_Empty() {
        return new Localizable(holder, "Azure_GC_Template_ImageFamilyOrID_Null_Or_Empty");
    }

    /**
     * Key {@code Azure_GC_Template_ResourceGroupName_Err}: {@code Resource
     * Group Name is invalid. Valid characters are Alphanumeric,
     * underscore(_) and hyphen(-), length 2-64 
     * Avoid having - or _ as the
     * first or last character in name.}.
     * 
     * @return
     *     {@code Resource Group Name is invalid. Valid characters are
     *     Alphanumeric, underscore(_) and hyphen(-), length 2-64 
     *     Avoid having -
     *     or _ as the first or last character in name.}
     */
    public static String Azure_GC_Template_ResourceGroupName_Err() {
        return holder.format("Azure_GC_Template_ResourceGroupName_Err");
    }

    /**
     * Key {@code Azure_GC_Template_ResourceGroupName_Err}: {@code Resource
     * Group Name is invalid. Valid characters are Alphanumeric,
     * underscore(_) and hyphen(-), length 2-64 
     * Avoid having - or _ as the
     * first or last character in name.}.
     * 
     * @return
     *     {@code Resource Group Name is invalid. Valid characters are
     *     Alphanumeric, underscore(_) and hyphen(-), length 2-64 
     *     Avoid having -
     *     or _ as the first or last character in name.}
     */
    public static Localizable _Azure_GC_Template_ResourceGroupName_Err() {
        return new Localizable(holder, "Azure_GC_Template_ResourceGroupName_Err");
    }

    /**
     * Key {@code Azure_Config_Success}: {@code Successfully verified Azure
     * configuration.}.
     * 
     * @return
     *     {@code Successfully verified Azure configuration.}
     */
    public static String Azure_Config_Success() {
        return holder.format("Azure_Config_Success");
    }

    /**
     * Key {@code Azure_Config_Success}: {@code Successfully verified Azure
     * configuration.}.
     * 
     * @return
     *     {@code Successfully verified Azure configuration.}
     */
    public static Localizable _Azure_Config_Success() {
        return new Localizable(holder, "Azure_Config_Success");
    }

    /**
     * Key {@code Azure_GC_Template_VirtualNetwork_Null_Or_Empty}: {@code
     * Missing virtual network name.}.
     * 
     * @return
     *     {@code Missing virtual network name.}
     */
    public static String Azure_GC_Template_VirtualNetwork_Null_Or_Empty() {
        return holder.format("Azure_GC_Template_VirtualNetwork_Null_Or_Empty");
    }

    /**
     * Key {@code Azure_GC_Template_VirtualNetwork_Null_Or_Empty}: {@code
     * Missing virtual network name.}.
     * 
     * @return
     *     {@code Missing virtual network name.}
     */
    public static Localizable _Azure_GC_Template_VirtualNetwork_Null_Or_Empty() {
        return new Localizable(holder, "Azure_GC_Template_VirtualNetwork_Null_Or_Empty");
    }

    /**
     * Key {@code Azure_GC_InitScript_Warn_Msg}: {@code Ensure image is
     * pre-configured with a Java runtime or provide a script to install Java
     * in headless (silent) mode. 
     * If using JNLP, see README.md for a sample
     * script.}.
     * 
     * @return
     *     {@code Ensure image is pre-configured with a Java runtime or provide a
     *     script to install Java in headless (silent) mode. 
     *     If using JNLP, see
     *     README.md for a sample script.}
     */
    public static String Azure_GC_InitScript_Warn_Msg() {
        return holder.format("Azure_GC_InitScript_Warn_Msg");
    }

    /**
     * Key {@code Azure_GC_InitScript_Warn_Msg}: {@code Ensure image is
     * pre-configured with a Java runtime or provide a script to install Java
     * in headless (silent) mode. 
     * If using JNLP, see README.md for a sample
     * script.}.
     * 
     * @return
     *     {@code Ensure image is pre-configured with a Java runtime or provide a
     *     script to install Java in headless (silent) mode. 
     *     If using JNLP, see
     *     README.md for a sample script.}
     */
    public static Localizable _Azure_GC_InitScript_Warn_Msg() {
        return new Localizable(holder, "Azure_GC_InitScript_Warn_Msg");
    }

    /**
     * Key {@code Azure_GC_Template_Val_Profile_Missing}: {@code The profile
     * configuration is missing. Configure an Azure profile first.}.
     * 
     * @return
     *     {@code The profile configuration is missing. Configure an Azure
     *     profile first.}
     */
    public static String Azure_GC_Template_Val_Profile_Missing() {
        return holder.format("Azure_GC_Template_Val_Profile_Missing");
    }

    /**
     * Key {@code Azure_GC_Template_Val_Profile_Missing}: {@code The profile
     * configuration is missing. Configure an Azure profile first.}.
     * 
     * @return
     *     {@code The profile configuration is missing. Configure an Azure
     *     profile first.}
     */
    public static Localizable _Azure_GC_Template_Val_Profile_Missing() {
        return new Localizable(holder, "Azure_GC_Template_Val_Profile_Missing");
    }

    /**
     * Key {@code Azure_GC_Template_Name_LOC_No_Match}: {@code The cloud
     * service location and the location selected do not match. Use a
     * different template or location.}.
     * 
     * @return
     *     {@code The cloud service location and the location selected do not
     *     match. Use a different template or location.}
     */
    public static String Azure_GC_Template_Name_LOC_No_Match() {
        return holder.format("Azure_GC_Template_Name_LOC_No_Match");
    }

    /**
     * Key {@code Azure_GC_Template_Name_LOC_No_Match}: {@code The cloud
     * service location and the location selected do not match. Use a
     * different template or location.}.
     * 
     * @return
     *     {@code The cloud service location and the location selected do not
     *     match. Use a different template or location.}
     */
    public static Localizable _Azure_GC_Template_Name_LOC_No_Match() {
        return new Localizable(holder, "Azure_GC_Template_Name_LOC_No_Match");
    }

    /**
     * Key {@code Azure_GC_Template_SA_Type_Null_Or_Empty}: {@code The
     * storage account type is null or empty.}.
     * 
     * @return
     *     {@code The storage account type is null or empty.}
     */
    public static String Azure_GC_Template_SA_Type_Null_Or_Empty() {
        return holder.format("Azure_GC_Template_SA_Type_Null_Or_Empty");
    }

    /**
     * Key {@code Azure_GC_Template_SA_Type_Null_Or_Empty}: {@code The
     * storage account type is null or empty.}.
     * 
     * @return
     *     {@code The storage account type is null or empty.}
     */
    public static Localizable _Azure_GC_Template_SA_Type_Null_Or_Empty() {
        return new Localizable(holder, "Azure_GC_Template_SA_Type_Null_Or_Empty");
    }

    /**
     * Key {@code Azure_GC_Template_LOC_Not_Found}: {@code The location is
     * not valid}.
     * 
     * @return
     *     {@code The location is not valid}
     */
    public static String Azure_GC_Template_LOC_Not_Found() {
        return holder.format("Azure_GC_Template_LOC_Not_Found");
    }

    /**
     * Key {@code Azure_GC_Template_LOC_Not_Found}: {@code The location is
     * not valid}.
     * 
     * @return
     *     {@code The location is not valid}
     */
    public static Localizable _Azure_GC_Template_LOC_Not_Found() {
        return new Localizable(holder, "Azure_GC_Template_LOC_Not_Found");
    }

    /**
     * Key {@code Idle_Timeout_Shutdown}: {@code Node is being
     * stopped(Deallocated) by Jenkins after idle timeout}.
     * 
     * @return
     *     {@code Node is being stopped(Deallocated) by Jenkins after idle
     *     timeout}
     */
    public static String Idle_Timeout_Shutdown() {
        return holder.format("Idle_Timeout_Shutdown");
    }

    /**
     * Key {@code Idle_Timeout_Shutdown}: {@code Node is being
     * stopped(Deallocated) by Jenkins after idle timeout}.
     * 
     * @return
     *     {@code Node is being stopped(Deallocated) by Jenkins after idle
     *     timeout}
     */
    public static Localizable _Idle_Timeout_Shutdown() {
        return new Localizable(holder, "Idle_Timeout_Shutdown");
    }

    /**
     * Key {@code Azure_GC_Template_max_VM_Err}: {@code The current number of
     * virtual machines in this Azure subscription is {0}, which is more than
     * or equal to the default value {1} 
     * .Consider increasing Max Virtual
     * Machines Limit value or delete existing virtual machines from your
     * subscription.}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code The current number of virtual machines in this Azure
     *     subscription is {0}, which is more than or equal to the default value
     *     {1} 
     *     .Consider increasing Max Virtual Machines Limit value or delete
     *     existing virtual machines from your subscription.}
     */
    public static String Azure_GC_Template_max_VM_Err(Object arg0, Object arg1) {
        return holder.format("Azure_GC_Template_max_VM_Err", arg0, arg1);
    }

    /**
     * Key {@code Azure_GC_Template_max_VM_Err}: {@code The current number of
     * virtual machines in this Azure subscription is {0}, which is more than
     * or equal to the default value {1} 
     * .Consider increasing Max Virtual
     * Machines Limit value or delete existing virtual machines from your
     * subscription.}.
     * 
     * @param arg1
     *      2nd format parameter, {@code {1}}, as {@link String#valueOf(Object)}.
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code The current number of virtual machines in this Azure
     *     subscription is {0}, which is more than or equal to the default value
     *     {1} 
     *     .Consider increasing Max Virtual Machines Limit value or delete
     *     existing virtual machines from your subscription.}
     */
    public static Localizable _Azure_GC_Template_max_VM_Err(Object arg0, Object arg1) {
        return new Localizable(holder, "Azure_GC_Template_max_VM_Err", arg0, arg1);
    }

    /**
     * Key {@code Azure_GC_Template_Null_Or_Empty}: {@code The template name
     * is null or empty.}.
     * 
     * @return
     *     {@code The template name is null or empty.}
     */
    public static String Azure_GC_Template_Null_Or_Empty() {
        return holder.format("Azure_GC_Template_Null_Or_Empty");
    }

    /**
     * Key {@code Azure_GC_Template_Null_Or_Empty}: {@code The template name
     * is null or empty.}.
     * 
     * @return
     *     {@code The template name is null or empty.}
     */
    public static Localizable _Azure_GC_Template_Null_Or_Empty() {
        return new Localizable(holder, "Azure_GC_Template_Null_Or_Empty");
    }

    /**
     * Key {@code Agent_Failed_Init_Script}: {@code The agent connected, but
     * failed its initialization script.  The node has been marked for
     * deletion.}.
     * 
     * @return
     *     {@code The agent connected, but failed its initialization script.  The
     *     node has been marked for deletion.}
     */
    public static String Agent_Failed_Init_Script() {
        return holder.format("Agent_Failed_Init_Script");
    }

    /**
     * Key {@code Agent_Failed_Init_Script}: {@code The agent connected, but
     * failed its initialization script.  The node has been marked for
     * deletion.}.
     * 
     * @return
     *     {@code The agent connected, but failed its initialization script.  The
     *     node has been marked for deletion.}
     */
    public static Localizable _Agent_Failed_Init_Script() {
        return new Localizable(holder, "Agent_Failed_Init_Script");
    }

    /**
     * Key {@code Azure_GC_Template_CS_NA}: {@code Cloud service name {0} is
     * either not available or not valid. Use a different cloud service
     * name.}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Cloud service name {0} is either not available or not valid.
     *     Use a different cloud service name.}
     */
    public static String Azure_GC_Template_CS_NA(Object arg0) {
        return holder.format("Azure_GC_Template_CS_NA", arg0);
    }

    /**
     * Key {@code Azure_GC_Template_CS_NA}: {@code Cloud service name {0} is
     * either not available or not valid. Use a different cloud service
     * name.}.
     * 
     * @param arg0
     *      1st format parameter, {@code {0}}, as {@link String#valueOf(Object)}.
     * @return
     *     {@code Cloud service name {0} is either not available or not valid.
     *     Use a different cloud service name.}
     */
    public static Localizable _Azure_GC_Template_CS_NA(Object arg0) {
        return new Localizable(holder, "Azure_GC_Template_CS_NA", arg0);
    }

    /**
     * Key {@code Azure_GC_Template_PWD_Not_Valid}: {@code Required: Not a
     * valid password. The password length must be between 12 and 123
     * characters. It also needs to have at least one digit, one lowercase,
     * one uppercase letter and one special character (
     * @#$%^&*-_!+=[]'{}'|\:`,.?/~"();' ).}.
     * 
     * @return
     *     {@code Required: Not a valid password. The password length must be
     *     between 12 and 123 characters. It also needs to have at least one
     *     digit, one lowercase, one uppercase letter and one special character (
     *     @#$%^&*-_!+=[]'{}'|\:`,.?/~"();' ).}
     */
    public static String Azure_GC_Template_PWD_Not_Valid() {
        return holder.format("Azure_GC_Template_PWD_Not_Valid");
    }

    /**
     * Key {@code Azure_GC_Template_PWD_Not_Valid}: {@code Required: Not a
     * valid password. The password length must be between 12 and 123
     * characters. It also needs to have at least one digit, one lowercase,
     * one uppercase letter and one special character (
     * @#$%^&*-_!+=[]'{}'|\:`,.?/~"();' ).}.
     * 
     * @return
     *     {@code Required: Not a valid password. The password length must be
     *     between 12 and 123 characters. It also needs to have at least one
     *     digit, one lowercase, one uppercase letter and one special character (
     *     @#$%^&*-_!+=[]'{}'|\:`,.?/~"();' ).}
     */
    public static Localizable _Azure_GC_Template_PWD_Not_Valid() {
        return new Localizable(holder, "Azure_GC_Template_PWD_Not_Valid");
    }

    /**
     * Key {@code Azure_GC_JVM_Option_Err}: {@code Error: Not a valid JVM
     * Option. JVM options should start with a hyphen(-). e.g. -Xmx1500m}.
     * 
     * @return
     *     {@code Error: Not a valid JVM Option. JVM options should start with a
     *     hyphen(-). e.g. -Xmx1500m}
     */
    public static String Azure_GC_JVM_Option_Err() {
        return holder.format("Azure_GC_JVM_Option_Err");
    }

    /**
     * Key {@code Azure_GC_JVM_Option_Err}: {@code Error: Not a valid JVM
     * Option. JVM options should start with a hyphen(-). e.g. -Xmx1500m}.
     * 
     * @return
     *     {@code Error: Not a valid JVM Option. JVM options should start with a
     *     hyphen(-). e.g. -Xmx1500m}
     */
    public static Localizable _Azure_GC_JVM_Option_Err() {
        return new Localizable(holder, "Azure_GC_JVM_Option_Err");
    }

    /**
     * Key {@code Azure_GC_Template_SA_Not_Valid}: {@code The storage account
     * name is not valid, a valid name can contain only lowercase letters and
     * numbers, and must between 3 and 24 characters.}.
     * 
     * @return
     *     {@code The storage account name is not valid, a valid name can contain
     *     only lowercase letters and numbers, and must between 3 and 24
     *     characters.}
     */
    public static String Azure_GC_Template_SA_Not_Valid() {
        return holder.format("Azure_GC_Template_SA_Not_Valid");
    }

    /**
     * Key {@code Azure_GC_Template_SA_Not_Valid}: {@code The storage account
     * name is not valid, a valid name can contain only lowercase letters and
     * numbers, and must between 3 and 24 characters.}.
     * 
     * @return
     *     {@code The storage account name is not valid, a valid name can contain
     *     only lowercase letters and numbers, and must between 3 and 24
     *     characters.}
     */
    public static Localizable _Azure_GC_Template_SA_Not_Valid() {
        return new Localizable(holder, "Azure_GC_Template_SA_Not_Valid");
    }

    /**
     * Key {@code Failed_Initial_Shutdown_Or_Delete}: {@code Node failed
     * initial shutdown/deletion.  Marking as delete, will be cleaned up
     * later.}.
     * 
     * @return
     *     {@code Node failed initial shutdown/deletion.  Marking as delete, will
     *     be cleaned up later.}
     */
    public static String Failed_Initial_Shutdown_Or_Delete() {
        return holder.format("Failed_Initial_Shutdown_Or_Delete");
    }

    /**
     * Key {@code Failed_Initial_Shutdown_Or_Delete}: {@code Node failed
     * initial shutdown/deletion.  Marking as delete, will be cleaned up
     * later.}.
     * 
     * @return
     *     {@code Node failed initial shutdown/deletion.  Marking as delete, will
     *     be cleaned up later.}
     */
    public static Localizable _Failed_Initial_Shutdown_Or_Delete() {
        return new Localizable(holder, "Failed_Initial_Shutdown_Or_Delete");
    }

    /**
     * Key {@code Azure_GC_Template_ImageID_Not_Valid}: {@code The provided
     * Image ID does not exist}.
     * 
     * @return
     *     {@code The provided Image ID does not exist}
     */
    public static String Azure_GC_Template_ImageID_Not_Valid() {
        return holder.format("Azure_GC_Template_ImageID_Not_Valid");
    }

    /**
     * Key {@code Azure_GC_Template_ImageID_Not_Valid}: {@code The provided
     * Image ID does not exist}.
     * 
     * @return
     *     {@code The provided Image ID does not exist}
     */
    public static Localizable _Azure_GC_Template_ImageID_Not_Valid() {
        return new Localizable(holder, "Azure_GC_Template_ImageID_Not_Valid");
    }

}
