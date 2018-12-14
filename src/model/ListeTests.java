package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.ListIterator;

public class ListeTests {
	
	private static ArrayList<Test> tests = new ArrayList<Test>();
	
	public static void ajouterTest(Test t) {
		tests.add(t);
		System.out.println("Test ajoute!");
	}
	
	public static boolean supprimerTest(Test t) {
		return tests.remove(t);
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

}
