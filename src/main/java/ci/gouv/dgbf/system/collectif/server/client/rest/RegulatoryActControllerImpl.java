package ci.gouv.dgbf.system.collectif.server.client.rest;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;

import org.cyk.utility.service.client.SpecificController;

@ApplicationScoped
public class RegulatoryActControllerImpl extends SpecificController.AbstractImpl<RegulatoryAct> implements RegulatoryActController,Serializable {

	@Override
	protected Class<RegulatoryAct> getEntityClass() {
		return RegulatoryAct.class;
	}

}