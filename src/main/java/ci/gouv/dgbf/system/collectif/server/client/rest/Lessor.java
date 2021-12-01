package ci.gouv.dgbf.system.collectif.server.client.rest;

import java.io.Serializable;

import javax.json.bind.annotation.JsonbProperty;

import org.cyk.utility.__kernel__.object.AbstractObject;

import ci.gouv.dgbf.system.collectif.server.api.service.LessorDto;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter @Accessors(chain=true)
public class Lessor extends AbstractObject implements Serializable {

	@JsonbProperty(value = LessorDto.JSON_IDENTIFIER) private String identifier;	
	@JsonbProperty(value = LessorDto.JSON_CODE) private String code;	
	@JsonbProperty(value = LessorDto.JSON_NAME) private String name;
	
	@Override
	public String toString() {
		return name;
	}
}