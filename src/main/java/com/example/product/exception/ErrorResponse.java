package com.example.product.exception;

import java.time.LocalDate;

public class ErrorResponse {
	
	private int errorCode;
	private String errorMessage;
	private String status;
	private LocalDate timestamp;
	
	public ErrorResponse(int errorCode, String errorMessage, String status, LocalDate timestamp) {
		super();
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
		this.status = status;
		this.timestamp = timestamp;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDate getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDate timestamp) {
		this.timestamp = timestamp;
	}	

}
