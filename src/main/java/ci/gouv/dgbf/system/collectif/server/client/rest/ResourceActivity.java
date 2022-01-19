package ci.gouv.dgbf.system.collectif.server.client.rest;

import java.io.Serializable;
import java.util.ArrayList;

import javax.json.bind.annotation.JsonbProperty;

import org.cyk.utility.__kernel__.object.AbstractObject;

import ci.gouv.dgbf.system.collectif.server.api.service.ResourceActivityDto;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter @Accessors(chain=true)
public class ResourceActivity extends AbstractObject implements Serializable {

	@JsonbProperty(value = ResourceActivityDto.JSON_IDENTIFIER) private String identifier;	
	@JsonbProperty(value = ResourceActivityDto.JSON_CODE) private String code;	
	@JsonbProperty(value = ResourceActivityDto.JSON_NAME) private String name;
	
	@JsonbProperty(value = ResourceActivityDto.JSON_SECTION) private Section section;
	@JsonbProperty(value = ResourceActivityDto.JSON_BUDGET_SPECIALIZATION_UNIT) private BudgetSpecializationUnit budgetSpecializationUnit;
	
	@JsonbProperty(value = ResourceActivityDto.JSON_ECONOMIC_NATURES) private ArrayList<EconomicNature> economicNatures;
	
	@Override
	public String toString() {
		return code+" "+name;
	}
}