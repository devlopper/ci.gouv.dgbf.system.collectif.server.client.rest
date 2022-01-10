package ci.gouv.dgbf.system.collectif.server.client.rest;

import java.util.Collection;

import org.cyk.utility.service.client.SpecificController;

public interface LegislativeActVersionController extends SpecificController<LegislativeActVersion> {

	Collection<LegislativeActVersion> getByActIdentifier(String identifier);
	
}