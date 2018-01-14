package apaw.api.resources.exceptions;

public class OrderFieldInvalidException extends Exception {
	
	private static final long serialVersionUID = 4613089317941782288L;
	
	public static final String DESCRIPTION = "**Id of order not found";
	
	public OrderFieldInvalidException(String detail) {
		super(DESCRIPTION + ". " + detail);
	}
	
	public OrderFieldInvalidException() {
		this("");
	}

}
