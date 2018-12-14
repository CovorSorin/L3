package model;

public class Notification {
	
	private String nom;
	private Test test;
	private String son;
	private int duree;
	
	public Notification(String nom, Test test) {
		super();
		this.nom = nom;
		this.test = test;
		this.son = "disco.mp3";
		this.duree = 10;
	}
	
	public void ajouterTemps() {
		
	}
	
	public void modifierTemps() {
		
	}
	
	public void fermerNotification() {
		
	}
	
	public void prolongerNotification() {
		
	}
	
	public void configurerSon(String son) {
		this.son = son;
	}
	
	public void configurerDuree(int duree) {
		this.duree = duree;
	}
	
}
