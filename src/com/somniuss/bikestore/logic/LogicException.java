package com.somniuss.bikestore.logic;

public class LogicException extends Exception {

	private static final long serialVersionUID = 1L;

	public LogicException() {
		super();
	}

	public LogicException(String message, Exception e) {
		super(message, e);
	}

	public LogicException(String message) {
		super(message);
	}

	public LogicException(Exception e) {
		super(e);
	}

}