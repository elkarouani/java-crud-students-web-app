package org.opendevup.web;

import org.opendevup.dao.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/Etudiant")
public class EtudiantController {
	@Autowired
	private EtudiantRepository etudiantRepository;
	
	@RequestMapping(value="/Index")
	public String Index() {
		return "etudiants";
	}
}
