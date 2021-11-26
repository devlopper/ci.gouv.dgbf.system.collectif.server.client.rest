package ci.gouv.dgbf.system.collectif.server.client.rest;

import java.io.Serializable;

import javax.json.bind.annotation.JsonbProperty;

import org.cyk.utility.__kernel__.object.AbstractObject;

import ci.gouv.dgbf.system.collectif.server.api.service.SectionDto;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter @Accessors(chain=true)
public class Section extends AbstractObject implements Serializable {

	@JsonbProperty(value = SectionDto.JSON_IDENTIFIER) private String identifier;	
	@JsonbProperty(value = SectionDto.JSON_CODE) private String code;	
	@JsonbProperty(value = SectionDto.JSON_NAME) private String name;
	
	@Override
	public String toString() {
		return code+" "+name;
	}
}