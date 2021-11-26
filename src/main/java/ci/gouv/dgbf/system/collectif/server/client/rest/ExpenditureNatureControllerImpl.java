package ci.gouv.dgbf.system.collectif.server.client.rest;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;

import org.cyk.utility.service.client.SpecificController;

@ApplicationScoped
public class ExpenditureNatureControllerImpl extends SpecificController.AbstractImpl<ExpenditureNature> implements ExpenditureNatureController,Serializable {

	@Override
	protected Class<ExpenditureNature> getEntityClass() {
		return ExpenditureNature.class;
	}

}