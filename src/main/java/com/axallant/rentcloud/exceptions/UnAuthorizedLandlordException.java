package com.axallant.rentcloud.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.UNAUTHORIZED)
public class UnAuthorizedLandlordException extends Exception{

	public UnAuthorizedLandlordException(String message) {
		super(message);
	}
}
