package model;

public class Notification {

	private String nom;
	private Test test;
	private String son;
	private int duree;
	private EtatNotification etat;

	public Notification(String nom, Test test) {
		super();
		this.nom = nom;
		this.test = test;
		this.son = "disco.mp3";
		this.duree = 10;
		this.etat = EtatNotification.EN_ATTENDRE;
	}

	public void fermerNotification() {
		this.etat = EtatNotification.FERMEE;
	}

	public void prolongerNotification() {
		this.etat = EtatNotification.PROLONGEE;
	}

	public void configurerNom(String nom) {
		this.nom = nom;
	}

	public void configurerSon(String son) {
		this.son = son;
	}

	public void configurerDuree(int duree) {
		this.duree = duree;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Test getTest() {
		return test;
	}

	public void setTest(Test test) {
		this.test = test;
	}

	public String getSon() {
		return son;
	}

	public void setSon(String son) {
		this.son = son;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public EtatNotification getEtat() {
		return etat;
	}

	public void setEtat(EtatNotification etat) {
		this.etat = etat;
	}

}
