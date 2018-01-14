package apaw.api.resources.exceptions;

public class LevelFieldInvalidException extends Exception {
	
	private static final long serialVersionUID = -3080437769134720758L;

	public static final String DESCRIPTION = "**Id of Level not found";
	
	public LevelFieldInvalidException(String detail) {
		super(DESCRIPTION + ". " + detail);
	}
	
	public LevelFieldInvalidException() {
		this("");
	}

}
