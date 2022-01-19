package ci.gouv.dgbf.system.collectif.server.client.rest;

import java.io.Serializable;

import javax.json.bind.annotation.JsonbProperty;

import org.cyk.utility.__kernel__.DependencyInjection;
import org.cyk.utility.__kernel__.object.AbstractObject;
import org.cyk.utility.service.client.SpecificServiceGetter;

import ci.gouv.dgbf.system.collectif.server.api.service.ResourceDto;
import ci.gouv.dgbf.system.collectif.server.api.service.ResourceService;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter @Accessors(chain=true)
public class Resource extends AbstractObject implements Serializable {

	@JsonbProperty(value = ResourceDto.JSON_IDENTIFIER) private String identifier;	
	@JsonbProperty(value = ResourceDto.JSON_REVENUE) private Revenue revenue;	
	@JsonbProperty(value = ResourceDto.JSON_BUDGETARY_ACT_AS_STRING) private String actAsString;
	@JsonbProperty(value = ResourceDto.JSON_BUDGETARY_ACT_VERSION_AS_STRING) private String actVersionAsString;
	@JsonbProperty(value = ResourceDto.JSON_SECTION_AS_STRING) private String sectionAsString;
	@JsonbProperty(value = ResourceDto.JSON_BUDGET_SPECIALIZATION_UNIT_AS_STRING) private String budgetSpecializationUnitAsString;
	@JsonbProperty(value = ResourceDto.JSON_ACTIVITY_AS_STRING) private String activityAsString;
	@JsonbProperty(value = ResourceDto.JSON_ECONOMIC_NATURE_AS_STRING) private String economicNatureAsString;
	
	@JsonbProperty(value = ResourceDto.JSON___AUDIT__) String __audit__;
	@JsonbProperty(value = ResourceDto.JSON___AUDIT_WHO__) String __auditWho__;
	@JsonbProperty(value = ResourceDto.JSON___AUDIT_FUNCTIONALITY__) String __auditFunctionality__;
	@JsonbProperty(value = ResourceDto.JSON___AUDIT_WHAT__) String __auditWhat__;
	@JsonbProperty(value = ResourceDto.JSON___AUDIT_WHEN__) String __auditWhen__;
	
	public Revenue getRevenue(Boolean instantiateIfNull) {
		if(revenue == null && Boolean.TRUE.equals(instantiateIfNull))
			revenue = new Revenue();
		return revenue;
	}
	
	public static ResourceService getService() {
		return (ResourceService) DependencyInjection.inject(SpecificServiceGetter.class).get(Resource.class);
	}
	
	public static final String FIELD_IDENTIFIER = "identifier";
	public static final String FIELD_BUDGETARY_ACT_AS_STRING = "actAsString";
	public static final String FIELD_BUDGETARY_ACT_VERSION_AS_STRING = "actVersionAsString";
	public static final String FIELD_SECTION_AS_STRING = "sectionAsString";
	public static final String FIELD_BUDGET_SPECIALIZATION_UNIT_AS_STRING = "budgetSpecializationUnitAsString";
	public static final String FIELD_ACTIVITY_AS_STRING = "activityAsString";
	public static final String FIELD_ECONOMIC_NATURE_AS_STRING = "economicNatureAsString";
	public static final String FIELD_REVENUE = "revenue";
	public static final String FIELD___AUDIT__ = "__audit__";
	
	public static final String FIELD_REVENUE_ADJUSTMENT = "revenueAdjustment";
}