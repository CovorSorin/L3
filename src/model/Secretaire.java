package model;

public class Secretaire extends Utilisateur {

	public Secretaire(String nom, String prenom, String motDePasse) {
		super(nom, prenom, motDePasse);
	}

	public void ajouterCours(Cours cours) {
		Horaire.addCours(cours);
	}

}
