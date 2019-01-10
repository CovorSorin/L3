package model;

import java.util.ArrayList;
import java.util.ListIterator;

public class Horaire {

	private static int anneUniversitaire;
	private static ArrayList<Cours> cours;

	public Horaire(int anneUniversitaire) {
		super();
		Horaire.anneUniversitaire = anneUniversitaire;
		Horaire.cours = new ArrayList<Cours>();
	}

	public static int getAnneUniversitaire() {
		return anneUniversitaire;
	}

	public static void setAnneUniversitaire(int anneUniversitaire) {
		Horaire.anneUniversitaire = anneUniversitaire;
	}

	public static ArrayList<Cours> getCours() {
		return cours;
	}

	public static void addCours(Cours cours) {
		Horaire.cours.add(cours);
	}


	
	
}
