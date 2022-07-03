package com.axallant.rentcloud.exceptions;


import com.axallant.rentcloud.maintenance.MaintenanceErrorCode;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

public class ErrorResponse {

    private HttpStatus status;
    private MaintenanceErrorCode errorcode;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyyMMdd hh:mm:ss")
    private LocalDateTime timeStamp;
    private String message;
    private String path;

    public ErrorResponse(HttpStatus status) {
        this();
        this.status = status;
    }

    public ErrorResponse(HttpStatus status, String message) {
        this();
        this.status = status;
        this.message = message;
    }
    
    public ErrorResponse(HttpStatus status, MaintenanceErrorCode errorcode,String message,
			String path) {
		super();
		this.status = status;
		this.errorcode = errorcode;
		this.message = message;
		this.path = path;
	}

    public ErrorResponse(){
        timeStamp = LocalDateTime.now();
    }
    public ErrorResponse(HttpStatus status, LocalDateTime timeStamp, String message) {
        this();
        this.status = status;
        this.timeStamp = timeStamp;
        this.message = message;
    }
    
    

    public ErrorResponse(HttpStatus status, MaintenanceErrorCode errorcode, LocalDateTime timeStamp, String message,
			String path) {
		super();
		this.status = status;
		this.errorcode = errorcode;
		this.timeStamp = timeStamp;
		this.message = message;
		this.path = path;
	}

	public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public MaintenanceErrorCode getErrorcode() {
		return errorcode;
	}

	public void setErrorcode(MaintenanceErrorCode errorcode) {
		this.errorcode = errorcode;
	}
    
    
}


