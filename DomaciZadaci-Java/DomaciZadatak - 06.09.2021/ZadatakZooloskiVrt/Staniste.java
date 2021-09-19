package ZooloskiVrt;

import java.util.ArrayList;

public class Staniste {
	//Napraviti klasu Staniste u kom se nalazi lista zivotinja koje u tom stanistu zive. 
	//Staniste takodje ima naziv koji moze da se dohvati ali ne i postavi.
	
	
    private String nazivStanista;

	private ArrayList<Zivotinje> listaZivotinja = new ArrayList<>();

	public Staniste(String nazivStanista) {

		this.nazivStanista = nazivStanista;

	}

	public void setListaZivotinja(Zivotinje zivotinja) {
		listaZivotinja.add(zivotinja);
	}

	public ArrayList<Zivotinje> getListaZivotinja() {
		return listaZivotinja;
	}

	public String getNazivStanista() {
		return this.nazivStanista;
	}

	public void stampaj() {
		System.out.println("Naziv stanista: " + nazivStanista + "\nLista zivotinja iz ovog stanista:");
		for (Zivotinje zivotinja : listaZivotinja) {
			System.out.println(zivotinja.getNaziv());
		}

	}
}