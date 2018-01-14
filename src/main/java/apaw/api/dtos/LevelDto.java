package apaw.api.dtos;

import apaw.api.entities.Level;

public class LevelDto {
	
	private int id;
	private String levelName;
	
	public LevelDto() {
		
	}
	
	public LevelDto(int id) {
		this.id = id;
	}
	
	public LevelDto(Level level) {
		this.id = level.getId();
		this.levelName = level.getLevel();
	}
	
	public LevelDto(int id, String levelName) {
		this.id = id;
		this.levelName = levelName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLevelName() {
		return levelName;
	}

	public void setLevelName(String levelName) {
		this.levelName = levelName;
	}
	
	@Override
	public String toString() {
		return "{\"id\":" + id + ",\"levelName\":\"" + levelName + "\"}";
	}

}
