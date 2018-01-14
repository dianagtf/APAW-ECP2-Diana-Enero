package apaw.api.resources.exceptions;

public class LevelIdNotFoundException extends Exception {

	private static final long serialVersionUID = 7069085093306756849L;
	
	public static final String DESCRIPTION = "Level's id doesn't exist: ";
	
	public LevelIdNotFoundException(String detail) {
		super(DESCRIPTION + detail);
	}
	
	public LevelIdNotFoundException() {
		this("");
	}

}
