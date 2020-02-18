package gr.hua.dit.ds.sitisi.ext.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import gr.hua.dit.ds.sitisi.ext.dao.UserDAO;
import gr.hua.dit.ds.sitisi.ext.entity.Application;
import gr.hua.dit.ds.sitisi.ext.entity.Score;
import gr.hua.dit.ds.sitisi.ext.entity.Student;
import gr.hua.dit.ds.sitisi.ext.entity.User;

@Controller
public class UserController {
	
	private RestTemplate api = new RestTemplate();
	@Autowired
	private UserDAO userDAO;
	private User currentUser;
	
	@RequestMapping("/")
	public String showHome(Model model, Principal principal) {
		
		currentUser = userDAO.findUserByUsername(principal.getName());
		String apiCall = "http://localhost:8080/ds-sitisi/api/student/" + currentUser.getPersonal_id();
		try {
			Student currentStudent = api.getForObject(apiCall, Student.class);
			model.addAttribute("currentStudent", currentStudent);
		} catch (HttpClientErrorException e) {
			System.out.println("Please fill your info first");
			return "redirect:/student-form";
		}
		
		return "student";
	}
	
	@RequestMapping("/student-form")
	public String studentForm(Model model) {
		model.addAttribute("newStudent", new Student());
		return "student-form";
	}
	
	@RequestMapping("/saveStudent")
	public String saveStudentDetails(@ModelAttribute("newStudent") Student newStudent, Principal principal) {
		currentUser = userDAO.findUserByUsername(principal.getName());
		newStudent.setId(currentUser.getPersonal_id());
		newStudent.setCanSubmit(false);
		
		api.postForObject("http://localhost:8080/ds-sitisi/api/student", newStudent, Student.class);
		return "redirect:/";
	}
	
	@RequestMapping("/application")
	public String showApplication(Model model, Principal principal) {
		currentUser = userDAO.findUserByUsername(principal.getName());
		String apiCall = "http://localhost:8080/ds-sitisi/api/application/" + currentUser.getPersonal_id();
		
		try {
			Application application = api.getForObject(apiCall, Application.class);
			model.addAttribute("application", application);
		} catch(HttpClientErrorException e) {
			System.out.println("Please apply first");
			return "redirect:/application-form";
		}
		
		return "application";
	}
	
	@RequestMapping("/application-form")
	public String showApplicationForm(Model model) {
		model.addAttribute("newApplication", new Application());
		return "application-form";
	}
	
	@RequestMapping("/saveApplication")
	public String saveApplication(@ModelAttribute("newApplication") Application newApplication, Principal principal) {
		currentUser = userDAO.findUserByUsername(principal.getName());
		newApplication.setId(currentUser.getPersonal_id());
		
		api.postForObject("http://localhost:8080/ds-sitisi/api/application", newApplication, Application.class);
		return "redirect:/application";
	}

	@RequestMapping("/score")
	public String showScore(Model model, Principal principal) {
		currentUser = userDAO.findUserByUsername(principal.getName());
		
		String apiCall = "http://localhost:8080/ds-sitisi/api/score/" + currentUser.getPersonal_id();
		Score score = api.getForObject(apiCall, Score.class);
		model.addAttribute(score);
		
		return "score";
	}

}
