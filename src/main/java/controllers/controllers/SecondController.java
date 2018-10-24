package controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class SecondController {

	@RequestMapping("/soc1")
	public ModelAndView giveAForm()
	{
		ModelAndView  mv = new ModelAndView("Page2");
		mv.addObject("key2", "hai");
		mv.addObject("key3", "abcd");
		return mv;
		
	}
	@RequestMapping(value="/soc1/handle1" ,method=RequestMethod.GET)
	public ModelAndView letMeGetAForm()
	{
		Person p = new Person();
		p.setName("vijay");
		p.setContactNo("7829292929");
		ModelAndView mv = new ModelAndView("form1","person",p);
		return mv;
		
	}
	@RequestMapping(value="/soc1/handle2", method=RequestMethod.POST)
	public ModelAndView processTheForm(@Valid @Validated @ModelAttribute("person")Person pobj,BindingResult result,ModelMap model )
	{
		
		ModelAndView mv = new ModelAndView("personDetail");
		mv.addObject("name", pobj.getName());
		mv.addObject("contact",pobj.getContactNo());
		return mv;
	}
	
	@ModelAttribute("sportTypes")
	public List<Sport> populateSportTypes()
	{
		List<Sport> sportTypes = new ArrayList();
		
		sportTypes.add(new Sport("cric"));
		sportTypes.add(new Sport("cric"));
		sportTypes.add(new Sport("cric"));
		
		return sportTypes;
	}
	
	@RequestMapping("/getXMLoutput")	
	public @ResponseBody Students getStudentsAsXML()
	{
		Students st = new Students();
		List<Student> stl = new ArrayList();
		Student s = new Student();
		s.setEmail("abcd@sdf");
		s.setName("basd");
		s.setPhone("7828828288");
		Student s2 = new Student();
		s2.setEmail("afsg@sdf.com");
		s2.setName("dert");
		s2.setPhone("78383883");
		stl.add(s);
		stl.add(s2);
		
		st.addStudents(stl);
		return st;
		
	}
	
	// if we go by this approach we have to make configuration changes to add json view resolver so use restcontroller
	/*@RequestMapping("/getJsonresponse")
	public @ResponseBody String getJsonResponse(Model m)
	{
		Person p= new Person();
		p.setContactNo("abcd");
		p.setName("fagah");
		m.addAttribute("person",p);
		return "jsonTemplate";
	}*/
	
}
