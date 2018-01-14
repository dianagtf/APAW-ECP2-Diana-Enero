package apaw.api.entities;

public class Level {
	
	private int id;
	
	private String levelName;
	
	public Level() {
		
	}
	
	public Level(String levelName) {
		this.levelName = levelName;
	}
	
	public Level(int id, String levelName) {
		this.id = id;
		this.levelName = levelName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLevel() {
		return levelName;
	}

	public void setLevel(String levelName) {
		this.levelName = levelName;
	}
	
	@Override
	public String toString() {
		//return "Level [id =" + id + ", level = " + level+ "]";
		return "{\"id\":" + id + ",\"levelName\":\"" + levelName + "\"}";
	}

}
