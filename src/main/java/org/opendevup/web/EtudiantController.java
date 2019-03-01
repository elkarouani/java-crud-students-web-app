package org.opendevup.web;

import java.util.List;

import org.opendevup.dao.EtudiantRepository;
import org.opendevup.entities.Etudiant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value="/Etudiant")
public class EtudiantController {
	@Autowired
	private EtudiantRepository etudiantRepository;
	
	@RequestMapping(value="/Index")
	public String Index(Model model, @RequestParam(name="page", defaultValue="0")int page) {
		Page<Etudiant> etudiants = etudiantRepository.findAll(new PageRequest(page, 1));
		model.addAttribute("etudiants", etudiants);
		return "etudiants";
	}
}
