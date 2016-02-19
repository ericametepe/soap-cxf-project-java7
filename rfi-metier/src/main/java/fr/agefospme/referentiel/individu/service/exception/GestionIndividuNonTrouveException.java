package fr.agefospme.referentiel.individu.service.exception;

public class GestionIndividuNonTrouveException extends Exception {
	
	
	private String code;

	public GestionIndividuNonTrouveException() {
	}

	public GestionIndividuNonTrouveException(String code, String message) {
		super(message);
		this.code=code;
	}

	public GestionIndividuNonTrouveException(Throwable cause) {
		super(cause);
	}

	public GestionIndividuNonTrouveException(String message, Throwable cause) {
		super(message, cause);
	}

	public GestionIndividuNonTrouveException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4573160206601844874L;

}
