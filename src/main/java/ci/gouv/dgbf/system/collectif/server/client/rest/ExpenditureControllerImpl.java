package ci.gouv.dgbf.system.collectif.server.client.rest;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import javax.enterprise.context.ApplicationScoped;
import javax.json.bind.JsonbBuilder;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

import org.cyk.utility.__kernel__.collection.CollectionHelper;
import org.cyk.utility.__kernel__.session.SessionHelper;
import org.cyk.utility.persistence.query.Filter;
import org.cyk.utility.rest.ResponseHelper;
import org.cyk.utility.service.client.Controller;
import org.cyk.utility.service.client.SpecificController;

import ci.gouv.dgbf.system.collectif.server.api.service.ExpenditureDto;

@ApplicationScoped
public class ExpenditureControllerImpl extends SpecificController.AbstractImpl<Expenditure> implements ExpenditureController,Serializable {

	@Override
	public Response adjust(Collection<Expenditure> expenditures) {
		try {
			return Expenditure.getService().adjust(mapToAjustmentsDto(expenditures),SessionHelper.getUserName());
		} catch (WebApplicationException exception) {
			throw new RuntimeException(ResponseHelper.getEntity(String.class, exception.getResponse()));
		}
	}
	
	@Override
	public Response adjustByEntryAuthorizations(Collection<Expenditure> expenditures) {
		try {
			return Expenditure.getService().adjustByEntryAuthorizations(mapToAjustmentsDto(expenditures),SessionHelper.getUserName());
		} catch (WebApplicationException exception) {
			throw new RuntimeException(ResponseHelper.getEntity(String.class, exception.getResponse()));
		}
	}
	
	private static List<ExpenditureDto.AdjustmentDto> mapToAjustmentsDto(Collection<Expenditure> expenditures) {
		if(CollectionHelper.isEmpty(expenditures))
			return null;
		return expenditures.stream().map(expenditure -> new ExpenditureDto.AdjustmentDto()
				.setIdentifier(expenditure.getIdentifier())
				.setEntryAuthorization(expenditure.getEntryAuthorization() == null ? null : expenditure.getEntryAuthorization().getAdjustment())
				.setPaymentCredit(expenditure.getPaymentCredit() == null ? null : expenditure.getPaymentCredit().getAdjustment())
				).collect(Collectors.toList());
	}
	
	@Override
	public Response import_(String legislativeActVersionIdentifier) {
		return serve(new Controller.Service() {			
			@Override
			public Response execute() {
				return Expenditure.getService().import_(legislativeActVersionIdentifier, SessionHelper.getUserName());
			}
		});
	}
	
	@Override
	public Response getAmountsSums(Filter.Dto filter) {
		return serve(new Controller.Service() {			
			@Override
			public Response execute() {
				return Expenditure.getService().getAmountsSums(filter == null ? null : JsonbBuilder.create().toJson(filter));
			}
		});
	}
	
	@Override
	protected Class<Expenditure> getEntityClass() {
		return Expenditure.class;
	}

}