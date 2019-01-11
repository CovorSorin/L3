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

		listeTests.ajouterTest("Test GL", date, cours);
	}

	@Test
	public void testConfigurerSon1() {
		String nom = "samba2.mp3";

		boolean correcte = true;

		if (nom.length() == 3) {
			correcte = false;
		} else if (nom.length() > 3) {
			String extension = nom.substring(nom.length() - 4);

			if (extension.equals(".mp3")) {
				correcte = true;
			} else {
				correcte = false;
			}
		} else {
			correcte = false;
		}

		listeTests.getNotifications().get(0).configurerSon(nom);
		
		assertTrue(correcte);
		assertEquals(listeTests.getNotifications().get(0).getSon(), nom);
	}

	@Test
	public void testConfigurerSon2() {
		String nom = "samba2";

		boolean correcte = true;

		if (nom.length() == 3) {
			correcte = false;
		} else if (nom.length() > 3) {
			String extension = nom.substring(nom.length() - 4);

			if (extension.equals(".mp3")) {
				correcte = true;
			} else {
				correcte = false;
			}
		} else {
			correcte = false;
		}

		listeTests.getNotifications().get(0).configurerSon(nom);
		
		assertFalse(correcte);
		assertEquals(listeTests.getNotifications().get(0).getSon(), nom);
	}


	@Test
	public void testConfigurerSon3() {
		String nom = ".mp3";

		boolean correcte = true;

		if (nom.length() == 3) {
			correcte = false;
		} else if (nom.length() > 3) {
			String extension = nom.substring(nom.length() - 4);

			if (extension.equals(".mp3")) {
				correcte = true;
			} else {
				correcte = false;
			}
		} else {
			correcte = false;
		}

		listeTests.getNotifications().get(0).configurerSon(nom);
		
		assertTrue(correcte);
		assertEquals(listeTests.getNotifications().get(0).getSon(), nom);
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
