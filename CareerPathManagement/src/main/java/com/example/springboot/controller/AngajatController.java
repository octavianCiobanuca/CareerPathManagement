package com.example.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.model.Angajat;
import com.example.springboot.service.AngajatService;

@Controller
public class AngajatController {

	@Autowired
	private AngajatService angajatService;
	// afiseaza lista angajatilor
	
	@GetMapping("/")
	public String viewHomePage(Model model) {
		return findPaginated(1, "nume", "asc", model);
	}
	
	@GetMapping("/AngajatForm")
	public String AngajatForm(Model model){
		//creare atribute de model pentru a lega datele din formular
		Angajat angajat = new Angajat();
		model.addAttribute("angajat", angajat);
		return "angajat_nou";
	}
	
	@PostMapping("/salvareAngajat")
	public String salvareAngajat(@ModelAttribute("angajat") Angajat angajat){
		//salvare angajat in db
		angajatService.saveAngajat(angajat);
		return "redirect:/";
	}
	
	@GetMapping("/updateAngajat/{idangajat}")
	public String updateAngajat(@PathVariable (value = "idangajat") long idangajat, Model model) {
		//obtine angajati din serviciu
		Angajat angajat = angajatService.getAngajatById(idangajat);
		
		//setare angajat ca un model de atribut pentru a pre-popula formularul
		model.addAttribute("angajat", angajat);
		return "update_angajat";
	}
	
	@GetMapping("/stergereAngajat/{idangajat}")
	public String stergereAngajat(@PathVariable (value = "idangajat") long idangajat) {
		//call stergereAngajat method
		this.angajatService.stergereAngajatById(idangajat);
		return "redirect:/";
	}
	@GetMapping("/page/{pageNo}")
	public String findPaginated(@PathVariable (value = "pageNo") int pageNo, 
			@RequestParam("sortField") String sortField,
			@RequestParam("sortDir") String sortDir,
			Model model) {
		int pageSize = 5;
		
		Page<Angajat> page = angajatService.findPaginated(pageNo, pageSize, sortField, sortDir);
		List<Angajat> listaAngajati = page.getContent();
		
		model.addAttribute("currentPage", pageNo);
		model.addAttribute("totalPages", page.getTotalPages());
		model.addAttribute("totalItems", page.getTotalElements());
		
		model.addAttribute("sortField", sortField);
		model.addAttribute("sortDir", sortDir);
		model.addAttribute("reverseSortDir", sortDir.equals("asc") ? "desc" : "asc");
		
		model.addAttribute("listaAngajati", listaAngajati);
		return "index";
	}
}
