package apaw.api.daos.memory;

import java.util.HashMap;

import apaw.api.daos.OrderDao;
import apaw.api.entities.Order;

public class OrderDaoMemory extends GenericDaoMemory<Order> implements OrderDao{
	
	public OrderDaoMemory() {
		this.setMap(new HashMap<Integer, Order>());
	}

	@Override
	protected Integer getId(Order entity) {
		return entity.getId();
	}

	@Override
	protected void setId(Order entity, Integer id) {
		entity.setId(id);	
	}

}
