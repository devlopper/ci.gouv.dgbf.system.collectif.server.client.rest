package ci.gouv.dgbf.system.collectif.server.client.rest;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

import org.cyk.utility.__kernel__.array.ArrayHelper;
import org.cyk.utility.__kernel__.collection.CollectionHelper;
import org.cyk.utility.__kernel__.session.SessionHelper;
import org.cyk.utility.rest.ResponseHelper;
import org.cyk.utility.service.client.SpecificController;

import ci.gouv.dgbf.system.collectif.server.api.service.ResourceDto;

@ApplicationScoped
public class ResourceControllerImpl extends SpecificController.AbstractImpl<Resource> implements ResourceController,Serializable {

	@Override
	public Response adjust(Collection<Resource> resources,String auditWho) {
		try {
			return Resource.getService().adjust(mapToAjustmentsDto(resources),auditWho);
		} catch (WebApplicationException exception) {
			throw new RuntimeException(ResponseHelper.getEntity(String.class, exception.getResponse()));
		}
	}
	
	@Override
	public Response adjust(Collection<Resource> resources) {
		return adjust(resources, SessionHelper.getUserName());
	}
	
	@Override
	public Response adjust(String auditWho,Resource... resources) {
		return adjust(ArrayHelper.isEmpty(resources) ? null : CollectionHelper.listOf(Boolean.TRUE, resources),auditWho);
	}
	
	@Override
	public Response adjust(Resource... resources) {
		return adjust(ArrayHelper.isEmpty(resources) ? null : CollectionHelper.listOf(Boolean.TRUE, resources));
	}
	
	@Override
	protected Class<Resource> getEntityClass() {
		return Resource.class;
	}

	private static List<ResourceDto.AdjustmentDto> mapToAjustmentsDto(Collection<Resource> resources) {
		if(CollectionHelper.isEmpty(resources))
			return null;
		return resources.stream().map(resource -> new ResourceDto.AdjustmentDto()
				.setIdentifier(resource.getIdentifier())
				.setRevenue(resource.getRevenue() == null ? null : resource.getRevenue().getAdjustment())
				).collect(Collectors.toList());
	}
}