package apaw.api.controllers;

import apaw.api.daos.DaoFactory;
import apaw.api.entities.Professional;

public class ProfessionalController {
	
	public void createProfessional(int professionalPhone) {
		DaoFactory.getFactory().getProfessionalDao().create(new Professional(professionalPhone));
	}

}
