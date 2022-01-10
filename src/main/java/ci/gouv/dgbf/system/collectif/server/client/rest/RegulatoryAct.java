package ci.gouv.dgbf.system.collectif.server.client.rest;

import java.io.Serializable;

import javax.json.bind.annotation.JsonbProperty;

import org.cyk.utility.__kernel__.object.AbstractObject;

import ci.gouv.dgbf.system.collectif.server.api.service.RegulatoryActDto;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter @Accessors(chain=true)
public class RegulatoryAct extends AbstractObject implements Serializable {

	@JsonbProperty(value = RegulatoryActDto.JSON_IDENTIFIER) private String identifier;	
	@JsonbProperty(value = RegulatoryActDto.JSON_CODE) private String code;	
	@JsonbProperty(value = RegulatoryActDto.JSON_NAME) private String name;
	@JsonbProperty(value = RegulatoryActDto.JSON_YEAR) private Short year;
	@JsonbProperty(value = RegulatoryActDto.JSON_ENTRY_AUTHORIZATION_AMOUNT) private Long entryAuthorizationAmount;
	@JsonbProperty(value = RegulatoryActDto.JSON_PAYMENT_CREDIT_AMOUNT) private Long paymentCreditAmount;
	@JsonbProperty(value = RegulatoryActDto.JSON_INCLUDED) private Boolean included;
	@JsonbProperty(value = RegulatoryActDto.JSON_INCLUDED_AS_STRING) private String includedAsString;
	
	@Override
	public String toString() {
		return code+" "+name;
	}
	
	public static final String FIELD_IDENTIFIER = "identifier";
	public static final String FIELD_CODE = "code";
	public static final String FIELD_NAME = "name";
	public static final String FIELD_YEAR = "year";
	public static final String FIELD_ENTRY_AUTHORIZATION_AMOUNT = "entryAuthorizationAmount";
	public static final String FIELD_PAYMENT_CREDIT_AMOUNT = "paymentCreditAmount";
	public static final String FIELD_INCLUDED = "included";
	public static final String FIELD_INCLUDED_AS_STRING = "includedAsString";
}