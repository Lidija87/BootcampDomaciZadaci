package ZadatakAutobus;

public class GlavnaKlasa {

	public static void main(String[] args) {
		
		  Vozac v1 = new Vozac("Stefan", "Stojanovic", "Sofer" );
		  System.out.println(v1);
	      Putnik p1 = new Putnik("Marija", "Markovic", 3650);
		  System.out.println(p1);
		  Autobus a1 = new Autobus ("Lasta", 1800, v1, p1);
		  System.out.println(a1);

	}

}
