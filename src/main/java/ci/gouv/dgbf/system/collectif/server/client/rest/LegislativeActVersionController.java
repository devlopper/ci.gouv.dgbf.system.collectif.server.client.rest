package ci.gouv.dgbf.system.collectif.server.client.rest;

import java.util.Collection;

import javax.ws.rs.core.Response;

import org.cyk.utility.service.client.SpecificController;

public interface LegislativeActVersionController extends SpecificController<LegislativeActVersion> {

	Collection<LegislativeActVersion> getByActIdentifier(String identifier);
	
	Response create(String code,String name,Byte number,String legislativeActIdentifier);
	Response create(LegislativeActVersion legislativeActVersion);
}