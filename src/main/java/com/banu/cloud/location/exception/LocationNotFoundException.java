package com.banu.cloud.location.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(org.springframework.http.HttpStatus.NOT_FOUND)
public class LocationNotFoundException extends Exception {
	private static final long serialVersionUID = 1L;

	public LocationNotFoundException(String city) {
		super("No such city found" + city);
	}

}
