package apaw.api.controllers;

import org.junit.Test;

import apaw.api.daos.DaoFactory;
import apaw.api.daos.memory.DaoMemoryFactory;

public class OrderControllerIT {
	
private OrderController orderController;
	
	@Test
	public void testCreate() {
		DaoFactory.setFactory(new DaoMemoryFactory());
		orderController = new OrderController();
		orderController.createOrder(1);
	}

}
