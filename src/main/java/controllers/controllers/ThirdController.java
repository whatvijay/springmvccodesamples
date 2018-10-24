package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
// understanding various annotations.
@Controller
public class ThirdController {
	
	@RequestMapping(value= {"/link1","/link2"})
	public String justTakeMetoPage()
	{
		return "link1And2";
	}
	
	@RequestMapping("/link3/{exactpage}")
	public String linkValue(@PathVariable("exactpage") String exactPage)
	{
		String linkValue =exactPage;
		return linkValue;
	}
	
	@RequestMapping("/exceptionTesting/{userValue}")
	public String sendToException(@PathVariable("userValue") String userValue) throws Exception
	{
		if(userValue.equals("abcd"))
		{
			Exception1 ex2 = new Exception1();
			ex2.setErrorMsg("errroooor");
			ex2.setName("e1");
			throw ex2;
			
		}
		if(userValue.equals("def"))
		{
			Exception2 ee2 = new Exception2();
			ee2.setErrorMsg("def excep2 error");
			ee2.setName("abcd");
			throw ee2;
		}
		if(userValue.equals("exc3"))
		{
			Exception3 ee2 = new Exception3();
			ee2.setErrorMsg("exception3 error");
			ee2.setName("e3 controller advice");
			throw ee2;
		}
		
		
			return "noError";
		
	}
	
	@ExceptionHandler(Exception2.class)
	public String handleException2()
	{
		return "errorVijay2";
	}
}
