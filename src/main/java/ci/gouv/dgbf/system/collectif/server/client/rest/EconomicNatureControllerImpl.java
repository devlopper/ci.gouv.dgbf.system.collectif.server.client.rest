package ci.gouv.dgbf.system.collectif.server.client.rest;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;

import org.cyk.utility.service.client.SpecificController;

@ApplicationScoped
public class EconomicNatureControllerImpl extends SpecificController.AbstractImpl<EconomicNature> implements EconomicNatureController,Serializable {

	@Override
	protected Class<EconomicNature> getEntityClass() {
		return EconomicNature.class;
	}

}