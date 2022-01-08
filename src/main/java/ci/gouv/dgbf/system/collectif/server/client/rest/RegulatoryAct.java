package ci.gouv.dgbf.system.collectif.server.client.rest;

import java.io.Serializable;

import javax.json.bind.annotation.JsonbProperty;

import org.cyk.utility.__kernel__.object.AbstractObject;

import ci.gouv.dgbf.system.collectif.server.api.service.RegulatoryActDto;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter @Accessors(chain=true)
public class RegulatoryAct extends AbstractObject implements Serializable {

	@JsonbProperty(value = RegulatoryActDto.JSON_IDENTIFIER) private String identifier;	
	@JsonbProperty(value = RegulatoryActDto.JSON_CODE) private String code;	
	@JsonbProperty(value = RegulatoryActDto.JSON_NAME) private String name;
	
	@Override
	public String toString() {
		return code+" "+name;
	}
}