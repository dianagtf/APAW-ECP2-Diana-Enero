package apaw.api.resources.exceptions;

public class ProfessionalPhoneNotFoundException extends Exception {
	
	public static final String DESCRIPTION = "Professional's phone doesn't exist: ";
	
	public ProfessionalPhoneNotFoundException(String detail) {
		super(DESCRIPTION + detail);
	}
	
	public ProfessionalPhoneNotFoundException() {
		this("");
	}

}
