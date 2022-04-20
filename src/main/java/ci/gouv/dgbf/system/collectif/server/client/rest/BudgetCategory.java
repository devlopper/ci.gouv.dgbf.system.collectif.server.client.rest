package ci.gouv.dgbf.system.collectif.server.client.rest;

import java.io.Serializable;

import javax.json.bind.annotation.JsonbProperty;

import org.cyk.utility.__kernel__.object.AbstractObject;

import ci.gouv.dgbf.system.collectif.server.api.service.BudgetCategoryDto;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter @Accessors(chain=true)
public class BudgetCategory extends AbstractObject implements Serializable {

	@JsonbProperty(value = BudgetCategoryDto.JSON_IDENTIFIER) private String identifier;	
	@JsonbProperty(value = BudgetCategoryDto.JSON_CODE) private String code;	
	@JsonbProperty(value = BudgetCategoryDto.JSON_NAME) private String name;
	
	@Override
	public String toString() {
		return name;
	}
}