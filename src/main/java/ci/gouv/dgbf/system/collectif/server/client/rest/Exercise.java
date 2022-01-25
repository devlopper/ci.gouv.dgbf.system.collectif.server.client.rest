package ci.gouv.dgbf.system.collectif.server.client.rest;

import java.io.Serializable;
import java.util.Collection;

import javax.json.bind.annotation.JsonbProperty;

import org.cyk.utility.__kernel__.DependencyInjection;
import org.cyk.utility.__kernel__.collection.CollectionHelper;
import org.cyk.utility.__kernel__.object.AbstractObject;

import ci.gouv.dgbf.system.collectif.server.api.service.ExerciseDto;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter @Accessors(chain=true)
public class Exercise extends AbstractObject implements Serializable {

	@JsonbProperty(value = ExerciseDto.JSON_IDENTIFIER) private String identifier;	
	@JsonbProperty(value = ExerciseDto.JSON_CODE) private String code;	
	@JsonbProperty(value = ExerciseDto.JSON_NAME) private String name;
	@JsonbProperty(value = ExerciseDto.JSON_YEAR) private Short year;
	
	@Override
	public String toString() {
		return name;
	}
	
	public static Collection<Exercise> buildChoices() { 
		Collection<Exercise> choices = DependencyInjection.inject(ExerciseController.class).get();
		CollectionHelper.addNullAtFirstIfSizeGreaterThanOne(choices);
		return choices;
	}
}