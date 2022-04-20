package ci.gouv.dgbf.system.collectif.server.client.rest;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;

import org.cyk.utility.service.client.SpecificController;

@ApplicationScoped
public class BudgetCategoryControllerImpl extends SpecificController.AbstractImpl<BudgetCategory> implements BudgetCategoryController,Serializable {

	@Override
	protected Class<BudgetCategory> getEntityClass() {
		return BudgetCategory.class;
	}

}