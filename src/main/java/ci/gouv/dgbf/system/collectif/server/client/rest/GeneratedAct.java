package ci.gouv.dgbf.system.collectif.server.client.rest;

import java.io.Serializable;

import javax.json.bind.annotation.JsonbProperty;

import org.cyk.utility.__kernel__.DependencyInjection;
import org.cyk.utility.__kernel__.object.AbstractObject;
import org.cyk.utility.service.client.SpecificServiceGetter;

import ci.gouv.dgbf.system.collectif.server.api.service.GeneratedActDto;
import ci.gouv.dgbf.system.collectif.server.api.service.GeneratedActService;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter @Accessors(chain=true)
public class GeneratedAct extends AbstractObject implements Serializable {

	@JsonbProperty(value = GeneratedActDto.JSON_IDENTIFIER) private String identifier;	
	@JsonbProperty(value = GeneratedActDto.JSON_CODE) private String code;	
	@JsonbProperty(value = GeneratedActDto.JSON_NAME) private String name;
	//@JsonbProperty(value = GeneratedActDto.JSON_YEAR) private Short year;
	//@JsonbProperty(value = GeneratedActDto.JSON_ENTRY_AUTHORIZATION_AMOUNT) private Long entryAuthorizationAmount;
	//@JsonbProperty(value = GeneratedActDto.JSON_PAYMENT_CREDIT_AMOUNT) private Long paymentCreditAmount;
	@JsonbProperty(value = GeneratedActDto.JSON___AUDIT__) private String __audit__;
	
	@Override
	public String toString() {
		return code+" "+name;
	}
	
	public static GeneratedActService getService() {
		return (GeneratedActService) DependencyInjection.inject(SpecificServiceGetter.class).get(GeneratedAct.class);
	}
	
	public static final String FIELD_IDENTIFIER = "identifier";
	public static final String FIELD_CODE = "code";
	public static final String FIELD_NAME = "name";
	//public static final String FIELD_YEAR = "year";
	//public static final String FIELD_ENTRY_AUTHORIZATION_AMOUNT = "entryAuthorizationAmount";
	//public static final String FIELD_PAYMENT_CREDIT_AMOUNT = "paymentCreditAmount";
	public static final String FIELD___AUDIT__ = "__audit__";
}