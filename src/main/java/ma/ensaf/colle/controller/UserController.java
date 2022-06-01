package ma.ensaf.colle.controller;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ma.ensaf.colle.dao.UserRepository;
import ma.ensaf.colle.model.User;

@Controller
public class UserController {

	@Autowired
	UserRepository userRepository;

	@GetMapping(value = "/addUser")
	public String addUserr() {
		return "addUser";
	}

	@PostMapping(value = "/addUser")
	public ModelAndView addUser(@RequestParam(value = "username") String username,
			@RequestParam(value = "password") String password) {
		User user = new User(username, password);
		userRepository.save(user);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("confirmUser");
		mv.addObject("username", username);
		mv.addObject("password", password);
		return mv;
	}

	@GetMapping(value = "/showAllUsers")
	public ModelAndView showAllUsers() {
		ArrayList<User> utilisateurs = (ArrayList<User>) userRepository.findAll();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("resultuser");
		mv.addObject("utilisateurs", utilisateurs);
		return mv;
	}


	@Transactional
	@GetMapping("/deleteUser")
	public ModelAndView deleteUser(@RequestParam(value = "username") String username) {
		userRepository.deleteByUsername(username);
		return showAllUsers();
	}



	
	@GetMapping(value = "/deleteUser/{id}")
	ModelAndView deleteUser(@PathVariable("id") long id ) {
		userRepository.deleteById(id);
		return showAllUsers();
	}
	
	
	
	

	@GetMapping("/updateUser/{id}")
	ModelAndView updateProduct(@PathVariable("id") long id) {
			User user = userRepository.findById(id);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("updateUser");
		mv.addObject("id", user.getId()); 
		mv.addObject("username", user.getUsername());
		mv.addObject("password", user.getPassword());
		
		return mv;
	}
	
	
	
	@PostMapping("/updateUser")
	
	ModelAndView updatePersonne(@RequestParam(value = "username") String username,
			@RequestParam(value = "password") String password , @RequestParam(value = "id") long id) {
			User user = userRepository.findById(id);
			user.setUsername(username);
			user.setPassword(password);
			userRepository.save(user);
			return showAllUsers() ;
			
}

}
