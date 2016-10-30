package javafiles.core.service.controller;

import javafiles.core.entity.Student;
import javafiles.core.service.dao.AssignmentDAO;
import javafiles.core.service.dao.StudentDAO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.StandardPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.portlet.ModelAndView;

@Controller
@SessionAttributes("studentId")
@RequestMapping("/home")
public class HomeController {
	
	StandardPasswordEncoder encoder = new StandardPasswordEncoder("secret");
	//String result = encoder.encode("myPassword");
	//assertTrue(encoder.matches("myPassword", result));
	 
	
	@Autowired
	private StudentDAO studentDAO;
	@Autowired
	private AssignmentDAO assignmentDAO;
	
	@RequestMapping(method = RequestMethod.GET)
    public String goHome(ModelMap model) {
		model.addAttribute("assignment", assignmentDAO.getAll());
		
		
        return "home";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String listAll(ModelMap model) {
        model.addAttribute("students", studentDAO.getAll());
        model.addAttribute("studentId");
        
        return "list";
    }
	
    
    @RequestMapping(value = "/insert", method = RequestMethod.GET)
    public String goInsert() {
        return "insert";
    }
    
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String goSave(HttpServletRequest request) {
    	int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        password = encoder.encode(password);
        
        Student student = new Student(id, name, email, password);
        studentDAO.insert(student);
        return "redirect:/home/list";
    }
    
    
    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String goDelete(HttpServletRequest request) {
        int id = Integer.valueOf(request.getParameter("id"));
        studentDAO.delete(id);
        return "redirect:/home/list";
    }
    
    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public String goEdit(HttpServletRequest request, ModelMap model) {
        int id = Integer.valueOf(request.getParameter("id"));
        model.addAttribute("student", studentDAO.getById(id));
        return "edit";
    }
    
    
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String goUpdate(HttpServletRequest request) {
        int id = Integer.valueOf(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
   
        String password = request.getParameter("password");
        Student student = new Student(id, name, email, password);
        studentDAO.update(student);
        return "redirect:/home/list";
    }
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(HttpServletRequest request, Model model) {
       
    	
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        
        
        Student s1 =studentDAO.getByEmail(email);
        String result = s1.getPassword();
        if (encoder.matches(password, result)){
        	
            model.addAttribute("studentId", s1.getId()); 
            
        	return "redirect:/home/list";
        	
        }
        
        else {
        	return "redirect:/home/welcome";
        }
    }
    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public String goLogin() {
        return "welcome";
    }
    
    

}
