package model;

import java.util.ArrayList;

import java.util.Date;
import java.util.ListIterator;

public class ListeTests {

	private static ArrayList<Epreuve> tests = new ArrayList<Epreuve>();
	private static ArrayList<Notification> notifications = new ArrayList<Notification>();
	
	
	public static void ajouterTest(String nom, Date date, Cours cours) {
		Epreuve ep = new Epreuve(nom, date, cours);
		tests.add(ep);
		Notification notification = new Notification(nom, ep);
		notifications.add(notification);

	}

	public static boolean supprimerTest(Epreuve test) {
		return tests.remove(test);
	}

	public String afficherTests() {
		ListIterator<Epreuve> iterator = tests.listIterator();
		String testsString = "";

		while (iterator.hasNext()) {
			Epreuve test = iterator.next();
			testsString += test.toString();
		}

		return testsString;
	}

	public ArrayList<Epreuve> getTests() {
		return tests;
	}

	public ArrayList<Notification> getNotifications() {
		return notifications;
	}

}
