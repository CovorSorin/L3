package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainClass {

	public static void main(String[] args) throws ParseException {
		
		ListeTests listeTests = new ListeTests();
		
		Professeur professeur1 = new Professeur("Popescu", "Popescu", "12345");
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date date1 = sdf.parse("21/1/2018");
		Cours cours1 = new Cours("Vendredi", "GL", 10, 3);
		
		Date date2 = sdf.parse("13/5/2018");
		Cours cours2 = new Cours("Mardi", "LG", 10, 2);
		
		professeur1.etablirTest("Test GL", date1, cours1);
		professeur1.etablirTest("Test LG", date2, cours2);
		
		System.out.println(listeTests.afficherTests());
	}

}
