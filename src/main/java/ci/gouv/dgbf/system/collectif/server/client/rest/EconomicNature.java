package ci.gouv.dgbf.system.collectif.server.client.rest;

import java.io.Serializable;

import javax.json.bind.annotation.JsonbProperty;

import org.cyk.utility.__kernel__.object.AbstractObject;

import ci.gouv.dgbf.system.collectif.server.api.service.EconomicNatureDto;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter @Accessors(chain=true)
public class EconomicNature extends AbstractObject implements Serializable {

	@JsonbProperty(value = EconomicNatureDto.JSON_IDENTIFIER) private String identifier;	
	@JsonbProperty(value = EconomicNatureDto.JSON_CODE) private String code;	
	@JsonbProperty(value = EconomicNatureDto.JSON_NAME) private String name;
	
	@Override
	public String toString() {
		return code+" "+name;
	}
}