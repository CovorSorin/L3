package model;

import java.util.ArrayList;

public class Etudiant extends Utilisateur {

	private int anneUniversitaire;

	public Etudiant(String nom, String prenom, String motDePasse, int anneUniversitaire) {
		super(nom, prenom, motDePasse);
		this.anneUniversitaire = anneUniversitaire;
	}

	
	
}
