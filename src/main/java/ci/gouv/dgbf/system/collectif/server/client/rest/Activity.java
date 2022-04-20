package ci.gouv.dgbf.system.collectif.server.client.rest;

import java.io.Serializable;
import java.util.ArrayList;

import javax.json.bind.annotation.JsonbProperty;

import org.cyk.utility.__kernel__.object.AbstractObject;

import ci.gouv.dgbf.system.collectif.server.api.service.ActivityDto;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter @Accessors(chain=true)
public class Activity extends AbstractObject implements Serializable {

	@JsonbProperty(value = ActivityDto.JSON_IDENTIFIER) private String identifier;	
	@JsonbProperty(value = ActivityDto.JSON_CODE) private String code;	
	@JsonbProperty(value = ActivityDto.JSON_NAME) private String name;
	
	@JsonbProperty(value = ActivityDto.JSON_EXPENDITURE_NATURE) private ExpenditureNature expenditureNature;
	@JsonbProperty(value = ActivityDto.JSON_SECTION) private Section section;
	@JsonbProperty(value = ActivityDto.JSON_ADMINISTRATIVE_UNIT) private AdministrativeUnit administrativeUnit;
	@JsonbProperty(value = ActivityDto.JSON_BUDGET_CATEGORY) private BudgetCategory budgetCategory;
	@JsonbProperty(value = ActivityDto.JSON_BUDGET_SPECIALIZATION_UNIT) private BudgetSpecializationUnit budgetSpecializationUnit;
	@JsonbProperty(value = ActivityDto.JSON_ACTION) private Action action;
	
	@JsonbProperty(value = ActivityDto.JSON_ECONOMIC_NATURES) private ArrayList<EconomicNature> economicNatures;
	@JsonbProperty(value = ActivityDto.JSON_FUNDING_SOURCES) private ArrayList<FundingSource> fundingSources;
	@JsonbProperty(value = ActivityDto.JSON_LESSORS) private ArrayList<Lessor> lessors;
	
	@Override
	public String toString() {
		return code+" "+name;
	}
}