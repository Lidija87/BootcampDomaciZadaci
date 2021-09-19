package VideoPlayer;

import java.util.ArrayList;

public class GlavnaKlasa {

	public static void main(String[] args) {
		
		VideoPlayer v1 = new VideoPlayer(145, 40, 50, 144);
		v1.stampa();

		System.out.println("\nTrenutno vreme videa se pomera unapred: \n");

		TimeControl t1 = new TimeControl(true);
		t1.izvrsiAkciju(v1);
		v1.stampa();
		
		
		System.out.println("\nZvuk se pojacava: \n");

		AudioControl a1 = new AudioControl(true);
	    a1.izvrsiAkciju(v1);
		v1.stampa();
		

		System.out.println("\nKvalitet u zavisnosti od brzine interneta:\n ");

		QualityOptimizerControl o1 = new QualityOptimizerControl(25);
		o1.izvrsiAkciju(v1);
		v1.stampa();
		
		System.out.println("\nIzvrsene akcije: \n");

		ArrayList<Control> akcije = new ArrayList<Control>();
		akcije.add(t1);
		akcije.add(a1);
		akcije.add(o1);

		for (int i = 0; i < akcije.size(); i++) {
			akcije.get(i).izvrsiAkciju(v1);

		}

		v1.stampa();


	}

}
