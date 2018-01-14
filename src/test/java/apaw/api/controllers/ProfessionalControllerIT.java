package apaw.api.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import apaw.api.controllers.ProfessionalController;
import apaw.api.daos.DaoFactory;
import apaw.api.daos.memory.DaoMemoryFactory;

public class ProfessionalControllerIT {
	
	private ProfessionalController professionalController;
	
	@Before
	public void before() {
		DaoFactory.setFactory(new DaoMemoryFactory());
		
		professionalController = new ProfessionalController();
		professionalController.createProfessional(902111111);
	}
	
	@Test
	public void testCreate() {
		DaoFactory.setFactory(new DaoMemoryFactory());
		
		professionalController = new ProfessionalController();
		professionalController.createProfessional(11111);
	}

	@Test
	public void testReadProfessional() {
		assertEquals(902111111, professionalController.readProfessional(0).get().getPhone());
	}
}

