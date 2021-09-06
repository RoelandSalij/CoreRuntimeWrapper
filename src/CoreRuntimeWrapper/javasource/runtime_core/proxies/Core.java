// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package runtime_core.proxies;

public class Core
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject coreMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Runtime_Core.Core";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		ConcurrentAnonymousUsersCount("ConcurrentAnonymousUsersCount"),
		ConcurrentNamedUsersCount("ConcurrentNamedUsersCount"),
		MaximumNumberConcurrentUsers("MaximumNumberConcurrentUsers"),
		ModelVersion("ModelVersion"),
		ProjectId("ProjectId"),
		StartupDateTime("StartupDateTime"),
		IsInDevelopment("IsInDevelopment"),
		CoreConfiguration_Core("Runtime_Core.CoreConfiguration_Core");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public Core(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Runtime_Core.Core"));
	}

	protected Core(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject coreMendixObject)
	{
		if (coreMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Runtime_Core.Core", coreMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Runtime_Core.Core");

		this.coreMendixObject = coreMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Core.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static runtime_core.proxies.Core initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return runtime_core.proxies.Core.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static runtime_core.proxies.Core initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new runtime_core.proxies.Core(context, mendixObject);
	}

	public static runtime_core.proxies.Core load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return runtime_core.proxies.Core.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of ConcurrentAnonymousUsersCount
	 */
	public final java.lang.Long getConcurrentAnonymousUsersCount()
	{
		return getConcurrentAnonymousUsersCount(getContext());
	}

	/**
	 * @param context
	 * @return value of ConcurrentAnonymousUsersCount
	 */
	public final java.lang.Long getConcurrentAnonymousUsersCount(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.ConcurrentAnonymousUsersCount.toString());
	}

	/**
	 * Set value of ConcurrentAnonymousUsersCount
	 * @param concurrentanonymoususerscount
	 */
	public final void setConcurrentAnonymousUsersCount(java.lang.Long concurrentanonymoususerscount)
	{
		setConcurrentAnonymousUsersCount(getContext(), concurrentanonymoususerscount);
	}

	/**
	 * Set value of ConcurrentAnonymousUsersCount
	 * @param context
	 * @param concurrentanonymoususerscount
	 */
	public final void setConcurrentAnonymousUsersCount(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long concurrentanonymoususerscount)
	{
		getMendixObject().setValue(context, MemberNames.ConcurrentAnonymousUsersCount.toString(), concurrentanonymoususerscount);
	}

	/**
	 * @return value of ConcurrentNamedUsersCount
	 */
	public final java.lang.Long getConcurrentNamedUsersCount()
	{
		return getConcurrentNamedUsersCount(getContext());
	}

	/**
	 * @param context
	 * @return value of ConcurrentNamedUsersCount
	 */
	public final java.lang.Long getConcurrentNamedUsersCount(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.ConcurrentNamedUsersCount.toString());
	}

	/**
	 * Set value of ConcurrentNamedUsersCount
	 * @param concurrentnameduserscount
	 */
	public final void setConcurrentNamedUsersCount(java.lang.Long concurrentnameduserscount)
	{
		setConcurrentNamedUsersCount(getContext(), concurrentnameduserscount);
	}

	/**
	 * Set value of ConcurrentNamedUsersCount
	 * @param context
	 * @param concurrentnameduserscount
	 */
	public final void setConcurrentNamedUsersCount(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long concurrentnameduserscount)
	{
		getMendixObject().setValue(context, MemberNames.ConcurrentNamedUsersCount.toString(), concurrentnameduserscount);
	}

	/**
	 * @return value of MaximumNumberConcurrentUsers
	 */
	public final java.lang.Long getMaximumNumberConcurrentUsers()
	{
		return getMaximumNumberConcurrentUsers(getContext());
	}

	/**
	 * @param context
	 * @return value of MaximumNumberConcurrentUsers
	 */
	public final java.lang.Long getMaximumNumberConcurrentUsers(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.MaximumNumberConcurrentUsers.toString());
	}

	/**
	 * Set value of MaximumNumberConcurrentUsers
	 * @param maximumnumberconcurrentusers
	 */
	public final void setMaximumNumberConcurrentUsers(java.lang.Long maximumnumberconcurrentusers)
	{
		setMaximumNumberConcurrentUsers(getContext(), maximumnumberconcurrentusers);
	}

	/**
	 * Set value of MaximumNumberConcurrentUsers
	 * @param context
	 * @param maximumnumberconcurrentusers
	 */
	public final void setMaximumNumberConcurrentUsers(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long maximumnumberconcurrentusers)
	{
		getMendixObject().setValue(context, MemberNames.MaximumNumberConcurrentUsers.toString(), maximumnumberconcurrentusers);
	}

	/**
	 * @return value of ModelVersion
	 */
	public final java.lang.String getModelVersion()
	{
		return getModelVersion(getContext());
	}

	/**
	 * @param context
	 * @return value of ModelVersion
	 */
	public final java.lang.String getModelVersion(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ModelVersion.toString());
	}

	/**
	 * Set value of ModelVersion
	 * @param modelversion
	 */
	public final void setModelVersion(java.lang.String modelversion)
	{
		setModelVersion(getContext(), modelversion);
	}

	/**
	 * Set value of ModelVersion
	 * @param context
	 * @param modelversion
	 */
	public final void setModelVersion(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String modelversion)
	{
		getMendixObject().setValue(context, MemberNames.ModelVersion.toString(), modelversion);
	}

	/**
	 * @return value of ProjectId
	 */
	public final java.lang.String getProjectId()
	{
		return getProjectId(getContext());
	}

	/**
	 * @param context
	 * @return value of ProjectId
	 */
	public final java.lang.String getProjectId(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ProjectId.toString());
	}

	/**
	 * Set value of ProjectId
	 * @param projectid
	 */
	public final void setProjectId(java.lang.String projectid)
	{
		setProjectId(getContext(), projectid);
	}

	/**
	 * Set value of ProjectId
	 * @param context
	 * @param projectid
	 */
	public final void setProjectId(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String projectid)
	{
		getMendixObject().setValue(context, MemberNames.ProjectId.toString(), projectid);
	}

	/**
	 * @return value of StartupDateTime
	 */
	public final java.util.Date getStartupDateTime()
	{
		return getStartupDateTime(getContext());
	}

	/**
	 * @param context
	 * @return value of StartupDateTime
	 */
	public final java.util.Date getStartupDateTime(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.StartupDateTime.toString());
	}

	/**
	 * Set value of StartupDateTime
	 * @param startupdatetime
	 */
	public final void setStartupDateTime(java.util.Date startupdatetime)
	{
		setStartupDateTime(getContext(), startupdatetime);
	}

	/**
	 * Set value of StartupDateTime
	 * @param context
	 * @param startupdatetime
	 */
	public final void setStartupDateTime(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date startupdatetime)
	{
		getMendixObject().setValue(context, MemberNames.StartupDateTime.toString(), startupdatetime);
	}

	/**
	 * @return value of IsInDevelopment
	 */
	public final java.lang.Boolean getIsInDevelopment()
	{
		return getIsInDevelopment(getContext());
	}

	/**
	 * @param context
	 * @return value of IsInDevelopment
	 */
	public final java.lang.Boolean getIsInDevelopment(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IsInDevelopment.toString());
	}

	/**
	 * Set value of IsInDevelopment
	 * @param isindevelopment
	 */
	public final void setIsInDevelopment(java.lang.Boolean isindevelopment)
	{
		setIsInDevelopment(getContext(), isindevelopment);
	}

	/**
	 * Set value of IsInDevelopment
	 * @param context
	 * @param isindevelopment
	 */
	public final void setIsInDevelopment(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean isindevelopment)
	{
		getMendixObject().setValue(context, MemberNames.IsInDevelopment.toString(), isindevelopment);
	}

	/**
	 * @return value of CoreConfiguration_Core
	 */
	public final runtime_core.proxies.CoreConfiguration getCoreConfiguration_Core() throws com.mendix.core.CoreException
	{
		return getCoreConfiguration_Core(getContext());
	}

	/**
	 * @param context
	 * @return value of CoreConfiguration_Core
	 */
	public final runtime_core.proxies.CoreConfiguration getCoreConfiguration_Core(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		runtime_core.proxies.CoreConfiguration result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.CoreConfiguration_Core.toString());
		if (identifier != null)
			result = runtime_core.proxies.CoreConfiguration.load(context, identifier);
		return result;
	}

	/**
	 * Set value of CoreConfiguration_Core
	 * @param coreconfiguration_core
	 */
	public final void setCoreConfiguration_Core(runtime_core.proxies.CoreConfiguration coreconfiguration_core)
	{
		setCoreConfiguration_Core(getContext(), coreconfiguration_core);
	}

	/**
	 * Set value of CoreConfiguration_Core
	 * @param context
	 * @param coreconfiguration_core
	 */
	public final void setCoreConfiguration_Core(com.mendix.systemwideinterfaces.core.IContext context, runtime_core.proxies.CoreConfiguration coreconfiguration_core)
	{
		if (coreconfiguration_core == null)
			getMendixObject().setValue(context, MemberNames.CoreConfiguration_Core.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.CoreConfiguration_Core.toString(), coreconfiguration_core.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return coreMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final runtime_core.proxies.Core that = (runtime_core.proxies.Core) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "Runtime_Core.Core";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
