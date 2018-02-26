package springwebmvc.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	
	@RequestMapping(path = { "/" }, method = RequestMethod.GET)
	public ModelAndView sayHello () {
	
	  ModelAndView view = new ModelAndView("index");
		
	  view.addObject("message","Hello Spring MVC with Annotations!");
	     
      //Java 8 LocalDate
      DateTimeFormatter formatter=DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
      LocalDate date=LocalDate.now();
      view.addObject("date", date.format(formatter));
      
      return view;
	}

}
