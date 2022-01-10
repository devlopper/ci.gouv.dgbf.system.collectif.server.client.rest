package ci.gouv.dgbf.system.collectif.server.client.rest;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;

import org.cyk.utility.service.client.SpecificController;

@ApplicationScoped
public class LegislativeActControllerImpl extends SpecificController.AbstractImpl<LegislativeAct> implements LegislativeActController,Serializable {

	@Override
	protected Class<LegislativeAct> getEntityClass() {
		return LegislativeAct.class;
	}

}