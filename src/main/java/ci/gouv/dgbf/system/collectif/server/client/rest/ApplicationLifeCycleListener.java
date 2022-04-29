package ci.gouv.dgbf.system.collectif.server.client.rest;

import java.util.HashMap;
import java.util.Map;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Initialized;
import javax.enterprise.event.Observes;
import javax.inject.Inject;

import org.cyk.utility.__kernel__.DependencyInjection;
import org.cyk.utility.__kernel__.string.StringHelper;
import org.cyk.utility.service.client.Controller;
import org.cyk.utility.service.client.Controller.GetArguments;
import org.cyk.utility.service.client.ServiceGetter;

import ci.gouv.dgbf.system.collectif.server.api.persistence.Parameters;
import ci.gouv.dgbf.system.collectif.server.api.service.ConfigurationService;

@ApplicationScoped
public class ApplicationLifeCycleListener {

	private static final Map<Class<?>,String> SCOPES_TYPES = new HashMap<>();
	@Inject ServiceGetter serviceGetter;
	
	public void onStart(@Observes @Initialized(ApplicationScoped.class) Object pointless) {
		initialize();
	}
	
	public static void initialize() {
		SCOPES_TYPES.putAll(Map.of(BudgetCategory.class,"CATEGORIE_BUDGET",Section.class,"SECTION",BudgetSpecializationUnit.class,"USB"));
		//Controller.GetArguments.PROCESSABLE_BY_USER.addAll(List.of(BudgetCategory.class,Section.class,BudgetSpecializationUnit.class));
		Controller.GetArguments.PARAMETER_NAME_USER_NAME = Parameters.USER_NAME;
		
		Controller.GetArguments.LISTENER = new Controller.GetArguments.Listener.AbstractImpl() {
			@Override
			public Boolean isProcessableByUser(GetArguments arguments, Class<?> klass) {
				//ConfigurationDto configuration = getServerConfiguration();
				String scopeType = SCOPES_TYPES.get(klass);
				if(StringHelper.isBlank(scopeType))
					return Boolean.FALSE;
				//if(Boolean.TRUE.equals(configuration.getActorVisibilitiesEnabled()))
				//	return super.isProcessableByUser(arguments, klass);
				return Boolean.TRUE.equals(DependencyInjection.inject(ServiceGetter.class).get(ConfigurationService.class).isScopeTypeVisibilityCheckable(scopeType));
			}
		};
	}
	/*
	private static ConfigurationDto getServerConfiguration() {
		//if(CONFIGURATION == null) {
			CONFIGURATION = DependencyInjection.inject(ServiceGetter.class).get(ConfigurationService.class).get();
			//LogHelper.logInfo(String.format("Server configuration has been got : %s",CONFIGURATION), ApplicationLifeCycleListener.class);
		//}
		return CONFIGURATION;
	}*/
	
	//private static ConfigurationDto CONFIGURATION;
}