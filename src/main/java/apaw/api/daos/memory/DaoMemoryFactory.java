package apaw.api.daos.memory;

import apaw.api.daos.DaoFactory;
import apaw.api.daos.ProfessionalDao;

public class DaoMemoryFactory extends DaoFactory{

	private ProfessionalDao professionalDao;
	
	@Override
	public ProfessionalDao getProfessionalDao() {
		if(professionalDao == null) {
			professionalDao = new ProfessionalDaoMemory();
		}
		return professionalDao;
	}
}
