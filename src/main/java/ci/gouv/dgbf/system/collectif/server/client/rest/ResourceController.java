package ci.gouv.dgbf.system.collectif.server.client.rest;

import java.util.Collection;

import javax.ws.rs.core.Response;

import org.cyk.utility.persistence.query.Filter;
import org.cyk.utility.service.client.SpecificController;

public interface ResourceController extends SpecificController<Resource> {

	Response adjust(Collection<Resource> resources,String auditWho);
	Response adjust(Collection<Resource> resources);
	Response adjust(String auditWho,Resource...resources);
	Response adjust(Resource...resources);
	
	Response getAmountsSums(Filter.Dto filter);
}