package apaw.api.daos.memory;

import apaw.api.daos.DaoFactory;
import apaw.api.daos.LevelDao;
import apaw.api.daos.OrderDao;
import apaw.api.daos.ProfessionalDao;

public class DaoMemoryFactory extends DaoFactory{

	private ProfessionalDao professionalDao;
	private OrderDao orderDao;
	private LevelDao levelDao;
	
	@Override
	public ProfessionalDao getProfessionalDao() {
		if(professionalDao == null) {
			professionalDao = new ProfessionalDaoMemory();
		}
		return professionalDao;
	}

	@Override
	public OrderDao getOrderDao() {
		if(orderDao == null) {
			orderDao = new OrderDaoMemory();
		}
		return orderDao;
	}

	@Override
	public LevelDao getLevelDao() {
		if(levelDao == null) {
			levelDao = new LevelDaoMemory();
		}
		return levelDao;
	}
}
