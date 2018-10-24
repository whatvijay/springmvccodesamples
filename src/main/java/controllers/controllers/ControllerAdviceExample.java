package controllers;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerAdviceExample {
	
	@ExceptionHandler(Exception3.class)
	public String handle(Exception3 ex)
	{
		return "errorVijay3";
	}

}
