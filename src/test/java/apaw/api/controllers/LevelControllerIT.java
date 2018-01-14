package apaw.api.controllers;

import org.junit.Test;

import apaw.api.daos.DaoFactory;
import apaw.api.daos.memory.DaoMemoryFactory;

public class LevelControllerIT {
	
	private LevelController levelController;
	
	@Test
	public void testCreate() {
		
		DaoFactory.setFactory(new DaoMemoryFactory());
		levelController = new LevelController();
		levelController.createLevel("NORMAL");
		
	}

}
