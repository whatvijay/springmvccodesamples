package controllers;

import org.springframework.stereotype.Component;


public class Sport {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Sport(String name) {
		super();
		this.name = name;
	}
	
}
