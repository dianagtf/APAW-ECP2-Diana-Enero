package apaw.api.daos.memory;

import java.util.HashMap;

import apaw.api.daos.ProfessionalDao;
import apaw.api.entities.Professional;

public class ProfessionalDaoMemory extends GenericDaoMemory<Professional> implements ProfessionalDao{
	
	public ProfessionalDaoMemory() {
		this.setMap(new HashMap<Integer, Professional>());
	}
	
	@Override
	protected Integer getId(Professional entity) {
		return entity.getId();
	}

	@Override
	protected void setId(Professional entity, Integer id) {
		entity.setId(id);		
	}

}
