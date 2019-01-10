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
		
		Epreuve test1 = new Epreuve("test", date1, cours1);
		Epreuve test2 = new Epreuve("test2", date2, cours2);
		
		professeur1.etablirTest(test1);
		listeTests.ajouterTest(test1);
		listeTests.ajouterTest(test2);
		listeTests.afficherTests();
		//professeur1.etablirTest("Test LG", date2, cours2);
		Notification not = new Notification("notificare", test1);
		Notification not1 = new Notification("notification 2", test2);
		
		
		System.out.println(listeTests.afficherTests());
		
		not.fermerNotification();
		not.configurerSon("ceva");
		
	
		//s.ajouterCours(cours2);
		//Horaire.addCours(cours2);
		
		System.out.println(not);
	}

}
