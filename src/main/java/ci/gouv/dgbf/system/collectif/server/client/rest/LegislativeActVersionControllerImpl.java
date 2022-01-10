package ci.gouv.dgbf.system.collectif.server.client.rest;

import java.io.Serializable;
import java.util.Collection;

import javax.enterprise.context.ApplicationScoped;

import org.cyk.utility.service.client.SpecificController;

import ci.gouv.dgbf.system.collectif.server.api.persistence.Parameters;

@ApplicationScoped
public class LegislativeActVersionControllerImpl extends SpecificController.AbstractImpl<LegislativeActVersion> implements LegislativeActVersionController,Serializable {

	@Override
	public Collection<LegislativeActVersion> getByActIdentifier(String identifier) {
		return getByParentIdentifier(Parameters.LEGISLATIVE_ACT_IDENTIFIER, identifier);
	}

	@Override
	protected Class<LegislativeActVersion> getEntityClass() {
		return LegislativeActVersion.class;
	}

}