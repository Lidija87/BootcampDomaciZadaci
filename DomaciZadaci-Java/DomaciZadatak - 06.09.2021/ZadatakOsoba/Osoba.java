package Osoba;

public class Osoba {
	
	private String imeiPrezime;
	private String jmbg;
	
	
	public Osoba(String imeiPrezime, String jmbg) {
		this.imeiPrezime = imeiPrezime;
		this.jmbg = jmbg;
	}
	
	public String getImeiPrezime() {
		return imeiPrezime;
	}
	public void setImeiPrezime(String imeiPrezime) {
		this.imeiPrezime = imeiPrezime;
	}
	public String getJmbg() {
		return jmbg;
	}
	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}
	
	public void stampanje () {
		System.out.println("Ime i prezime : " + this.imeiPrezime + "\nJMBG: " + this.jmbg);
	}

}
