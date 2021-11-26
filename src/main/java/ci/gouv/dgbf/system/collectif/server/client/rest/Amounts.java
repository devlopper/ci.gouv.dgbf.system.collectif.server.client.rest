package ci.gouv.dgbf.system.collectif.server.client.rest;

import java.io.Serializable;

import javax.json.bind.annotation.JsonbProperty;

import org.cyk.utility.__kernel__.object.AbstractObject;

import ci.gouv.dgbf.system.collectif.server.api.service.AmountsDto;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter @Accessors(chain=true)
public class Amounts extends AbstractObject implements Serializable {

	@JsonbProperty(value = AmountsDto.JSON_ADJUSTMENT) private Long adjustment;
	@JsonbProperty(value = AmountsDto.JSON_INITIAL) private Long initial;
	@JsonbProperty(value = AmountsDto.JSON_MOVEMENT) private Long movement;
	@JsonbProperty(value = AmountsDto.JSON_MOVEMENT_INCLUDED) private Long movementIncluded;
	@JsonbProperty(value = AmountsDto.JSON_ACTUAL) private Long actual;
	@JsonbProperty(value = AmountsDto.JSON_ACTUAL_MINUS_MOVEMENT_INCLUDED) private Long actualMinusMovementIncluded;
	@JsonbProperty(value = AmountsDto.JSON_ACTUAL_MINUS_MOVEMENT_INCLUDED_PLUS_ADJUSTMENT) private Long actualMinusMovementIncludedPlusAdjustment;
	@JsonbProperty(value = AmountsDto.JSON_AVAILABLE) private Long available;
	
	public static final String FIELD_ADJUSTMENT = "adjustment";
	public static final String FIELD_INITIAL = "initial";
	public static final String FIELD_MOVEMENT = "movement";
	public static final String FIELD_MOVEMENT_INCLUDED = "movementIncluded";
	public static final String FIELD_ACTUAL = "actual";
	public static final String FIELD_ACTUAL_MINUS_MOVEMENT_INCLUDED = "actualMinusMovementIncluded";
	public static final String FIELD_ACTUAL_MINUS_MOVEMENT_INCLUDED_PLUS_ADJUSTMENT = "actualMinusMovementIncludedPlusAdjustment";
	public static final String FIELD_AVAILABLE = "available";
}