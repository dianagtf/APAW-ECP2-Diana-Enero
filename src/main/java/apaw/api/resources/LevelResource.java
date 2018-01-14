package apaw.api.resources;

import apaw.api.controllers.LevelController;
import apaw.api.resources.exceptions.LevelFieldInvalidException;

public class LevelResource {
	
	public static final String LEVELS = "levels";
	
	public static final String ID = "/{id}";
	
	private void validateField(String field) throws LevelFieldInvalidException{
		if(field == null || field.isEmpty()) {
			throw new LevelFieldInvalidException(field);
		}
	}

	public void createLevel(String levelName) throws LevelFieldInvalidException {
		this.validateField(levelName);
		new LevelController().createLevel(levelName);
	}
	
}
