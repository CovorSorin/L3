package tests;

import static org.junit.Assert.*;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import model.*;

public class TestHoraire {

	Horaire horaire;
	Cours cours;
	Secretaire secretaire;
	
	@Before
	public void setUp() throws Exception {
		horaire = new Horaire(4);
		cours = new Cours("Lundi", "Mathematique", 16, 5);
		secretaire = new Secretaire("Maria", "Georgescu", "qwerty2");
	}

	@Test
	public void testAjouterCours() {
		secretaire.ajouterCours(cours);
		assertEquals(Horaire.getCours().size(), 1);
	}

}
