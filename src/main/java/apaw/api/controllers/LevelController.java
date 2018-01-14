package apaw.api.controllers;

import apaw.api.daos.DaoFactory;
import apaw.api.entities.Level;

public class LevelController {
	
	public void createLevel(String level) {
		DaoFactory.getFactory().getLevelDao().create(new Level(level));
	}

}
