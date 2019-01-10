package model;

public class Cours {

	private String jour;
	private String nom;
	private int heure;
	private int pointsCredit;

	public Cours(String jour, String nom, int heure, int pointsCredit) {
		super();
		this.jour = jour;
		this.nom = nom;
		this.heure = heure;
		this.pointsCredit = pointsCredit;
	}

	public String getJour() {
		return jour;
	}

	public void setJour(String jour) {
		this.jour = jour;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getHeure() {
		return heure;
	}

	public void setHeure(int heure) {
		this.heure = heure;
	}

	public int getPointsCredit() {
		return pointsCredit;
	}

	public void setPointsCredit(int pointsCredit) {
		this.pointsCredit = pointsCredit;
	}

	@Override
	public String toString() {
		return "Cours [jour=" + jour + ", nom=" + nom + ", heure=" + heure + ", pointsCredit=" + pointsCredit + "]";
	}
	
	
	

}
