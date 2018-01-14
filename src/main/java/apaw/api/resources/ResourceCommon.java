package apaw.api.resources;

import apaw.api.resources.exceptions.ProfessionalFieldInvalidException;

public class ResourceCommon {
	
	public static void validateField(String field) throws ProfessionalFieldInvalidException{
		if(field == null || field.isEmpty()) {
			throw new ProfessionalFieldInvalidException(field);
		}
	}

}
