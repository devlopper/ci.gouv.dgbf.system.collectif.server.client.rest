package ci.gouv.dgbf.system.collectif.server.client.rest;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;

import org.cyk.utility.service.client.SpecificController;

@ApplicationScoped
public class BudgetSpecializationUnitControllerImpl extends SpecificController.AbstractImpl<BudgetSpecializationUnit> implements BudgetSpecializationUnitController,Serializable {

	@Override
	protected Class<BudgetSpecializationUnit> getEntityClass() {
		return BudgetSpecializationUnit.class;
	}

}