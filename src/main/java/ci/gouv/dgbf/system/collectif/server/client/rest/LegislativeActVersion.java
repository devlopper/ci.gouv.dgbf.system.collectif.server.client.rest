package ci.gouv.dgbf.system.collectif.server.client.rest;

import java.io.Serializable;

import javax.json.bind.annotation.JsonbProperty;

import org.cyk.utility.__kernel__.object.AbstractObject;

import ci.gouv.dgbf.system.collectif.server.api.service.LegislativeActVersionDto;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter @Accessors(chain=true)
public class LegislativeActVersion extends AbstractObject implements Serializable {

	@JsonbProperty(value = LegislativeActVersionDto.JSON_IDENTIFIER) private String identifier;	
	@JsonbProperty(value = LegislativeActVersionDto.JSON_CODE) private String code;	
	@JsonbProperty(value = LegislativeActVersionDto.JSON_NAME) private String name;
	@JsonbProperty(value = LegislativeActVersionDto.JSON_BUDGETARY_ACT) private LegislativeAct act;
	@JsonbProperty(value = LegislativeActVersionDto.JSON_BUDGETARY_ACT_IDENTIFIER) private String actIdentifier;
	
	@Override
	public String toString() {
		return name;
	}
}