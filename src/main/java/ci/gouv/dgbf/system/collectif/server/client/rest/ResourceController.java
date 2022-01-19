package ci.gouv.dgbf.system.collectif.server.client.rest;

import java.util.Collection;

import javax.ws.rs.core.Response;

import org.cyk.utility.service.client.SpecificController;

public interface ResourceController extends SpecificController<Resource> {

	Response adjust(Collection<Resource> resources,String auditActor);
	Response adjust(Collection<Resource> resources);
	Response adjust(String auditActor,Resource...resources);
	Response adjust(Resource...resources);
}