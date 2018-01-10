package apaw.api.resources;

import apaw.api.controllers.ProfessionalController;
import apaw.api.resources.exceptions.ProfessionalFieldInvalidException;

public class ProfessionalResource {
	
	public static final String PROFESSIONALS = "professionals";
	
	public static final String PHONE = "/{phone}";
	
	public static final String PHONE_CITY = PHONE + "/city";
	
	public void createProfessional(String professionalId) throws ProfessionalFieldInvalidException{
		this.validateField(professionalId);
		new ProfessionalController().createProfessional(Integer.parseInt(professionalId));
	}
	
	private void validateField(String field) throws ProfessionalFieldInvalidException{
		if(field == null || field.isEmpty()) {
			throw new ProfessionalFieldInvalidException(field);
		}
	}

}
