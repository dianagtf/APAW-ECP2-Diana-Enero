package apaw.api.controllers;

import java.util.Optional;

import apaw.api.daos.DaoFactory;
import apaw.api.dtos.OrderDto;
import apaw.api.entities.Order;

public class OrderController {

	public void createOrder(int orderId) {
		DaoFactory.getFactory().getOrderDao().create(new Order(orderId));
	}
	
	private boolean existOrderId(int orderId) {
		return DaoFactory.getFactory().getOrderDao().read(orderId) != null;
	}
	
	public Optional<OrderDto> readOrder(int orderId) {
		if(existOrderId(orderId)) {
			return Optional.of(new OrderDto(DaoFactory.getFactory().getOrderDao().read(orderId)));
		}else {
			return Optional.empty();
		}
	}
	
}
