package model;

import java.util.Date;

public class Professeur extends Utilisateur {

	public Professeur(String nom, String prenom, String motDePasse) {
		super(nom, prenom, motDePasse);

	}
	
	public void etablirTest(String nom, Date date, Cours cours) {
		Test test = new Test(nom, date, cours);
		ListeTests.ajouterTest(test);
	}
	
}
