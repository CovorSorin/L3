package model;

import java.util.ArrayList;

public class Horaire {
	
	private int anneUniversitaire;
	private ArrayList<Cours> cours;
	
	public Horaire(int anneUniversitaire, ArrayList<Cours> cours) {
		super();
		this.anneUniversitaire = anneUniversitaire;
		this.cours = new ArrayList<Cours>();
	}
	
}
