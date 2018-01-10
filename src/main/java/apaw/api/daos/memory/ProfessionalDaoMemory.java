package apaw.api.daos.memory;

import java.util.HashMap;

import apaw.api.daos.ProfessionalDao;
import apaw.api.entities.Professional;

public class ProfessionalDaoMemory extends GenericDaoMemory<Professional> implements ProfessionalDao{
	
	public ProfessionalDaoMemory() {
		this.setMap(new HashMap<Integer, Professional>());
	}
	
	@Override
	protected int getId(Professional entity) {
		return entity.getId();
	}

	@Override
	protected void setId(Professional entity, int id) {
		entity.setId(id);		
	}

	
	
	

}
