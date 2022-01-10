package ci.gouv.dgbf.system.collectif.server.client.rest;

import java.io.Serializable;
import java.util.Collection;

import javax.json.bind.annotation.JsonbProperty;

import org.cyk.utility.__kernel__.DependencyInjection;
import org.cyk.utility.__kernel__.collection.CollectionHelper;
import org.cyk.utility.__kernel__.object.AbstractObject;

import ci.gouv.dgbf.system.collectif.server.api.service.LegislativeActDto;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter @Accessors(chain=true)
public class LegislativeAct extends AbstractObject implements Serializable {

	@JsonbProperty(value = LegislativeActDto.JSON_IDENTIFIER) private String identifier;	
	@JsonbProperty(value = LegislativeActDto.JSON_CODE) private String code;	
	@JsonbProperty(value = LegislativeActDto.JSON_NAME) private String name;
	
	public static Collection<LegislativeAct> buildChoices() { 
		Collection<LegislativeAct> choices = DependencyInjection.inject(LegislativeActController.class).get();
		CollectionHelper.addNullAtFirstIfSizeGreaterThanOne(choices);
		return choices;
	}
	
	@Override
	public String toString() {
		return name;
	}
}