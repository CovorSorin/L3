package tests;

import static org.junit.Assert.*;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import model.Cours;
import model.Epreuve;
import model.EtatNotification;
import model.ListeTests;
import model.Professeur;

public class TestConfigurationNotification {

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

		sdf = new SimpleDateFormat("dd/MM/yyyy");
		date = sdf.parse("21/1/2018");
		cours = new Cours("Vendredi", "VDE", 10, 3);
		test = new Epreuve("test", date, cours);

		professeur.etablirTest(test);
	}

	@Test
	public void testConfigurerSon() {
		listeTests.getNotifications().get(0).configurerSon("samba2.mp3");
		assertEquals(listeTests.getNotifications().get(0).getSon(), "samba2.mp3");
	}

	@Test
	public void testConfigurerDuree() {
		listeTests.getNotifications().get(0).configurerDuree(24);
		assertEquals(listeTests.getNotifications().get(0).getDuree(), 24);
	}

	@Test
	public void testFermerNotification() {
		listeTests.getNotifications().get(0).fermerNotification();
		assertEquals(listeTests.getNotifications().get(0).getEtat(), EtatNotification.FERMEE);
	}

	@Test
	public void testProlongerNotification() {
		listeTests.getNotifications().get(0).prolongerNotification();
		assertEquals(listeTests.getNotifications().get(0).getEtat(), EtatNotification.PROLONGEE);
	}


}
