package apaw.api.resources.exceptions;

public class OrderIdNotFoundException extends Exception{

	private static final long serialVersionUID = 463578840711777979L;
	public static final String DESCRIPTION = "Order's id doesn't exist: ";
	
	public OrderIdNotFoundException(String detail) {
		super(DESCRIPTION + detail);
	}
	
	public OrderIdNotFoundException() {
		this("");
	}
}
