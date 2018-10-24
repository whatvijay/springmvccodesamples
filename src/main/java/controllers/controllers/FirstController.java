package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {

		@RequestMapping("/toc1")	
		public ModelAndView handlingMethod1(@RequestParam(value = "name", required = false, defaultValue = "World") String name)
			{
				ModelAndView mv = new ModelAndView("page1");
				mv.addObject("key1","jai");
				mv.addObject("name",name);
				
				return mv;
			}
}
