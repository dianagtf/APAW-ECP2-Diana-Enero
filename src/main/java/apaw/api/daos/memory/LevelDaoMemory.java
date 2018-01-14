package apaw.api.daos.memory;

import java.util.HashMap;

import apaw.api.daos.LevelDao;
import apaw.api.entities.Level;

public class LevelDaoMemory extends GenericDaoMemory<Level> implements LevelDao {
	
	public LevelDaoMemory() {
		this.setMap(new HashMap<Integer, Level>());
	}
	
	@Override
	protected Integer getId(Level entity) {
		return entity.getId();
	}

	@Override
	protected void setId(Level entity, Integer id) {
		entity.setId(id);
	}

}
