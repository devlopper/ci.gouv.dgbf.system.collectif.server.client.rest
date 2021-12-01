package ci.gouv.dgbf.system.collectif.server.client.rest;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;

import org.cyk.utility.service.client.SpecificController;

@ApplicationScoped
public class FundingSourceControllerImpl extends SpecificController.AbstractImpl<FundingSource> implements FundingSourceController,Serializable {

	@Override
	protected Class<FundingSource> getEntityClass() {
		return FundingSource.class;
	}

}