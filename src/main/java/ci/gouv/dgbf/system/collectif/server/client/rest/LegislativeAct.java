package ci.gouv.dgbf.system.collectif.server.client.rest;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Collection;

import javax.json.bind.annotation.JsonbProperty;

import org.cyk.utility.__kernel__.DependencyInjection;
import org.cyk.utility.__kernel__.collection.CollectionHelper;
import org.cyk.utility.__kernel__.object.AbstractObject;
import org.cyk.utility.service.client.Controller;
import org.cyk.utility.service.client.SpecificServiceGetter;

import ci.gouv.dgbf.system.collectif.server.api.service.LegislativeActDto;
import ci.gouv.dgbf.system.collectif.server.api.service.LegislativeActService;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter @Accessors(chain=true)
public class LegislativeAct extends AbstractObject implements Serializable {

	@JsonbProperty(value = LegislativeActDto.JSON_IDENTIFIER) private String identifier;	
	@JsonbProperty(value = LegislativeActDto.JSON_CODE) private String code;	
	@JsonbProperty(value = LegislativeActDto.JSON_NAME) private String name;	
	private LocalDate date;
	@JsonbProperty(value = LegislativeActDto.JSON_DATE_AS_TIMESTAMP) private Long dateAsTimestamp;
	@JsonbProperty(value = LegislativeActDto.JSON_DATE_AS_STRING) private String dateAsString;
	@JsonbProperty(value = LegislativeActDto.JSON_NUMBER) private Byte number;
	@JsonbProperty(value = LegislativeActDto.JSON_EXERCISE) private Exercise exercise;
	@JsonbProperty(value = LegislativeActDto.JSON_EXERCISE_YEAR) private Short exerciseYear;
	@JsonbProperty(value = LegislativeActDto.JSON_EXERCISE_AS_STRING) private String exerciseAsString;
	@JsonbProperty(value = LegislativeActDto.JSON_DEFAULT_VERSION_IDENTIFIER) private String defaultVersionIdentifier;
	@JsonbProperty(value = LegislativeActDto.JSON_DEFAULT_VERSION_AS_STRING) private String defaultVersionAsString;
	@JsonbProperty(value = LegislativeActDto.JSON_IN_PROGRESS) private Boolean inProgress;
	@JsonbProperty(value = LegislativeActDto.JSON_IN_PROGRESS_AS_STRING) private String inProgressAsString;
	@JsonbProperty(value = LegislativeActDto.JSON___AUDIT__) private String __audit__;
	@JsonbProperty(value = LegislativeActDto.JSON_ENTRY_AUTHORIZATION) private EntryAuthorization entryAuthorization;
	@JsonbProperty(value = LegislativeActDto.JSON_PAYMENT_CREDIT) private PaymentCredit paymentCredit;
	
	@Override
	public String toString() {
		return name;
	}
	
	public static Collection<LegislativeAct> buildChoices() { 
		Collection<LegislativeAct> choices = DependencyInjection.inject(LegislativeActController.class).get(new Controller.GetArguments().projections(LegislativeActDto.JSON_IDENTIFIER,LegislativeActDto.JSON_CODE,LegislativeActDto.JSON_NAME
				,LegislativeActDto.JSON_DATE_AS_TIMESTAMP));
		CollectionHelper.addNullAtFirstIfSizeGreaterThanOne(choices);
		return choices;
	}
	
	public static LegislativeActService getService() {
		return (LegislativeActService) DependencyInjection.inject(SpecificServiceGetter.class).get(LegislativeAct.class);
	}
	
	public static final String FIELD_IDENTIFIER = "identifier";
	public static final String FIELD_CODE = "code";
	public static final String FIELD_NAME = "name";
	public static final String FIELD_NUMBER = "number";
	public static final String FIELD_DATE = "date";
	public static final String FIELD_DATE_AS_STRING = "dateAsString";
	public static final String FIELD_IN_PROGRESS = "inProgress";
	public static final String FIELD_IN_PROGRESS_AS_STRING = "inProgressAsString";
	public static final String FIELD_EXERCISE = "exercise";
	public static final String FIELD_EXERCISE_YEAR = "exerciseYear";
	public static final String FIELD_EXERCISE_AS_STRING = "exerciseAsString";
	public static final String FIELD_DEFAULT_VERSION_AS_STRING = "defaultVersionAsString";
	public static final String FIELD_ENTRY_AUTHORIZATION = "entryAuthorization";
	public static final String FIELD_PAYMENT_CREDIT = "paymentCredit";
	public static final String FIELD___AUDIT__ = "__audit__";
}