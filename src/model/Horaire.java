package model;

import java.util.ArrayList;
import java.util.ListIterator;

public class Horaire {

	private static int anneUniversitaire;
	private static ArrayList<Cours> listeCours;
	private static int maxCours = 10;
	
	public Horaire(int anneUniversitaire) {
		super();
		Horaire.anneUniversitaire = anneUniversitaire;
		Horaire.listeCours = new ArrayList<Cours>();
	}

	public static int getAnneUniversitaire() {
		return anneUniversitaire;
	}

	public static void setAnneUniversitaire(int anneUniversitaire) {
		Horaire.anneUniversitaire = anneUniversitaire;
	}

	public static ArrayList<Cours> getCours() {
		return listeCours;
	}

	public static void addCours(String jour, String nom, int heure, int pointsCredit) {
		Cours c = new Cours(jour, nom, heure, pointsCredit);
		Horaire.listeCours.add(c);
	}

	public static int getMaxCours() {
		return maxCours;
	}

	public static void setMaxCours(int maxCours) {
		Horaire.maxCours = maxCours;
	}

}
