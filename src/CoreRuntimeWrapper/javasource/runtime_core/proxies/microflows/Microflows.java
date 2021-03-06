// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package runtime_core.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the Runtime_Core module
	public static java.lang.String get_AdminUserName(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.String) Core.microflowCall("Runtime_Core.Get_AdminUserName").withParams(params).execute(context);
	}
	public static java.lang.String get_AdminUserRoleName(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.String) Core.microflowCall("Runtime_Core.Get_AdminUserRoleName").withParams(params).execute(context);
	}
	public static java.lang.String get_ApplicationRootURL(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.String) Core.microflowCall("Runtime_Core.Get_ApplicationRootURL").withParams(params).execute(context);
	}
	public static java.lang.Long get_ConcurrentAnonymousUsersCount(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Long) Core.microflowCall("Runtime_Core.Get_ConcurrentAnonymousUsersCount").withParams(params).execute(context);
	}
	public static java.lang.Long get_ConcurrentNamedUsersCount(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Long) Core.microflowCall("Runtime_Core.Get_ConcurrentNamedUsersCount").withParams(params).execute(context);
	}
	public static runtime_core.proxies.Core gET_Core(IContext context, system.proxies.HttpRequest _httpRequest)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("httpRequest", _httpRequest == null ? null : _httpRequest.getMendixObject());
		IMendixObject result = (IMendixObject)Core.microflowCall("Runtime_Core.GET_Core").withParams(params).execute(context);
		return result == null ? null : runtime_core.proxies.Core.initialize(context, result);
	}
	public static java.lang.String get_FileSeparator(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.String) Core.microflowCall("Runtime_Core.Get_FileSeparator").withParams(params).execute(context);
	}
	public static java.lang.String get_GuestUserRoleName(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.String) Core.microflowCall("Runtime_Core.Get_GuestUserRoleName").withParams(params).execute(context);
	}
	public static boolean get_isGuestLoginEnabled(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("Runtime_Core.Get_isGuestLoginEnabled").withParams(params).execute(context);
	}
	public static boolean get_IsInDevelopment(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Boolean) Core.microflowCall("Runtime_Core.Get_IsInDevelopment").withParams(params).execute(context);
	}
	public static java.lang.Long get_MaximumNumberConcurrentUsers(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Long) Core.microflowCall("Runtime_Core.Get_MaximumNumberConcurrentUsers").withParams(params).execute(context);
	}
	public static java.lang.String get_ModelerFileName(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.String) Core.microflowCall("Runtime_Core.Get_ModelerFileName").withParams(params).execute(context);
	}
	public static java.lang.String get_ModelVersion(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.String) Core.microflowCall("Runtime_Core.Get_ModelVersion").withParams(params).execute(context);
	}
	public static java.lang.String get_ProjectId(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.String) Core.microflowCall("Runtime_Core.Get_ProjectId").withParams(params).execute(context);
	}
	public static java.lang.String get_ResourcesPath(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.String) Core.microflowCall("Runtime_Core.Get_ResourcesPath").withParams(params).execute(context);
	}
	public static java.lang.Long get_SessionTimeout(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.Long) Core.microflowCall("Runtime_Core.Get_SessionTimeout").withParams(params).execute(context);
	}
	public static java.util.Date get_StartupDateTime(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.util.Date) Core.microflowCall("Runtime_Core.Get_StartupDateTime").withParams(params).execute(context);
	}
	public static java.lang.String get_TempPath(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		return (java.lang.String) Core.microflowCall("Runtime_Core.Get_TempPath").withParams(params).execute(context);
	}
}