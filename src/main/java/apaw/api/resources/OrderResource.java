package apaw.api.resources;

import java.util.Optional;

import apaw.api.controllers.OrderController;
import apaw.api.dtos.OrderDto;
import apaw.api.resources.exceptions.OrderFieldInvalidException;
import apaw.api.resources.exceptions.OrderIdNotFoundException;

public class OrderResource {
	
	public static final String ORDERS = "orders";
	
	public static final String ID = "/{id}";
	
	public static final String ID_DATE = ID + "/date";
	
	public static final String ID_AMOUNT = ID + "/amount";
	
	public void createOrder(String orderId) throws OrderFieldInvalidException{
		this.validateField(orderId);
		new OrderController().createOrder(Integer.parseInt(orderId));
	}
	
	private void validateField(String field) throws OrderFieldInvalidException{
		if(field == null || field.isEmpty()) {
			throw new OrderFieldInvalidException(field);
		}
	}
	
	public OrderDto readOrder(int orderId) throws OrderIdNotFoundException{
		/**
		 * Optional: me puede devolver algo, o no (null)
		 */
		Optional <OrderDto> optional = new OrderController().readOrder(orderId);
		
		return optional.orElseThrow(() -> new OrderIdNotFoundException(Integer.toString(orderId)));
	}

}
