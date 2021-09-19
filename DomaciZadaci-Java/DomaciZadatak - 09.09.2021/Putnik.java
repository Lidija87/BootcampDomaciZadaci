package ZadatakAutobus;

public class Putnik extends Covek{
	
	/*Putnik je covek koji poseduje novac. Inicijalno poseduje odredjenu kolicinu novca koja mu se zadaje prilikom kreiranja. 
	Odredjena svota novca moze da mu se doda i/ili oduzme, gde je potrebno vratiti indikator uspesnosti.
	*/
	private int novac;
	
	public Putnik(String ime, String prezime, int novac) {
		super(ime, prezime);
		this.novac = novac;
	}
	
	public void dodavanjeNovca(int novac) {
		
		this.novac += novac;
	}
	public void oduzimanjeNovca(int novac) {
		
		this.novac -= novac;
	}
	
	public int getNovac(){
		return novac;
	}
	
	
	@Override 
	
	public String toString() {
		
		return "Putnik: " + super.getIme() + " " + super.getPrezime() + " ima " + novac + " dinara.";
	}
}
