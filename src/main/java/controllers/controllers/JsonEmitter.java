package controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonEmitter {
	
	@RequestMapping(value="/getJsonOutput",headers ="application/json",produces = "application/json")
	public Person getJsonOutput()
	{
		Person p = new Person();
		p.setContactNo("72829222");
		p.setName("ftyeret");
		
		return p;
		
	}

}
