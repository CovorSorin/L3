package tests;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
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
	public void test1() throws ParseException {
		sdf = new SimpleDateFormat("dd/MM/yyyy");
		date = sdf.parse("21/1/2018");
		cours = new Cours("Vendredi", "VDE", 10, 3);
		listeTests.ajouterTest("test", date, cours);
		
		Calendar calendar = Calendar.getInstance();
		int day = calendar.get(Calendar.DAY_OF_WEEK); 
		int month = calendar.get(Calendar.MONTH);
		int year = calendar.get(Calendar.YEAR);
		SimpleDateFormat sdfToday = new SimpleDateFormat("dd/MM/yyyy");
		String format = day + "/" + month + "/" + year;
		Date date2 = sdfToday.parse(format);
		
		boolean dejaPasse;
		
		if (date.compareTo(date2)>=0) {
			
			dejaPasse = true;
		} else {
			dejaPasse = false;
		}
		
		assertEquals(listeTests.getTests().size(), 1);
		assertFalse(dejaPasse);
	}
	
	@Test
	public void test2() throws ParseException {
		sdf = new SimpleDateFormat("dd/MM/yyyy");
		date = sdf.parse("16/1/2019");
		cours = new Cours("Vendredi", "VDE", 10, 3);
		listeTests.ajouterTest("test", date, cours);
		
		Calendar calendar = Calendar.getInstance();
		int day = calendar.get(Calendar.DAY_OF_WEEK); 
		int month = calendar.get(Calendar.MONTH);
		int year = calendar.get(Calendar.YEAR);
		SimpleDateFormat sdfToday = new SimpleDateFormat("dd/MM/yyyy");
		String format = day + "/" + month + "/" + year;
		Date date2 = sdfToday.parse(format);
		
		boolean dejaPasse;
		
		if (date.compareTo(date2)>=0) {
			
			dejaPasse = true;
		} else {
			dejaPasse = false;
		}
		assertEquals(listeTests.getTests().size(), 2);
		assertTrue(dejaPasse);
	}
	
	@Test
	public void test3() throws ParseException {
		sdf = new SimpleDateFormat("dd/MM/yyyy");
		date = sdf.parse("11/1/2019");
		cours = new Cours("Vendredi", "VDE", 10, 3);
		listeTests.ajouterTest("test", date, cours);
		
		Calendar calendar = Calendar.getInstance();
		int day = calendar.get(Calendar.DAY_OF_WEEK); 
		int month = calendar.get(Calendar.MONTH);
		int year = calendar.get(Calendar.YEAR);
		SimpleDateFormat sdfToday = new SimpleDateFormat("dd/MM/yyyy");
		String format = day + "/" + month + "/" + year;
		Date date2 = sdfToday.parse(format);
		
		boolean dejaPasse;
		
		if (date.compareTo(date2)>=0) {
			
			dejaPasse = true;
		} else {
			dejaPasse = false;
		}
		assertEquals(listeTests.getTests().size(), 3);
		assertTrue(dejaPasse);
	}

	
}
