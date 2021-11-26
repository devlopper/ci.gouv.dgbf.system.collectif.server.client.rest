package ci.gouv.dgbf.system.collectif.server.client.rest;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;

import org.cyk.utility.service.client.SpecificController;

@ApplicationScoped
public class SectionControllerImpl extends SpecificController.AbstractImpl<Section> implements SectionController,Serializable {

	@Override
	protected Class<Section> getEntityClass() {
		return Section.class;
	}

}