package ci.gouv.dgbf.system.collectif.server.client.rest;

import java.util.Collection;

import javax.ws.rs.core.Response;

import org.cyk.utility.service.client.SpecificController;

public interface RegulatoryActController extends SpecificController<RegulatoryAct> {

	Response include(Collection<RegulatoryAct> regulatoryActs,LegislativeActVersion legislativeActVersion,Boolean existingIgnorable);
	Response include(LegislativeActVersion legislativeActVersion,Boolean existingIgnorable,RegulatoryAct...regulatoryActs);
	
	Response exclude(Collection<RegulatoryAct> regulatoryActs,LegislativeActVersion legislativeActVersion,Boolean existingIgnorable);
	Response exclude(LegislativeActVersion legislativeActVersion,Boolean existingIgnorable,RegulatoryAct...regulatoryActs);
	
	Response includeComprehensively(Collection<RegulatoryAct> regulatoryActs,LegislativeActVersion legislativeActVersion);
	Response includeComprehensively(LegislativeActVersion legislativeActVersion,RegulatoryAct...regulatoryActs);
	
	Response includeComprehensively(Collection<String> regulatoryActsIdentifiers,String legislativeActVersionIdentifier,String auditWho);
	Response includeComprehensively(Collection<String> regulatoryActsIdentifiers,String legislativeActVersionIdentifier);
	Response includeComprehensively(String legislativeActVersionIdentifier,String auditWho,String...regulatoryActsIdentifiers);
	Response includeComprehensively(String legislativeActVersionIdentifier,String...regulatoryActsIdentifiers);
}