package com.hotel.micro.exception;

public class ResourseNotFoundException extends RuntimeException{

	public ResourseNotFoundException(String s) {
		super(s);
	}
	
	public ResourseNotFoundException() {
		super("Resourse not found !!");
	}
}
