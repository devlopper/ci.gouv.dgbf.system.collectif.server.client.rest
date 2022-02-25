package ci.gouv.dgbf.system.collectif.server.client.rest;

import java.time.LocalDate;

import javax.ws.rs.core.Response;

import org.cyk.utility.service.client.SpecificController;

public interface LegislativeActController extends SpecificController<LegislativeAct> {

	Response create(String code,String name,String exerciseIdentifier,LocalDate date);
	Response create(LegislativeAct legislativeAct);
	
	Response updateDefaultVersion(String legislativeActVersionIdentifier);
	Response updateDefaultVersion(LegislativeActVersion legislativeActVersion);
	
	Response updateInProgress(String legislativeActIdentifier,Boolean inProgress);
	Response updateInProgress(LegislativeAct legislativeAct);
}