package ci.gouv.dgbf.system.collectif.server.client.rest;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Initialized;
import javax.enterprise.event.Observes;

import org.cyk.utility.service.client.Controller;

import ci.gouv.dgbf.system.collectif.server.api.persistence.Parameters;

@ApplicationScoped
public class ApplicationLifeCycleListener {

	public void onStart(@Observes @Initialized(ApplicationScoped.class) Object pointless) {
		//DependencyInjection.setQualifiersClasses(ci.gouv.dgbf.system.collectif.server.api.System.class, SpecificServiceGetter.class);
		initialize();
	}
	
	public static void initialize() {
		Controller.GetArguments.PROCESSABLE_BY_USER.addAll(List.of(BudgetCategory.class,Section.class,BudgetSpecializationUnit.class));
		Controller.GetArguments.PARAMETER_NAME_USER_NAME = Parameters.USER_NAME;
	}
}