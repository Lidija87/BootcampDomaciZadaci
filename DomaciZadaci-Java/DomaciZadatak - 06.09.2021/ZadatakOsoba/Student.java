package Osoba;

public class Student extends Osoba{
	
	int brojIndeksa;
	
	public Student(String imeiPrezime, String jmbg, int brojIndeksa) {
		super(imeiPrezime, jmbg);
		this.brojIndeksa = brojIndeksa;
	}


	public int getBrojIndeksa() {
		return brojIndeksa;
	}

	public void setBrojIndeksa(int brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}
	
	public void stampanje() {
		System.out.println("Ime i prezime studenta: " + super.getImeiPrezime() + "\nJMBG: " + super.getJmbg() + "\nBroj indeksa: " + this.brojIndeksa + "\n");
	}

}
