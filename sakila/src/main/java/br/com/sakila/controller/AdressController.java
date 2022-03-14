package br.com.sakila.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.sakila.repository.AdressRepository;

@Controller
public class AdressController {

	
	@Autowired
	private AdressRepository AdressRepository;
	
	@GetMapping({"/adress/adress"}) //é o nome que eu quiser colocar
    public String listarAdress(ModelMap model) { 			
    	   
		 //o findAll lista todos adress 
		 model.addAttribute("adress",AdressRepository.findAll());
		 return "adress/adress"; //é o nome do arquivo real	
    	    	
    }
	
	
	
	
}
