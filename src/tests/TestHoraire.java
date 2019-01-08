package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.*;

class TestHoraire {

	Horaire horaire;
	Cours cours;
	Secretaire secretaire;
	
	@BeforeEach
	void setUp() throws Exception {
		horaire = new Horaire(4);
		cours = new Cours("Lundi", "Mathematique", 16, 5);
		secretaire = new Secretaire("Maria", "Georgescu", "qwerty2");
	}

	@Test
	void testAjouterCours() {
		secretaire.ajouterCours(cours);
		assertEquals(Horaire.getCours().size(), 1);
	}

}
