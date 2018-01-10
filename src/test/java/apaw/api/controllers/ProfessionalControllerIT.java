package apaw.api.controllers;

import org.junit.Test;

import apaw.api.controllers.ProfessionalController;
import apaw.api.daos.DaoFactory;
import apaw.api.daos.memory.DaoMemoryFactory;

public class ProfessionalControllerIT {
	
	private ProfessionalController professionalController;
	
	@Test
	public void testCreate() {
		DaoFactory.setFactory(new DaoMemoryFactory());
		professionalController = new ProfessionalController();
		professionalController.createProfessional(11111);
	}

}
