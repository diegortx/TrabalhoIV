package banco.loja;

public class atendenteException extends Exception {

	public atendenteException() {
	}

	public atendenteException(String message) {
		super(message);
	}

	public atendenteException(Throwable cause) {
		super(cause);
	}

	public atendenteException(String message, Throwable cause) {
		super(message, cause);
	}

	public atendenteException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
