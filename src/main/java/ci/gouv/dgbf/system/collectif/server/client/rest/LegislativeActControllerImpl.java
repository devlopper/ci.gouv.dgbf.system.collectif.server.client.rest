package ci.gouv.dgbf.system.collectif.server.client.rest;

import java.io.Serializable;
import java.time.LocalDate;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.core.Response;

import org.cyk.utility.__kernel__.session.SessionHelper;
import org.cyk.utility.__kernel__.time.TimeHelper;
import org.cyk.utility.service.client.SpecificController;

@ApplicationScoped
public class LegislativeActControllerImpl extends SpecificController.AbstractImpl<LegislativeAct> implements LegislativeActController,Serializable {

	@Override
	public Response create(String code, String name, String exerciseIdentifier,LocalDate date) {
		return serve(new Service() {			
			@Override
			public Response execute() {
				return LegislativeAct.getService().create(code, name, exerciseIdentifier,date == null ? null : TimeHelper.toMillisecond(date), SessionHelper.getUserName());
			}
		});
	}
	
	@Override
	public Response create(LegislativeAct legislativeAct) {
		return create(legislativeAct == null ? null : legislativeAct.getCode(), legislativeAct == null ? null : legislativeAct.getName(), legislativeAct.getExercise() == null ? null : legislativeAct.getExercise().getIdentifier(),legislativeAct.getDate());
	}
	
	@Override
	public Response updateDefaultVersion(String legislativeActVersionIdentifier) {
		return serve(new Service() {			
			@Override
			public Response execute() {
				return LegislativeAct.getService().updateDefaultVersion(legislativeActVersionIdentifier, SessionHelper.getUserName());
			}
		});
	}
	
	@Override
	public Response updateDefaultVersion(LegislativeActVersion legislativeActVersion) {
		return updateDefaultVersion(legislativeActVersion == null ? null : legislativeActVersion.getIdentifier());
	}
	
	@Override
	public Response updateInProgress(String legislativeActIdentifier, Boolean inProgress) {
		return serve(new Service() {			
			@Override
			public Response execute() {
				return LegislativeAct.getService().updateInProgress(legislativeActIdentifier, inProgress, SessionHelper.getUserName());
			}
		});
	}
	
	@Override
	public Response updateInProgress(LegislativeAct legislativeAct) {
		return updateInProgress(legislativeAct == null ? null : legislativeAct.getIdentifier(), legislativeAct == null ? null : legislativeAct.getInProgress());
	}
	
	@Override
	protected Class<LegislativeAct> getEntityClass() {
		return LegislativeAct.class;
	}

}