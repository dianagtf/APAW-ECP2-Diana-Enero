package apaw.api.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import apaw.api.daos.DaoFactory;
import apaw.api.daos.memory.DaoMemoryFactory;

public class OrderControllerIT {
	
	private OrderController orderController;
	
	@Before
	public void before() {
		DaoFactory.setFactory(new DaoMemoryFactory());
		
		orderController = new OrderController();
		orderController.createOrder(1024);
	}

	@Test
	public void testCreate() {
		DaoFactory.setFactory(new DaoMemoryFactory());
		orderController = new OrderController();
		orderController.createOrder(111);
		
		System.out.println(orderController.readOrder(0));
	}
	
	@Test
	public void testReadOrder() {
		assertEquals(1024, orderController.readOrder(0).get().getAmount());
		assertEquals(0, orderController.readOrder(0).get().getId());
	}

}
