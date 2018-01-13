package apaw.api.controllers;

import java.util.Optional;

import apaw.api.daos.DaoFactory;
import apaw.api.dtos.ProfessionalDto;
import apaw.api.entities.Professional;

public class ProfessionalController {
	
	public void createProfessional(int professionalPhone) {
		DaoFactory.getFactory().getProfessionalDao().create(new Professional(professionalPhone));
	}
	
	private boolean existProfessionalPhone(int professionalPhone) {
		return DaoFactory.getFactory().getProfessionalDao().read(professionalPhone) != null;
	}
	
	public Optional<ProfessionalDto> readProfessional(int professionalPhone) {
		if(existProfessionalPhone(professionalPhone)) {
			return Optional.of(new ProfessionalDto(DaoFactory.getFactory().getProfessionalDao().read(professionalPhone)));
		}else {
			return Optional.empty();
		}
	}
}
