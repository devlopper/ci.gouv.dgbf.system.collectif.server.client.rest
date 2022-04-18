package ci.gouv.dgbf.system.collectif.server.client.rest;

import java.io.Serializable;

import javax.json.bind.annotation.JsonbProperty;

import org.cyk.utility.__kernel__.DependencyInjection;
import org.cyk.utility.__kernel__.object.AbstractObject;
import org.cyk.utility.service.client.SpecificServiceGetter;

import ci.gouv.dgbf.system.collectif.server.api.service.ExpenditureDto;
import ci.gouv.dgbf.system.collectif.server.api.service.ExpenditureService;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter @Accessors(chain=true)
public class Expenditure extends AbstractObject implements Serializable {

	@JsonbProperty(value = ExpenditureDto.JSON_IDENTIFIER) private String identifier;	
	@JsonbProperty(value = ExpenditureDto.JSON_ENTRY_AUTHORIZATION) private EntryAuthorization entryAuthorization;	
	@JsonbProperty(value = ExpenditureDto.JSON_PAYMENT_CREDIT) private PaymentCredit paymentCredit;
	@JsonbProperty(value = ExpenditureDto.JSON_BUDGETARY_ACT_AS_STRING) private String actAsString;
	@JsonbProperty(value = ExpenditureDto.JSON_BUDGETARY_ACT_VERSION_AS_STRING) private String actVersionAsString;
	@JsonbProperty(value = ExpenditureDto.JSON_SECTION_AS_STRING) private String sectionAsString;
	@JsonbProperty(value = ExpenditureDto.JSON_NATURE_AS_STRING) private String natureAsString;
	@JsonbProperty(value = ExpenditureDto.JSON_BUDGET_SPECIALIZATION_UNIT_AS_STRING) private String budgetSpecializationUnitAsString;
	@JsonbProperty(value = ExpenditureDto.JSON_ACTION_AS_STRING) private String actionAsString;
	@JsonbProperty(value = ExpenditureDto.JSON_ACTIVITY_AS_STRING) private String activityAsString;
	@JsonbProperty(value = ExpenditureDto.JSON_ECONOMIC_NATURE_AS_STRING) private String economicNatureAsString;
	@JsonbProperty(value = ExpenditureDto.JSON_FUNDING_SOURCE_AS_STRING) private String fundingSourceAsString;
	@JsonbProperty(value = ExpenditureDto.JSON_LESSOR_AS_STRING) private String lessorAsString;
	
	@JsonbProperty(value = ExpenditureDto.JSON___AUDIT__) String __audit__;
	@JsonbProperty(value = ExpenditureDto.JSON___AUDIT_WHO__) String __auditWho__;
	@JsonbProperty(value = ExpenditureDto.JSON___AUDIT_FUNCTIONALITY__) String __auditFunctionality__;
	@JsonbProperty(value = ExpenditureDto.JSON___AUDIT_WHAT__) String __auditWhat__;
	@JsonbProperty(value = ExpenditureDto.JSON___AUDIT_WHEN__) String __auditWhen__;
	
	public EntryAuthorization getEntryAuthorization(Boolean instantiateIfNull) {
		if(entryAuthorization == null && Boolean.TRUE.equals(instantiateIfNull))
			entryAuthorization = new EntryAuthorization();
		return entryAuthorization;
	}
	
	public PaymentCredit getPaymentCredit(Boolean instantiateIfNull) {
		if(paymentCredit == null && Boolean.TRUE.equals(instantiateIfNull))
			paymentCredit = new PaymentCredit();
		return paymentCredit;
	}
	
	public Expenditure copyMovementIncluded(Expenditure expenditure) {
		if(expenditure == null)
			return this;
		getEntryAuthorization(Boolean.TRUE).copyMovementIncluded(expenditure.getEntryAuthorization());
		getPaymentCredit(Boolean.TRUE).copyMovementIncluded(expenditure.getPaymentCredit());
		return this;
	}
	
	public Expenditure computeActualMinusMovementIncludedPlusAdjustment() {
		if(entryAuthorization != null)
			entryAuthorization.computeActualMinusMovementIncludedPlusAdjustment();
		if(paymentCredit != null)
			paymentCredit.computeActualMinusMovementIncludedPlusAdjustment();
		return this;
	}
	
	public Expenditure copyAvailable(Expenditure expenditure) {
		if(expenditure == null)
			return this;
		getEntryAuthorization(Boolean.TRUE).copyAvailable(expenditure.getEntryAuthorization());
		getPaymentCredit(Boolean.TRUE).copyAvailable(expenditure.getPaymentCredit());
		return this;
	}
	
	public Expenditure computeAvailableMinusMovementIncludedPlusAdjustment() {
		if(entryAuthorization != null)
			entryAuthorization.computeAvailableMinusMovementIncludedPlusAdjustment();
		if(paymentCredit != null)
			paymentCredit.computeAvailableMinusMovementIncludedPlusAdjustment();
		return this;
	}
	
	public static ExpenditureService getService() {
		return (ExpenditureService) DependencyInjection.inject(SpecificServiceGetter.class).get(Expenditure.class);
	}
	
	public static final String FIELD_IDENTIFIER = "identifier";
	public static final String FIELD_BUDGETARY_ACT_AS_STRING = "actAsString";
	public static final String FIELD_BUDGETARY_ACT_VERSION_AS_STRING = "actVersionAsString";
	public static final String FIELD_SECTION_AS_STRING = "sectionAsString";
	public static final String FIELD_NATURE_AS_STRING = "natureAsString";
	public static final String FIELD_BUDGET_SPECIALIZATION_UNIT_AS_STRING = "budgetSpecializationUnitAsString";
	public static final String FIELD_ACTION_AS_STRING = "actionAsString";
	public static final String FIELD_ACTIVITY_AS_STRING = "activityAsString";
	public static final String FIELD_ECONOMIC_NATURE_AS_STRING = "economicNatureAsString";
	public static final String FIELD_FUNDING_SOURCE_AS_STRING = "fundingSourceAsString";
	public static final String FIELD_LESSOR_AS_STRING = "lessorAsString";
	public static final String FIELD_ENTRY_AUTHORIZATION = "entryAuthorization";
	public static final String FIELD_PAYMENT_CREDIT = "paymentCredit";
	public static final String FIELD___AUDIT__ = "__audit__";
	
	public static final String FIELD_ENTRY_AUTHORIZATION_ADJUSTMENT = "entryAuthorizationAdjustment";
	public static final String FIELD_PAYMENT_CREDIT_ADJUSTMENT = "paymentCreditAdjustment";
}