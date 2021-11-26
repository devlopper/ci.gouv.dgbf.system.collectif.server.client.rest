package ci.gouv.dgbf.system.collectif.server.client.rest;

import java.io.Serializable;

import javax.json.bind.annotation.JsonbProperty;

import org.cyk.utility.__kernel__.object.AbstractObject;

import ci.gouv.dgbf.system.collectif.server.api.service.ExpenditureNatureDto;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter @Accessors(chain=true)
public class ExpenditureNature extends AbstractObject implements Serializable {

	@JsonbProperty(value = ExpenditureNatureDto.JSON_IDENTIFIER) private String identifier;
	@JsonbProperty(value = ExpenditureNatureDto.JSON_CODE) private String code;
	@JsonbProperty(value = ExpenditureNatureDto.JSON_NAME) private String name;
	
	public Boolean isInvestment() {
		return null;
	}
	
	@Override
	public String toString() {
		return code+" "+name;
	}
}