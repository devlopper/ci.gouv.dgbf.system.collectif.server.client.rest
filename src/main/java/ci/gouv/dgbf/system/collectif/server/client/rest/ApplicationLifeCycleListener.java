package ci.gouv.dgbf.system.collectif.server.client.rest;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Initialized;
import javax.enterprise.event.Observes;

@ApplicationScoped
public class ApplicationLifeCycleListener {

	public void onStart(@Observes @Initialized(ApplicationScoped.class) Object pointless) {
		//DependencyInjection.setQualifiersClasses(ci.gouv.dgbf.system.collectif.server.api.System.class, SpecificServiceGetter.class);
	}
}