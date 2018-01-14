package apaw.api.controllers;

import java.util.Optional;

import apaw.api.daos.DaoFactory;
import apaw.api.dtos.LevelDto;
import apaw.api.entities.Level;

public class LevelController {
	
	public void createLevel(String level) {
		DaoFactory.getFactory().getLevelDao().create(new Level(level));
	}
	
	private boolean existLevelId(int levelId) {
		return DaoFactory.getFactory().getLevelDao().read(levelId) != null;
	}
	
	public Optional<LevelDto> readLevel(int levelId) {
		if(existLevelId(levelId)) {
			return Optional.of(new LevelDto(DaoFactory.getFactory().getLevelDao().read(levelId)));
		}else {
			return Optional.empty();
		}
	}

}
