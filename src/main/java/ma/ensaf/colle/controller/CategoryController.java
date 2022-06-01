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

import ma.ensaf.colle.dao.CategoryRepository;
import ma.ensaf.colle.model.Category;

@Controller
public class CategoryController {
	
	@Autowired
	CategoryRepository categoryRepository;

	@GetMapping(value = "/addCategory")
	public String addCategorie() {
		return "addCategory";
	}


	@PostMapping(value = "/addCategory")
	public ModelAndView addCategory(@RequestParam(value = "name") String name) {
		Category category = new Category(name);
		categoryRepository.save(category);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Catconfirm");
		mv.addObject("name", name);
		return mv;
	}

	@GetMapping(value = "/showAllCat")
	public ModelAndView showAllCat() {
		ArrayList<Category> categories = (ArrayList<Category>) categoryRepository.findAll();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Catresult");
		mv.addObject("categories", categories);
		return mv;
	}


	@Transactional
	@GetMapping("/deleteCategory")
	public ModelAndView deleteCategory(@RequestParam(value = "name") String name) {
		categoryRepository.deleteByName(name);
		return showAllCat();
	}

	
	@GetMapping(value = "/deleteCategory/{id}")
	ModelAndView deleteCategoryId(@PathVariable("id") long id ) {
		categoryRepository.deleteById(id);
		return showAllCat();
	}
	@GetMapping("/updateCategory/{id}")
	ModelAndView updateCategory(@PathVariable("id") long id) {
			Category category = categoryRepository.findById(id);
		
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("updateCategory");
		mv.addObject("id", category.getId()); 
		mv.addObject("name", category.getName());
		
		return mv;
	}
	
	
	
	@PostMapping("/updateCategory")
	
	ModelAndView updateCategory(@RequestParam(value = "name") String name, @RequestParam(value = "id") long id) {
			Category category = categoryRepository.findById(id);
			category.setName(name);
			categoryRepository.save(category);
			return showAllCat() ;
			
}
	
	

}
