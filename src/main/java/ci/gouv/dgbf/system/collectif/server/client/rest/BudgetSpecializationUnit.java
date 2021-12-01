package ci.gouv.dgbf.system.collectif.server.client.rest;

import java.io.Serializable;

import javax.json.bind.annotation.JsonbProperty;

import org.cyk.utility.__kernel__.object.AbstractObject;

import ci.gouv.dgbf.system.collectif.server.api.service.BudgetSpecializationUnitDto;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter @Accessors(chain=true)
public class BudgetSpecializationUnit extends AbstractObject implements Serializable {

	@JsonbProperty(value = BudgetSpecializationUnitDto.JSON_IDENTIFIER) private String identifier;	
	@JsonbProperty(value = BudgetSpecializationUnitDto.JSON_CODE) private String code;	
	@JsonbProperty(value = BudgetSpecializationUnitDto.JSON_NAME) private String name;
	
	private Section section;
	
	@Override
	public String toString() {
		return code+" "+name;
	}
}