package ci.gouv.dgbf.system.collectif.server.client.rest;

import javax.json.bind.JsonbBuilder;

import org.junit.Test;

public class ClientTest {

	@Test
	public void mapExpenditureNature() {
		String string = "{\"identifiant\":\"1\",\"code\":\"c\",\"libelle\":\"v 1\"}";
		ExpenditureNature expenditureNature = JsonbBuilder.create().fromJson(string, ExpenditureNature.class);
		org.junit.Assert.assertEquals(expenditureNature.getIdentifier(), "1");
		org.junit.Assert.assertEquals(expenditureNature.getCode(), "c");
		org.junit.Assert.assertEquals(expenditureNature.getName(), "v 1");
	}
	
}