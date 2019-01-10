package tests;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import model.Cours;
import model.Epreuve;
import model.ListeTests;
import model.Professeur;

public class TestEtablirEpreuve {

	ListeTests listeTests;
	Professeur professeur;
	SimpleDateFormat sdf;
	Date date;
	Cours cours;
	Epreuve test;
	
	@Before
	public void setUp() throws Exception {
		listeTests = new ListeTests();
		professeur = new Professeur("Popescu", "Popescu", "12345");
	}
	
	@Test
	public void testEtablirEpreuve() throws ParseException {
		sdf = new SimpleDateFormat("dd/MM/yyyy");
		date = sdf.parse("21/1/2018");
		cours = new Cours("Vendredi", "VDE", 10, 3);
		test = new Epreuve("test", date, cours);
		professeur.etablirTest(test);
		
		assertEquals(listeTests.getTests().size(), 1);
	}

}
