package ci.gouv.dgbf.system.collectif.server.client.rest;

import java.io.Serializable;

import javax.json.bind.annotation.JsonbProperty;

import org.cyk.utility.__kernel__.object.AbstractObject;

import ci.gouv.dgbf.system.collectif.server.api.service.BudgetaryActDto;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter @Accessors(chain=true)
public class BudgetaryAct extends AbstractObject implements Serializable {

	@JsonbProperty(value = BudgetaryActDto.JSON_IDENTIFIER) private String identifier;	
	@JsonbProperty(value = BudgetaryActDto.JSON_CODE) private String code;	
	@JsonbProperty(value = BudgetaryActDto.JSON_NAME) private String name;
	//@JsonbProperty(value = BudgetaryActDto.JSON_BUDGETARY_ACT_VERSIONS) private List<BudgetaryActVersion> budgetaryActVersions;
	
	@Override
	public String toString() {
		return name;
	}
}