package ci.gouv.dgbf.system.collectif.server.client.rest;

import java.util.Collection;

import javax.ws.rs.core.Response;

import org.cyk.utility.service.client.SpecificController;

public interface RegulatoryActController extends SpecificController<RegulatoryAct> {

	Response include(Collection<RegulatoryAct> regulatoryActs,LegislativeActVersion legislativeActVersion,Boolean existingIgnorable);
	Response include(LegislativeActVersion legislativeActVersion,Boolean existingIgnorable,RegulatoryAct...regulatoryActs);
	
	Response exclude(Collection<RegulatoryAct> regulatoryActs,LegislativeActVersion legislativeActVersion,Boolean existingIgnorable);
	Response exclude(LegislativeActVersion legislativeActVersion,Boolean existingIgnorable,RegulatoryAct...regulatoryActs);
	
}