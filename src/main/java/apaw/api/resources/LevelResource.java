package apaw.api.resources;

import java.util.Optional;

import apaw.api.controllers.LevelController;
import apaw.api.dtos.LevelDto;
import apaw.api.resources.exceptions.LevelFieldInvalidException;
import apaw.api.resources.exceptions.LevelIdNotFoundException;

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
	
	public LevelDto readLevel(int levelId) throws LevelIdNotFoundException{
		/**
		 * Optional: me puede devolver algo, o no (null)
		 */
		Optional <LevelDto> optional = new LevelController().readLevel(levelId);
		
		return optional.orElseThrow(() -> new LevelIdNotFoundException(Integer.toString(levelId)));
	}
	
}
