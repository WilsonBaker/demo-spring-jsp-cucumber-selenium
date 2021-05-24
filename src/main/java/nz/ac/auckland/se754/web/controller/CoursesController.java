package nz.ac.auckland.se754.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import nz.ac.auckland.se754.web.service.Courses;

@Controller
@SessionAttributes("name")
public class CoursesController {
	
	@Autowired
	Courses service;
	
	@RequestMapping(value="/list-courses", method = RequestMethod.GET)
	public String showCourses(ModelMap model){
		String name = (String) model.get("name");
		model.put("courses", service.retrieveCourses(name));
		return "list-courses";
	}
}
