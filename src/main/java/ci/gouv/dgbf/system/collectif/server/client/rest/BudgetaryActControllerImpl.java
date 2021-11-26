package ci.gouv.dgbf.system.collectif.server.client.rest;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;

import org.cyk.utility.service.client.SpecificController;

@ApplicationScoped
public class BudgetaryActControllerImpl extends SpecificController.AbstractImpl<BudgetaryAct> implements BudgetaryActController,Serializable {

	@Override
	protected Class<BudgetaryAct> getEntityClass() {
		return BudgetaryAct.class;
	}

}