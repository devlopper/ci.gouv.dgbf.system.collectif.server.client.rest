package ci.gouv.dgbf.system.collectif.server.client.rest;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;

import org.cyk.utility.service.client.SpecificController;

@ApplicationScoped
public class ActionControllerImpl extends SpecificController.AbstractImpl<Action> implements ActionController,Serializable {

	@Override
	protected Class<Action> getEntityClass() {
		return Action.class;
	}

}