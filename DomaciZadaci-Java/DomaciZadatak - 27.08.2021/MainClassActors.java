package ClassActors;

import java.util.ArrayList;

public class MainClassActors {

	public static void main(String[] args) {
		
		/*Napraviti klasu Glumci koja ce imati public atribute: Ime i prezime, godina rodjenja, pol. 
		 Private atributi su: da li su ozenjeni ili udati (boolean), prosecna zarada po filmu, broj snimljenih filmova.
		 Potrebno je izracunati i odstampati sve atribute, koliko su ukupno zaradili u svim filmovima, koliko godina pune u 2022. godini,
		 ako su muskog pola preko atributa treba pre imena da se doda "Mr." ili "Mrs." ako su zenskog pola.
		 Nakon toga napraviti Array listu gde ce se ubaciti poslednjih 5 snimljenih filmova (pored naslova napisati ocenu sa imdb-a)
		 i odstampati od najbolje ocenjenog do najgore ocenjenog filma od tih pet (preko getera i setera).
		 */
	
		Actors actor1 = new Actors("Jason Statham", 1967, 'M', true, 30, 36);
		actor1.stampanje();
		
		
		ArrayList<String> Movies = new ArrayList<String>();
		Movies.add("Mechanic: Resurrection (5.7)");
		Movies.add("The Fate of the Furious (6.6)");
		Movies.add("The Meg (5.6)");
		Movies.add("Fast & Furious Presents: Hobbs & Shaw (6.4)");
		Movies.add("Wrath of Man (7.2)");
		
		
		Object alt = Movies.get(0);
		Movies.set(0, Movies.get(4));
		Movies.set(4, (String) alt);
		
		alt = Movies.get(2);
		Movies.set(2, Movies.get(3));
		Movies.set(3, (String) alt);
		
		alt = Movies.get(3);
		Movies.set(3, Movies.get(4));
		Movies.set(4, (String) alt);
		
		System.out.println("Jason Statham movies: \n");
		
		for(int i = 0; i < Movies.size(); i++) {
			
			System.out.println(Movies.get(i));
			
		}
			
	}
	
}
