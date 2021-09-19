package Osoba;

public class Profesor extends Osoba{
	
	private String predmet;

	public Profesor(String imeiPrezime, String jmbg, String predmet) {
		super(imeiPrezime, jmbg);
		this.setPredmet(predmet);
	}

	public String getPredmet() {
		return predmet;
	}

	public void setPredmet(String predmet) {
		this.predmet = predmet;
	}
	public void stampanje() {
		
	System.out.println("Ime i prezime profesora: " + super.getImeiPrezime() + "\nJMBG: " + super.getJmbg() + "\nPredmet: " + this.predmet + "\n");
	}
}
