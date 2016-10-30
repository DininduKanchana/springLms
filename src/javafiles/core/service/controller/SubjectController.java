package javafiles.core.service.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javafiles.core.entity.Subject;
import javafiles.core.service.dao.SubjectDAO;


@Controller
@RequestMapping("/subject")
public class SubjectController {
	
	@Autowired
	private SubjectDAO subjectDAO;
	
	 @RequestMapping(value = "/insert-subject", method = RequestMethod.GET)
	    public String goInsert() {
	        return "insert-subject";
	    }
	    
	    @RequestMapping(value = "/save-subject", method = RequestMethod.POST)
	    public String goSave(HttpServletRequest request) {
	        String name = request.getParameter("name");
	        int No_Of_Asgs = Integer.parseInt(request.getParameter("No_Of_Asgs"));
	        String teacher = request.getParameter("teacher");
	        
	        
	       Subject subject = new Subject(name, No_Of_Asgs, teacher);
	       subjectDAO.insert(subject);
	        return "redirect:/subject/insert-subject";
	    }

}
