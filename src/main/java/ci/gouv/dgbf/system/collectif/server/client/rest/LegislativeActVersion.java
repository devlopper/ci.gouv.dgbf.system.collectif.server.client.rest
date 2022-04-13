package ci.gouv.dgbf.system.collectif.server.client.rest;

import java.io.Serializable;
import java.time.LocalDate;

import javax.json.bind.annotation.JsonbProperty;

import org.cyk.utility.__kernel__.DependencyInjection;
import org.cyk.utility.__kernel__.object.AbstractObject;
import org.cyk.utility.__kernel__.time.TimeHelper;
import org.cyk.utility.service.client.SpecificServiceGetter;

import ci.gouv.dgbf.system.collectif.server.api.service.LegislativeActVersionDto;
import ci.gouv.dgbf.system.collectif.server.api.service.LegislativeActVersionService;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter @Accessors(chain=true)
public class LegislativeActVersion extends AbstractObject implements Serializable {

	@JsonbProperty(value = LegislativeActVersionDto.JSON_IDENTIFIER) private String identifier;	
	@JsonbProperty(value = LegislativeActVersionDto.JSON_CODE) private String code;	
	@JsonbProperty(value = LegislativeActVersionDto.JSON_NAME) private String name;
	@JsonbProperty(value = LegislativeActVersionDto.JSON_NUMBER) private Byte number;
	@JsonbProperty(value = LegislativeActVersionDto.JSON_IS_DEFAULT_VERSION) private Boolean isDefaultVersion;
	@JsonbProperty(value = LegislativeActVersionDto.JSON_IS_DEFAULT_VERSION_AS_STRING) private String isDefaultVersionAsString;
	@JsonbProperty(value = LegislativeActVersionDto.JSON_LEGISLATIVE_ACT) private LegislativeAct act;
	@JsonbProperty(value = LegislativeActVersionDto.JSON_LEGISLATIVE_ACT_IDENTIFIER) private String actIdentifier;
	@JsonbProperty(value = LegislativeActVersionDto.JSON_LEGISLATIVE_ACT_DATE_AS_TIMESTAMP) private Long actDateAsTimestamp;
	private LocalDate actDate;
	@JsonbProperty(value = LegislativeActVersionDto.JSON_LEGISLATIVE_ACT_FROM_DATE_AS_TIMESTAMP) private Long actFromDateAsTimestamp;
	private LocalDate actFromDate;
	@JsonbProperty(value = LegislativeActVersionDto.JSON_LEGISLATIVE_ACT_AS_STRING) private String actAsString;
	@JsonbProperty(value = LegislativeActVersionDto.JSON_GENERATED_ACT_COUNT) private Short generatedActCount;
	@JsonbProperty(value = LegislativeActVersionDto.JSON_ACT_GENERATABLE) private Boolean actGeneratable;
	@JsonbProperty(value = LegislativeActVersionDto.JSON_ACT_GENERATABLE_AS_STRING) private String actGeneratableAsString;
	@JsonbProperty(value = LegislativeActVersionDto.JSON_GENERATED_ACT_DELETABLE) private Boolean generatedActDeletable;
	@JsonbProperty(value = LegislativeActVersionDto.JSON_GENERATED_ACT_DELETABLE_AS_STRING) private String generatedActDeletableAsString;
	@JsonbProperty(value = LegislativeActVersionDto.JSON_ENTRY_AUTHORIZATION) private EntryAuthorization entryAuthorization;
	@JsonbProperty(value = LegislativeActVersionDto.JSON_PAYMENT_CREDIT) private PaymentCredit paymentCredit;
	@JsonbProperty(value = LegislativeActVersionDto.JSON_REVENUE) private Revenue revenue;
	@JsonbProperty(value = LegislativeActVersionDto.JSON___AUDIT__) String __audit__;
	
	public LocalDate getActDateFromTimestampIfNull() {
		if(actDate == null && actDateAsTimestamp != null)
			actDate = TimeHelper.getLocalDateFromMilliseconds(actDateAsTimestamp);
		return actDate;	
	}
	
	public LocalDate getFromActDateFromTimestampIfNull() {
		if(actFromDate == null && actFromDateAsTimestamp != null)
			actFromDate = TimeHelper.getLocalDateFromMilliseconds(actFromDateAsTimestamp);
		return actFromDate;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	public static LegislativeActVersionService getService() {
		return (LegislativeActVersionService) DependencyInjection.inject(SpecificServiceGetter.class).get(LegislativeActVersion.class);
	}
	
	public static final String FIELD_IDENTIFIER = "identifier";
	public static final String FIELD_CODE = "code";
	public static final String FIELD_NAME = "name";
	public static final String FIELD_NUMBER = "number";
	public static final String FIELD_IS_DEFAULT_VERSION = "isDefaultVersion";
	public static final String FIELD_IS_DEFAULT_VERSION_AS_STRING = "isDefaultVersionAsString";
	public static final String FIELD_ACT = "act";
	public static final String FIELD_ACT_AS_STRING = "actAsString";
	public static final String FIELD_ACT_IDENTIFIER = "actIdentifier";
	public static final String FIELD_GENERATED_ACT_COUNT = "generatedActCount";
	public static final String FIELD_ACT_GENERATABLE = "actGeneratable";
	public static final String FIELD_ACT_GENERATABLE_AS_STRING = "actGeneratableAsString";
	public static final String FIELD_GENERATED_ACT_DELETABLE = "generatedActDeletable";
	public static final String FIELD_GENERATED_ACT_DELETABLE_AS_STRING = "generatedActDeletableAsString";
	public static final String FIELD___AUDIT__ = "__audit__";
}