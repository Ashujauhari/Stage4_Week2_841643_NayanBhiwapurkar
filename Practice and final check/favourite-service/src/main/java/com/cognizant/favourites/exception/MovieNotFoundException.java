package com.cognizant.favourites.exception;

public class MovieNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public MovieNotFoundException() {
		super("Movie Id not Available.");
	}

}