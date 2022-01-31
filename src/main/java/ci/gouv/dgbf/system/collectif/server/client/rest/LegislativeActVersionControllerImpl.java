package ci.gouv.dgbf.system.collectif.server.client.rest;

import java.io.Serializable;
import java.util.Collection;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.core.Response;

import org.cyk.utility.__kernel__.session.SessionHelper;
import org.cyk.utility.service.client.SpecificController;

import ci.gouv.dgbf.system.collectif.server.api.persistence.Parameters;

@ApplicationScoped
public class LegislativeActVersionControllerImpl extends SpecificController.AbstractImpl<LegislativeActVersion> implements LegislativeActVersionController,Serializable {

	@Override
	public Collection<LegislativeActVersion> getByActIdentifier(String identifier) {
		return getByParentIdentifier(Parameters.LEGISLATIVE_ACT_IDENTIFIER, identifier);
	}

	@Override
	public Response create(String code, String name, Byte number, String legislativeActIdentifier) {
		return serve(new Service() {
			@Override
			public Response execute() {
				return LegislativeActVersion.getService().create(code, name, number, legislativeActIdentifier, SessionHelper.getUserName());
			}		
		});
	}

	@Override
	public Response create(LegislativeActVersion legislativeActVersion) {
		return create(legislativeActVersion == null ? null : legislativeActVersion.getCode(),legislativeActVersion == null ? null : legislativeActVersion.getName()
				,legislativeActVersion == null ? null : legislativeActVersion.getNumber(),legislativeActVersion == null || legislativeActVersion.getAct() == null? null : legislativeActVersion.getAct().getIdentifier());
	}
	
	@Override
	protected Class<LegislativeActVersion> getEntityClass() {
		return LegislativeActVersion.class;
	}
}