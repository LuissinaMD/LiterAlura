package com.luissina.challenge_literalura;

import com.luissina.challenge_literalura.principal.Principal;
import com.luissina.challenge_literalura.repository.AutorRepository;
import com.luissina.challenge_literalura.repository.IdiomaRepository;
import com.luissina.challenge_literalura.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChallengeLiterAluraApplication implements CommandLineRunner {

	@Autowired
	private AutorRepository autorRepository;

	@Autowired
	private LibroRepository libroRepository;

	@Autowired
	private IdiomaRepository idiomaRepository;

	public static void main(String[] args) {
		SpringApplication.run(ChallengeLiterAluraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
		Principal principal = new Principal(autorRepository,libroRepository,idiomaRepository);
		principal.mostrarMenu();
	}

}