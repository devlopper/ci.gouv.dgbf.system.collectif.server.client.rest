package ci.gouv.dgbf.system.collectif.server.client.rest;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;

import org.cyk.utility.service.client.SpecificController;

@ApplicationScoped
public class ResourceActivityControllerImpl extends SpecificController.AbstractImpl<ResourceActivity> implements ResourceActivityController,Serializable {

	@Override
	protected Class<ResourceActivity> getEntityClass() {
		return ResourceActivity.class;
	}

}