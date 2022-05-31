package ci.gouv.dgbf.system.collectif.server.client.rest;

import java.io.Serializable;

import javax.json.bind.annotation.JsonbProperty;

import org.cyk.utility.__kernel__.object.AbstractObject;

import ci.gouv.dgbf.system.collectif.server.api.service.AmountsDto;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter @Accessors(chain=true)
public class Amounts extends AbstractObject implements ci.gouv.dgbf.system.collectif.server.api.persistence.Amounts,Serializable {

	@JsonbProperty(value = AmountsDto.JSON_ADJUSTMENT) private Long adjustment;
	@JsonbProperty(value = AmountsDto.JSON_ADJUSTMENT_LESS_THAN_ZERO) Long adjustmentLessThanZero;
	@JsonbProperty(value = AmountsDto.JSON_ADJUSTMENT_GREATER_THAN_ZERO) Long adjustmentGreaterThanZero;
	@JsonbProperty(value = AmountsDto.JSON_EXPECTED_ADJUSTMENT) private Long expectedAdjustment;
	@JsonbProperty(value = AmountsDto.JSON_EXPECTED_ADJUSTMENT_MINUS_ADJUSTMENT) private Long expectedAdjustmentMinusAdjustment;
	@JsonbProperty(value = AmountsDto.JSON_INITIAL) private Long initial;
	@JsonbProperty(value = AmountsDto.JSON_MOVEMENT) private Long movement;
	@JsonbProperty(value = AmountsDto.JSON_MOVEMENT_INCLUDED) private Long movementIncluded;
	@JsonbProperty(value = AmountsDto.JSON_INITIAL_PLUS_MOVEMENT_INCLUDED) private Long initialPlusMovementIncluded;
	@JsonbProperty(value = AmountsDto.JSON_MOVEMENT_INCLUDED_PLUS_ADJUSTMENT) private Long movementIncludedPlusAdjustment;
	@JsonbProperty(value = AmountsDto.JSON_ACTUAL) private Long actual;
	@JsonbProperty(value = AmountsDto.JSON_ACTUAL_AT_LEGISLATIVE_ACT_DATE) private Long actualAtLegislativeActDate;
	@JsonbProperty(value = AmountsDto.JSON_ACTUAL_AT_LEGISLATIVE_ACT_DATE_PLUS_ADJUSTMENT) private Long actualAtLegislativeActDatePlusAdjustment;
	@JsonbProperty(value = AmountsDto.JSON_ACTUAL_AT_LEGISLATIVE_ACT_DATE_MINUS_MOVEMENT_INCLUDED_PLUS_ADJUSTMENT) private Long actualAtLegislativeActDateMinusMovementIncludedPlusAdjustment;
	@JsonbProperty(value = AmountsDto.JSON_ACTUAL_MINUS_MOVEMENT_INCLUDED) private Long actualMinusMovementIncluded;
	@JsonbProperty(value = AmountsDto.JSON_ACTUAL_MINUS_MOVEMENT_INCLUDED_PLUS_ADJUSTMENT) private Long actualMinusMovementIncludedPlusAdjustment;
	@JsonbProperty(value = AmountsDto.JSON_ACTUAL_PLUS_ADJUSTMENT) private Long actualPlusAdjustment;
	@JsonbProperty(value = AmountsDto.JSON_AVAILABLE) private Long available;
	@JsonbProperty(value = AmountsDto.JSON_INITIAL_PLUS_MOVEMENT_INCLUDED_PLUS_ADJUSTMENT) private Long initialPlusMovementIncludedPlusAdjustment;
	private Long availableMinusMovementIncludedPlusAdjustment;
	
	@Override
	public String toString() {
		return String.format(STRING_FORMAT, initial,movement,actual,movementIncluded,adjustment,actualPlusAdjustment,actualMinusMovementIncludedPlusAdjustment,available,availableMinusMovementIncludedPlusAdjustment);
	}
	
	private static final String STRING_FORMAT = "INI=%s|MVT=%s|ACT=%s|MVI=%s|ADJ=%s|ACT+ADJ=%s|ACT-MVI+ADJ=%s|AVA=%s|AVA-MVI+ADJ=%s";
	
	public static final String FIELD_ADJUSTMENT = "adjustment";
	public static final String FIELD_EXPECTED_ADJUSTMENT = "expectedAdjustment";
	public static final String FIELD_EXPECTED_ADJUSTMENT_MINUS_ADJUSTMENT = "expectedAdjustmentMinusAdjustment";
	public static final String FIELD_INITIAL = "initial";
	public static final String FIELD_MOVEMENT = "movement";
	public static final String FIELD_MOVEMENT_INCLUDED = "movementIncluded";
	public static final String FIELD_INITIAL_PLUS_MOVEMENT_INCLUDED = "initialPlusMovementIncluded";
	public static final String FIELD_MOVEMENT_INCLUDED_PLUS_ADJUSTMENT = "movementIncludedPlusAdjustment";
	public static final String FIELD_ACTUAL = "actual";
	public static final String FIELD_ACTUAL_AT_LEGISLATIVE_ACT_DATE = "actualAtLegislativeActDate";
	public static final String FIELD_ACTUAL_AT_LEGISLATIVE_ACT_DATE_PLUS_ADJUSTMENT = "actualAtLegislativeActDatePlusAdjustment";
	public static final String FIELD_ACTUAL_AT_LEGISLATIVE_ACT_DATE_MINUS_MOVEMENT_INCLUDED_PLUS_ADJUSTMENT = "actualAtLegislativeActDateMinusMovementIncludedPlusAdjustment";
	public static final String FIELD_ACTUAL_MINUS_MOVEMENT_INCLUDED = "actualMinusMovementIncluded";
	public static final String FIELD_ACTUAL_MINUS_MOVEMENT_INCLUDED_PLUS_ADJUSTMENT = "actualMinusMovementIncludedPlusAdjustment";
	public static final String FIELD_ACTUAL_PLUS_ADJUSTMENT = "actualPlusAdjustment";
	public static final String FIELD_AVAILABLE = "available";
	public static final String FIELD_INITIAL_PLUS_MOVEMENT_INCLUDED_PLUS_ADJUSTMENT = "initialPlusMovementIncludedPlusAdjustment";
}