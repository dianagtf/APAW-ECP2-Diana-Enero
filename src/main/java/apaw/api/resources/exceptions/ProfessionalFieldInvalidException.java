package apaw.api.resources.exceptions;

public class ProfessionalFieldInvalidException extends Exception{
	
	public static final String DESCRIPTION = "Teléfono del profesional no encontrado";
	
	public ProfessionalFieldInvalidException(String detail) {
		super(DESCRIPTION + ". " + detail);
	}
	
	public ProfessionalFieldInvalidException() {
		this("");
	}

}
