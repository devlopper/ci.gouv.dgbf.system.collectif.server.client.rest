package ci.gouv.dgbf.system.collectif.server.client.rest;

import java.io.Serializable;

import javax.json.bind.annotation.JsonbProperty;

import org.cyk.utility.__kernel__.object.AbstractObject;

import ci.gouv.dgbf.system.collectif.server.api.service.BudgetaryActVersionDto;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter @Accessors(chain=true)
public class BudgetaryActVersion extends AbstractObject implements Serializable {

	@JsonbProperty(value = BudgetaryActVersionDto.JSON_IDENTIFIER) private String identifier;	
	@JsonbProperty(value = BudgetaryActVersionDto.JSON_CODE) private String code;	
	@JsonbProperty(value = BudgetaryActVersionDto.JSON_NAME) private String name;
	@JsonbProperty(value = BudgetaryActVersionDto.JSON_BUDGETARY_ACT) private BudgetaryAct budgetaryAct;
	@JsonbProperty(value = BudgetaryActVersionDto.JSON_BUDGETARY_ACT_IDENTIFIER) private String budgetaryActIdentifier;
	
	@Override
	public String toString() {
		return name;
	}
}