package ci.gouv.dgbf.system.collectif.server.client.rest;

import java.util.Collection;

import javax.ws.rs.core.Response;

import org.cyk.utility.persistence.query.Filter;
import org.cyk.utility.service.client.SpecificController;

public interface ExpenditureController extends SpecificController<Expenditure> {

	Response adjust(Collection<Expenditure> expenditures);
	
	Response adjustByEntryAuthorizations(Collection<Expenditure> expenditures);
	
	Response import_(String legislativeActVersionIdentifier);
	
	Response getAmountsSums(Filter.Dto filter);
}