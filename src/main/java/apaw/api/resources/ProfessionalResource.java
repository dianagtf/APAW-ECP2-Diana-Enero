package apaw.api.resources;

import java.util.Optional;

import apaw.api.controllers.ProfessionalController;
import apaw.api.dtos.ProfessionalDto;
import apaw.api.resources.exceptions.ProfessionalFieldInvalidException;
import apaw.api.resources.exceptions.ProfessionalPhoneNotFoundException;

public class ProfessionalResource {
	
	public static final String PROFESSIONALS = "professionals";
	
	public static final String PHONE = "/{phone}";
	
	public static final String PHONE_CITY = PHONE + "/city";
	
	
	
	public void createProfessional(String professionalId) throws ProfessionalFieldInvalidException{
		ResourceCommon.validateField(professionalId);
		new ProfessionalController().createProfessional(Integer.parseInt(professionalId));
	}
	
	
	
	public ProfessionalDto readProfessional(int professionalPhone) throws ProfessionalPhoneNotFoundException{
		/**
		 * Optional: me puede devolver algo, o no (null)
		 */
		Optional <ProfessionalDto> optional = new ProfessionalController().readProfessional(professionalPhone);
		
		return optional.orElseThrow(() -> new ProfessionalPhoneNotFoundException(Integer.toString(professionalPhone)));
	}
	
	public void createProfessionalWithOrder(String professionalId, String orderId) throws ProfessionalFieldInvalidException{
		ResourceCommon.validateField(professionalId);
		ResourceCommon.validateField(orderId);
		new ProfessionalController().createProfessional(Integer.parseInt(professionalId));
	}

}
