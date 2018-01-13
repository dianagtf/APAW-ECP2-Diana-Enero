package apaw.api.resources.exceptions;

public class OrderFieldInvalidException extends Exception {
	
public static final String DESCRIPTION = "**Id of order not found";
	
	public OrderFieldInvalidException(String detail) {
		super(DESCRIPTION + ". " + detail);
	}
	
	public OrderFieldInvalidException() {
		this("");
	}

}
