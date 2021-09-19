package Osoba;

public class GlavnaKlasa {

	public static void main(String[] args) {
		
		Student s1 = new Student("Petar Patrovic", "0811001710079", 201598);
		Student s2 = new Student("Marija Markovic", "1503002730095", 201357);
		s1.stampanje();
		s2.stampanje();
		
		Profesor p1 = new Profesor("Dragan Veselinov", "0410976710037", "Politicka Ekonomija");;
		Profesor p2 = new Profesor("Olivera Milutinovic", "2409980730057", "Menadzment");
		s1.stampanje();
		p2.stampanje();
		
	}

}
