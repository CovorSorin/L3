package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.*;

class TestConfigurerNotification {

	ListeTests listeTests;
	Professeur professeur;
	SimpleDateFormat sdf;
	Date date;
	Cours cours;

	@BeforeEach
	void setUp() throws Exception {
		listeTests = new ListeTests();
		professeur = new Professeur("Popescu", "Popescu", "12345");

		sdf = new SimpleDateFormat("dd/MM/yyyy");
		date = sdf.parse("21/1/2018");
		cours = new Cours("Vendredi", "VDE", 10, 3);

		professeur.etablirTest("Test Partiel VDE", date, cours);
	}

	@Test
	void testConfigurerSon() {
		listeTests.getNotifications().get(0).configurerSon("samba2.mp3");
		assertEquals(listeTests.getNotifications().get(0).getSon(), "samba2.mp3");
	}

	@Test
	void testConfigurerDuree() {
		listeTests.getNotifications().get(0).configurerDuree(24);
		assertEquals(listeTests.getNotifications().get(0).getDuree(), 24);
	}

	@Test
	void testFermerNotification() {
		listeTests.getNotifications().get(0).fermerNotification();
		assertEquals(listeTests.getNotifications().get(0).getEtat(), EtatNotification.FERMEE);
	}

	@Test
	void testProlongerNotification() {
		listeTests.getNotifications().get(0).prolongerNotification();
		assertEquals(listeTests.getNotifications().get(0).getEtat(), EtatNotification.PROLONGEE);
	}

}
