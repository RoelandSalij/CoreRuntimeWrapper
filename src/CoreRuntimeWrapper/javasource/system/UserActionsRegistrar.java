package system;

import com.mendix.core.actionmanagement.IActionRegistrator;

public class UserActionsRegistrar
{
  public void registerActions(IActionRegistrator registrator)
  {
    registrator.bundleComponentLoaded();
    registrator.registerUserAction(runtime_core.actions.GetAdminUserName.class);
    registrator.registerUserAction(runtime_core.actions.GetAdminUserRoleName.class);
    registrator.registerUserAction(runtime_core.actions.GetApplicationRootURL.class);
    registrator.registerUserAction(runtime_core.actions.GetClientQueryTimeout.class);
    registrator.registerUserAction(runtime_core.actions.GetConcurrentUsersCount.class);
    registrator.registerUserAction(runtime_core.actions.GetFileSeparator.class);
    registrator.registerUserAction(runtime_core.actions.GetGuestLoginEnabled.class);
    registrator.registerUserAction(runtime_core.actions.GetGuestUserRoleName.class);
    registrator.registerUserAction(runtime_core.actions.GetMaximumNumberConcurrentUsers.class);
    registrator.registerUserAction(runtime_core.actions.GetModelerFile.class);
    registrator.registerUserAction(runtime_core.actions.GetModelVersion.class);
    registrator.registerUserAction(runtime_core.actions.GetProjectId.class);
    registrator.registerUserAction(runtime_core.actions.GetResourcesPath.class);
    registrator.registerUserAction(runtime_core.actions.GetSessionTimeout.class);
    registrator.registerUserAction(runtime_core.actions.GetStartupDateTime.class);
    registrator.registerUserAction(runtime_core.actions.GetTempPath.class);
    registrator.registerUserAction(runtime_core.actions.IsInDevelopment.class);
    registrator.registerUserAction(system.actions.VerifyPassword.class);
  }
}
