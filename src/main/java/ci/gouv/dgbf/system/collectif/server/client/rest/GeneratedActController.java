package ci.gouv.dgbf.system.collectif.server.client.rest;

import javax.ws.rs.core.Response;

import org.cyk.utility.service.client.SpecificController;

public interface GeneratedActController extends SpecificController<GeneratedAct> {

	Response generateByLegislativeActVersionIdentifier(String legislativeActVersionIdentifier,String auditWho);
	Response generateByLegislativeActVersion(LegislativeActVersion legislativeActVersion,String auditWho);
	Response generateByLegislativeActVersion(LegislativeActVersion legislativeActVersion);
	
	Response deleteByLegislativeActVersionIdentifier(String legislativeActVersionIdentifier,String auditWho);
	Response deleteByLegislativeActVersion(LegislativeActVersion legislativeActVersion,String auditWho);
	Response deleteByLegislativeActVersion(LegislativeActVersion legislativeActVersion);
}