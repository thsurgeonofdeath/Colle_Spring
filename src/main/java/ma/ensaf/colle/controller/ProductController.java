package ma.ensaf.colle.controller;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;


import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ma.ensaf.colle.dao.ProductRepository;
import ma.ensaf.colle.model.Product;

@Controller
public class ProductController {
	@Autowired
	private ProductRepository productRepository;

	@GetMapping(value="/")
	public String welcome() {
		return "welcome";
	}
	
	@GetMapping(value = "/addProduct")
	public String addProduit() {
		return "addProduct";
	}

	@PostMapping(value = "/addProduct")
	public ModelAndView addProduct(@RequestParam(value = "name") String name,
			@RequestParam(value = "prix") String prix) {
		Product product = new Product(name, prix);
		productRepository.save(product);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("confirm");
		mv.addObject("name", name);
		mv.addObject("prix", prix);
		return mv;
	}

	@GetMapping(value = "/showAll")
	public ModelAndView showAll() {
		ArrayList<Product> products = (ArrayList<Product>) productRepository.findAll();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("result");
		mv.addObject("products", products);
		return mv;
	}

	@GetMapping(value = "/showAllByPage/{i}/{j}")
	public ModelAndView showAllByPage(@PathVariable int i, @PathVariable int j) {
		Page<Product> products = productRepository.findAll(PageRequest.of(i, j));
		ModelAndView mv = new ModelAndView();
		mv.setViewName("result");
		mv.addObject("products", products.getContent());
		return mv;
	}



	@Transactional
	@GetMapping("/deleteProduct")
	public ModelAndView deleteProduct(@RequestParam(value = "name") String name) {
		productRepository.deleteByName(name);
		return showAll();
	}



	
	@GetMapping(value = "/delete/{id}")
	ModelAndView deleteProduct(@PathVariable("id") long id ) {
		productRepository.deleteById(id);
		return showAll();
	}
	
	
	
	

	@GetMapping("/update/{id}")
	ModelAndView updateProduct(@PathVariable("id") long id) {
			Product product = productRepository.findById(id);
		
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("update");
		mv.addObject("id", product.getId()); 
		mv.addObject("name", product.getName());
		mv.addObject("prix", product.getPrix());
		
		return mv;
	}
	
	
	
	@PostMapping("/update")
	
	ModelAndView updatePersonne(@RequestParam(value = "name") String name,
			@RequestParam(value = "prix") String prix , @RequestParam(value = "id") long id) {
			Product product = productRepository.findById(id);
			product.setName(name);
			product.setPrix(prix);
			productRepository.save(product);
			return showAll() ;
			
}

	

	
	
	

	

	
}