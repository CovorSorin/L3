package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.ListIterator;

public class ListeTests {

	private static ArrayList<Test> tests = new ArrayList<Test>();
	private static ArrayList<Notification> notifications = new ArrayList<Notification>();

	public static void ajouterTest(Test test) {
		tests.add(test);

		Notification notification = new Notification(test.getNom(), test);
		notifications.add(notification);

		System.out.println("Test ajoute!");
	}

	public static boolean supprimerTest(Test test) {
		return tests.remove(test);
	}

	public String afficherTests() {
		ListIterator<Test> iterator = tests.listIterator();
		String testsString = "";

		while (iterator.hasNext()) {
			Test test = iterator.next();
			testsString += test.toString();
		}

		return testsString;
	}

	public ArrayList<Test> getTests() {
		return tests;
	}

	public ArrayList<Notification> getNotifications() {
		return notifications;
	}

}
