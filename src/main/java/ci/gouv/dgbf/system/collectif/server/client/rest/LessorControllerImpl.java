package ci.gouv.dgbf.system.collectif.server.client.rest;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;

import org.cyk.utility.service.client.SpecificController;

@ApplicationScoped
public class LessorControllerImpl extends SpecificController.AbstractImpl<Lessor> implements LessorController,Serializable {

	@Override
	protected Class<Lessor> getEntityClass() {
		return Lessor.class;
	}

}