package tests;

import static org.junit.Assert.*;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
	public void test1() {
		Horaire.addCours("Vendredi", "Genie logiciel", 10, 5);
		
		assertEquals(Horaire.getCours().size(), 1);
		assertTrue(Horaire.getCours().size() <= Horaire.getMaxCours());
	}


	@Test
	public void test2() {
		Horaire.addCours("Vendredi", "Genie logiciel", 10, 5);
		Horaire.addCours("Vendredi", "Genie logiciel", 10, 5);
		Horaire.addCours("Vendredi", "Genie logiciel", 10, 5);
		Horaire.addCours("Vendredi", "Genie logiciel", 10, 5);
		Horaire.addCours("Vendredi", "Genie logiciel", 10, 5);
		Horaire.addCours("Vendredi", "Genie logiciel", 10, 5);
		Horaire.addCours("Vendredi", "Genie logiciel", 10, 5);
		Horaire.addCours("Vendredi", "Genie logiciel", 10, 5);
		Horaire.addCours("Vendredi", "Genie logiciel", 10, 5);
		Horaire.addCours("Vendredi", "Genie logiciel", 10, 5);		
		Horaire.addCours("Vendredi", "Genie logiciel", 10, 5);
		Horaire.addCours("Vendredi", "Genie logiciel", 10, 5);
		Horaire.addCours("Vendredi", "Genie logiciel", 10, 5);
		
		assertFalse(Horaire.getCours().size() <= Horaire.getMaxCours());
	}
	

	@Test
	public void test3() {
		Horaire.addCours("Vendredi", "Genie logiciel", 8, 5);
		Horaire.addCours("Vendredi", "Genie logiciel", 10, 5);
		Horaire.addCours("Vendredi", "Genie logiciel", 11, 5);
		Horaire.addCours("Vendredi", "Genie logiciel", 10, 5);
		Horaire.addCours("Vendredi", "Genie logiciel", 10, 5);
		Horaire.addCours("Vendredi", "Genie logiciel", 12, 5);
		Horaire.addCours("Vendredi", "Genie logiciel", 10, 5);
		Horaire.addCours("Vendredi", "Genie logiciel", 14, 5);
		Horaire.addCours("Vendredi", "Genie logiciel", 10, 5);
		Horaire.addCours("Vendredi", "Genie logiciel", 16, 5);		
		Horaire.addCours("Vendredi", "Genie logiciel", 10, 5);
		Horaire.addCours("Vendredi", "Genie logiciel", 10, 5);
		Horaire.addCours("Vendredi", "Genie logiciel", 10, 5);
		//System.out.println(Horaire.getCours().size());
		
		for (int i = 0; i < Horaire.getCours().size(); i++) {
			assertTrue(Horaire.getCours().get(i).getHeure() <= 18);
			assertTrue(Horaire.getCours().get(i).getHeure() >= 8);
		}
	}
}
