package ZadatakAutobus;

public class Autobus {
	
	/*Autobus poseduje naziv, vozaca, cenu karte i putnika koji se njime voze. 
	 * Naziv i cena karte i zadaju se prilikom kreiranja. 
	 * Moguce je dodati/ukloniti putnika kao i vozaca.
	*/

	private String nazivAutobusa;
	private Vozac vozac;
	private int cenaKarte;
	private Putnik putnik;
	
	public Autobus(String nazivAutobusa, int cenaKarte, Vozac vozac, Putnik putnik) {
		
		this.setNazivAutobusa(nazivAutobusa);
		this.setVozac(vozac);
		this.setCenaKarte(cenaKarte);
		this.setPutnik(putnik);
	}

	public String getNazivAutobusa() {
		return nazivAutobusa;
	}

	public void setNazivAutobusa(String nazivAutobusa) {
		this.nazivAutobusa = nazivAutobusa;
	}

	public Vozac getVozac() {
		return vozac;
	}

	public void setVozac(Vozac vozac) {
		this.vozac = vozac;
	}

	public int getCenaKarte() {
		return cenaKarte;
	}

	public void setCenaKarte(int cenaKarte) {
		this.cenaKarte = cenaKarte;
	}

	public Putnik getPutnik() {
		return putnik;
	}

	public void setPutnik(Putnik putnik) {
		this.putnik = putnik;
	}

public String toString() {
		
		return "\nAutobus: " + nazivAutobusa +"\n" + vozac + "Cena karte: " + cenaKarte + "dinara." + "\n" + putnik;
	 	
  }
}
