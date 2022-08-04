package ci.gouv.dgbf.system.collectif.server.client.rest;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

import org.cyk.utility.__kernel__.collection.CollectionHelper;
import org.cyk.utility.__kernel__.field.FieldHelper;
import org.cyk.utility.__kernel__.session.SessionHelper;
import org.cyk.utility.rest.ResponseHelper;
import org.cyk.utility.service.client.SpecificController;

@ApplicationScoped
public class RegulatoryActControllerImpl extends SpecificController.AbstractImpl<RegulatoryAct> implements RegulatoryActController,Serializable {

	@Override
	public Response include(Collection<RegulatoryAct> regulatoryActs, LegislativeActVersion legislativeActVersion,Boolean existingIgnorable) {
		try {
			return RegulatoryAct.getService().include((List<String>) FieldHelper.readSystemIdentifiersAsStrings(regulatoryActs), legislativeActVersion.getIdentifier(), existingIgnorable,SessionHelper.getUserName());
		} catch (WebApplicationException exception) {
			throw new RuntimeException(ResponseHelper.getEntity(String.class, exception.getResponse()));
		}
	}

	@Override
	public Response include(LegislativeActVersion legislativeActVersion, Boolean existingIgnorable, RegulatoryAct... regulatoryActs) {
		try {
			return include(CollectionHelper.listOf(Boolean.TRUE,regulatoryActs), legislativeActVersion, existingIgnorable);
		} catch (WebApplicationException exception) {
			throw new RuntimeException(ResponseHelper.getEntity(String.class, exception.getResponse()));
		}
	}

	@Override
	public Response exclude(Collection<RegulatoryAct> regulatoryActs, LegislativeActVersion legislativeActVersion,Boolean existingIgnorable) {
		try {
			return RegulatoryAct.getService().exclude((List<String>) FieldHelper.readSystemIdentifiersAsStrings(regulatoryActs), legislativeActVersion.getIdentifier(), existingIgnorable,SessionHelper.getUserName());
		} catch (WebApplicationException exception) {
			throw new RuntimeException(ResponseHelper.getEntity(String.class, exception.getResponse()));
		}
	}

	@Override
	public Response exclude(LegislativeActVersion legislativeActVersion, Boolean existingIgnorable, RegulatoryAct... regulatoryActs) {
		try {
			return exclude(CollectionHelper.listOf(Boolean.TRUE,regulatoryActs), legislativeActVersion, existingIgnorable);
		} catch (WebApplicationException exception) {
			throw new RuntimeException(ResponseHelper.getEntity(String.class, exception.getResponse()));
		}
	}
	
	@Override
	public Response includeComprehensively(Collection<String> regulatoryActsIdentifiers,String legislativeActVersionIdentifier,String auditWho) {
		try {
			if(regulatoryActsIdentifiers == null)
				regulatoryActsIdentifiers = new ArrayList<>();
			return RegulatoryAct.getService().includeComprehensively((List<String>) regulatoryActsIdentifiers, legislativeActVersionIdentifier,auditWho);
		} catch (WebApplicationException exception) {
			throw new RuntimeException(ResponseHelper.getEntity(String.class, exception.getResponse()));
		}
	}
	
	@Override
	public Response includeComprehensively(Collection<String> regulatoryActsIdentifiers,String legislativeActVersionIdentifier) {
		return includeComprehensively((List<String>) regulatoryActsIdentifiers, legislativeActVersionIdentifier,SessionHelper.getUserName());
	}

	@Override
	public Response includeComprehensively(String legislativeActVersionIdentifier,String auditWho,String... regulatoryActsIdentifiers) {
		return includeComprehensively(CollectionHelper.listOf(Boolean.TRUE,regulatoryActsIdentifiers), legislativeActVersionIdentifier,auditWho);
	}
	
	@Override
	public Response includeComprehensively(String legislativeActVersionIdentifier,String... regulatoryActsIdentifiers) {
		return includeComprehensively(CollectionHelper.listOf(Boolean.TRUE,regulatoryActsIdentifiers), legislativeActVersionIdentifier,SessionHelper.getUserName());
	}
	
	@Override
	public Response includeComprehensively(Collection<RegulatoryAct> regulatoryActs,LegislativeActVersion legislativeActVersion) {
		return includeComprehensively(FieldHelper.readSystemIdentifiersAsStrings(regulatoryActs), legislativeActVersion == null ? null : legislativeActVersion.getIdentifier());
	}

	@Override
	public Response includeComprehensively(LegislativeActVersion legislativeActVersion,RegulatoryAct... regulatoryActs) {
		return includeComprehensively(CollectionHelper.listOf(Boolean.TRUE,regulatoryActs), legislativeActVersion);
	}
	
	@Override
	protected Class<RegulatoryAct> getEntityClass() {
		return RegulatoryAct.class;
	}
}