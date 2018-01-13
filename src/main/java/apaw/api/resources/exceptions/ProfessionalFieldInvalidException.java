package apaw.api.resources.exceptions;

public class ProfessionalFieldInvalidException extends Exception{
	
	public static final String DESCRIPTION = "**Professional phone not found";
	
	public ProfessionalFieldInvalidException(String detail) {
		super(DESCRIPTION + ". " + detail);
	}
	
	public ProfessionalFieldInvalidException() {
		this("");
	}

}
