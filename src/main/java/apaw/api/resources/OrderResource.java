package apaw.api.resources;

import apaw.api.controllers.ProfessionalController;
import apaw.api.resources.exceptions.OrderFieldInvalidException;

public class OrderResource {
	
	public static final String ORDERS = "orders";
	
	public static final String ID = "/{id}";
	
	public static final String ID_DATE = ID + "/date";
	
	public static final String ID_AMOUNT = ID + "/amount";
	
	public void createOrder(String orderId) throws OrderFieldInvalidException{
		this.validateField(orderId);
		new ProfessionalController().createProfessional(Integer.parseInt(orderId));
	}
	
	private void validateField(String field) throws OrderFieldInvalidException{
		if(field == null || field.isEmpty()) {
			throw new OrderFieldInvalidException(field);
		}
	}

}
