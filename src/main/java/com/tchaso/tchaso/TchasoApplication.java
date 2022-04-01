package com.tchaso.tchaso;

import com.tchaso.tchaso.enumeration.Etat;
import com.tchaso.tchaso.enumeration.Profile;
import com.tchaso.tchaso.models.Administrateur;
import com.tchaso.tchaso.serviceimp.AdministrateurServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TchasoApplication implements CommandLineRunner {
	@Autowired
	AdministrateurServiceImp administrateurServiceImp;

	public static void main(String[] args) {
		SpringApplication.run(TchasoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Administrateur administrateur = new Administrateur(null, "Diarra", "Seydina Oumar", "7897878", "Homme", "seydinaoumardiarra@gmail.com", Etat.actif, "seydina", "1111", Profile.super_admin);
		administrateurServiceImp.add_administrateur(administrateur);
	}
}
