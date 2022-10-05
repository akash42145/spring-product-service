package com.example.product.exception;

public class InventoryNotAvailableException extends RuntimeException {

	private static final long serialVersionUID = 307204381532404770L;

	
	public InventoryNotAvailableException() {
		super();		
	}

	public InventoryNotAvailableException(String message, Throwable cause) {
		super(message, cause);		
	}

	public InventoryNotAvailableException(String message) {
		super(message);		
	}

	public InventoryNotAvailableException(Throwable cause) {
		super(cause);		
	}

	
}
