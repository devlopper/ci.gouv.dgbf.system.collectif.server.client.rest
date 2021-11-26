package ci.gouv.dgbf.system.collectif.server.client.rest;

import java.util.Collection;

import org.cyk.utility.service.client.SpecificController;

public interface BudgetaryActVersionController extends SpecificController<BudgetaryActVersion> {

	Collection<BudgetaryActVersion> getByBudgetaryActIdentifier(String identifier);
	
}