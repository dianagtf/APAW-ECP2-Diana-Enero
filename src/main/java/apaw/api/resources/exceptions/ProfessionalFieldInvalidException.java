package apaw.api.resources.exceptions;

public class ProfessionalFieldInvalidException extends Exception{
	
	private static final long serialVersionUID = 985873305504040195L;
	
	public static final String DESCRIPTION = "**Professional phone not found";
	
	public ProfessionalFieldInvalidException(String detail) {
		super(DESCRIPTION + ". " + detail);
	}
	
	public ProfessionalFieldInvalidException() {
		this("");
	}

}
