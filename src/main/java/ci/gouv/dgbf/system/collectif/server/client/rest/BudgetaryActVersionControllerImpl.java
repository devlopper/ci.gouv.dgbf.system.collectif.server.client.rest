package ci.gouv.dgbf.system.collectif.server.client.rest;

import java.io.Serializable;
import java.util.Collection;

import javax.enterprise.context.ApplicationScoped;

import org.cyk.utility.service.client.SpecificController;

import ci.gouv.dgbf.system.collectif.server.api.persistence.Parameters;

@ApplicationScoped
public class BudgetaryActVersionControllerImpl extends SpecificController.AbstractImpl<BudgetaryActVersion> implements BudgetaryActVersionController,Serializable {

	@Override
	public Collection<BudgetaryActVersion> getByBudgetaryActIdentifier(String identifier) {
		return getByParentIdentifier(Parameters.BUDGETARY_ACT_IDENTIFIER, identifier);
	}

	@Override
	protected Class<BudgetaryActVersion> getEntityClass() {
		return BudgetaryActVersion.class;
	}

}