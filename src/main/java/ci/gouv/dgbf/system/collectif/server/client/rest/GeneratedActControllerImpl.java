package ci.gouv.dgbf.system.collectif.server.client.rest;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

import org.cyk.utility.rest.ResponseHelper;
import org.cyk.utility.service.client.SpecificController;

@ApplicationScoped
public class GeneratedActControllerImpl extends SpecificController.AbstractImpl<GeneratedAct> implements GeneratedActController,Serializable {

	@Override
	public Response generateByLegislativeActVersionIdentifier(String legislativeActVersionIdentifier, String auditWho) {
		try {
			return GeneratedAct.getService().generateByLegislativeActVersionIdentifier(legislativeActVersionIdentifier, auditWho);
		} catch (WebApplicationException exception) {
			throw new RuntimeException(ResponseHelper.getEntity(String.class, exception.getResponse()));
		}
	}
	
	@Override
	public Response generateByLegislativeActVersion(LegislativeActVersion legislativeActVersion, String auditWho) {
		return generateByLegislativeActVersionIdentifier(legislativeActVersion == null ? null : legislativeActVersion.getIdentifier(), auditWho);
	}
	
	@Override
	public Response deleteByLegislativeActVersionIdentifier(String legislativeActVersionIdentifier, String auditWho) {
		try {
			return GeneratedAct.getService().deleteByLegislativeActVersionIdentifier(legislativeActVersionIdentifier, auditWho);
		} catch (WebApplicationException exception) {
			throw new RuntimeException(ResponseHelper.getEntity(String.class, exception.getResponse()));
		}
	}
	
	@Override
	public Response deleteByLegislativeActVersion(LegislativeActVersion legislativeActVersion, String auditWho) {
		return deleteByLegislativeActVersionIdentifier(legislativeActVersion == null ? null : legislativeActVersion.getIdentifier(), auditWho);
	}
	
	@Override
	protected Class<GeneratedAct> getEntityClass() {
		return GeneratedAct.class;
	}
}