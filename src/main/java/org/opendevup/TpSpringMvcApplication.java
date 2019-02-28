package org.opendevup;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.opendevup.dao.EtudiantRepository;
import org.opendevup.entities.Etudiant;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TpSpringMvcApplication {

	public static void main(String[] args) throws ParseException {
		ApplicationContext ctx = SpringApplication.run(TpSpringMvcApplication.class, args);
		EtudiantRepository etudiantRepository = ctx.getBean(EtudiantRepository.class);
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		etudiantRepository.save(new Etudiant("Ahmed", df.parse("1988-11-10"), "ahmed@gmail.com", "ahmed.jpg"));
		etudiantRepository.save(new Etudiant("Mohamed", df.parse("1988-11-10"), "mohamed@gmail.com", "mohamed.jpg"));
		etudiantRepository.save(new Etudiant("Ibrahim", df.parse("1988-11-10"), "ibrahim@gmail.com", "ibrahim.jpg"));
	}

}
