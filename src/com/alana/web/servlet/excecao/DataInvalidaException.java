package com.alana.web.servlet.excecao;

public class DataInvalidaException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public DataInvalidaException() {
		super();
	}

	public DataInvalidaException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public DataInvalidaException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public DataInvalidaException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public DataInvalidaException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	

}
