package ZadatakAutobus;

public class Vozac extends Covek{
 //Vozac je covek koji poseduje i zvanje (zanimanje -> sofer).
	
	private String zvanje;
	
	public Vozac(String ime, String prezime, String zvanje) {
		super(ime, prezime);
		this.zvanje = "Sofer";
	}


	public String toString() {
		
		return super.toString() + " - Zvanje: " + zvanje;
	}
	
}
