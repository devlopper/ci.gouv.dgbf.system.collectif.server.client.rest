package ci.gouv.dgbf.system.collectif.server.client.rest;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Initialized;
import javax.enterprise.event.Observes;
import javax.inject.Inject;

import org.cyk.utility.__kernel__.DependencyInjection;
import org.cyk.utility.__kernel__.log.LogHelper;
import org.cyk.utility.service.client.Controller;
import org.cyk.utility.service.client.Controller.GetArguments;
import org.cyk.utility.service.client.ServiceGetter;

import ci.gouv.dgbf.system.collectif.server.api.persistence.Parameters;
import ci.gouv.dgbf.system.collectif.server.api.service.ConfigurationService;
import ci.gouv.dgbf.system.collectif.server.api.service.ConfigurationService.ConfigurationDto;

@ApplicationScoped
public class ApplicationLifeCycleListener {

	@Inject ServiceGetter serviceGetter;
	
	public void onStart(@Observes @Initialized(ApplicationScoped.class) Object pointless) {
		initialize();
	}
	
	public static void initialize() {
		Controller.GetArguments.PROCESSABLE_BY_USER.addAll(List.of(BudgetCategory.class,Section.class,BudgetSpecializationUnit.class));
		Controller.GetArguments.PARAMETER_NAME_USER_NAME = Parameters.USER_NAME;
		
		Controller.GetArguments.LISTENER = new Controller.GetArguments.Listener.AbstractImpl() {
			@Override
			public Boolean isProcessableByUser(GetArguments arguments, Class<?> klass) {
				ConfigurationDto configuration = getServerConfiguration();
				if(Boolean.TRUE.equals(configuration.getActorVisibilitiesEnabled()))
					return super.isProcessableByUser(arguments, klass);
				return Boolean.FALSE;
			}
		};
	}
	
	private static ConfigurationDto getServerConfiguration() {
		if(CONFIGURATION == null) {
			CONFIGURATION = DependencyInjection.inject(ServiceGetter.class).get(ConfigurationService.class).get();
			LogHelper.logInfo(String.format("Server configuration has been got : %s",CONFIGURATION), ApplicationLifeCycleListener.class);
		}
		return CONFIGURATION;
	}
	
	private static ConfigurationDto CONFIGURATION;
}