package org.opendevup.web;

import org.opendevup.dao.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class EtudiantController {
	@Autowired
	private EtudiantRepository etudiantRepository;
	
	@RequestMapping(value="/Index")
	public String Index() {
		return "etudiants";
	}
}
