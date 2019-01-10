package model;

import java.util.Date;

public class Epreuve {
	
	private String nom;
	private Date date;
	private Cours cours;
	private float note;
//	 nu uita nota
	public Epreuve(String nom, Date date, Cours cours) {
		super();
		this.nom = nom;
		this.date = date;
		this.cours = cours;
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Cours getCours() {
		return cours;
	}

	public void setCours(Cours cours) {
		this.cours = cours;
	}

	public float getNote() {
		return note;
	}

	public void setNote(float note) {
		this.note = note;
	}
	
	public void modifierDate(Epreuve t, Date d) {
		t.setDate(d);
	}

	@Override
	public String toString() {
		return "Test [nom=" + nom + ", date=" + date+ "\n" + ", cours=" + cours + ", note=" + note + "]"+"\n";
	}

}
