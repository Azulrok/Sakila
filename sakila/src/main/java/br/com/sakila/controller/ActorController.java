package br.com.sakila.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.sakila.repository.ActorRepository;

@Controller
public class ActorController {
	
	//cria uma instãncia do nosso repositório
	@Autowired
	private ActorRepository actorRepository;
	

	@GetMapping({"/atores/atores"}) //é o nome que eu quiser colocar
    public String listarAtores(ModelMap model) { 			
    	   
		 //o findAll lista todos atores 
		 model.addAttribute("atores",actorRepository.findAll());
		 return "atores/atores"; //é o nome do arquivo real	
    	    	
    }

	@GetMapping({"/"}) //é o nome que eu quiser colocar
    public String listarHome(ModelMap model) { 			
    	   
		 //o findAll lista todos atores 
		 model.addAttribute("atores",actorRepository.findAll());
		 return "atores/atores"; //é o nome do arquivo real	
    	    	
    }
}
