package apaw.api.controllers;

import apaw.api.daos.DaoFactory;
import apaw.api.entities.Order;

public class OrderController {

	public void createOrder(int orderId) {
		DaoFactory.getFactory().getOrderDao().create(new Order(orderId));
	}
	
}
