package apaw.api.resources.exceptions;

public class ProfessionalPhoneNotFoundException extends Exception {
	
	private static final long serialVersionUID = -2352841157085549125L;
	
	public static final String DESCRIPTION = "Professional's phone doesn't exist: ";
	
	public ProfessionalPhoneNotFoundException(String detail) {
		super(DESCRIPTION + detail);
	}
	
	public ProfessionalPhoneNotFoundException() {
		this("");
	}

}
