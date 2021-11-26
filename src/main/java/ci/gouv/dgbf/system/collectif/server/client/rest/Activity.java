package ci.gouv.dgbf.system.collectif.server.client.rest;

import java.io.Serializable;

import org.cyk.utility.__kernel__.object.AbstractObject;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter @Accessors(chain=true)
public class Activity extends AbstractObject implements Serializable {

	private String identifier;
	private String code;
	private String name;
	
}