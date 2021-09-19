package ZooloskiVrt;

public class GlavnaKlasa {

	public static void main(String[] args) {
		/*Zooloski vrt
		 * 
			Ispisati bar jednog sisara i jednu ribu kao vrstu zivotinje.
			Ispisati bar jedno staniste.
			Jednom sisaru zameniti ulogu koju mu je covek dodelio.
			*/
		
            	Sisari konj = new Sisari("Kicmenjaci", "Konj", "Trava", "Braon", "Pasa", "Domaca zivotinja");

				konj.stampaj(); 
				konj.setCovekovaPodela("Divlja zivotinja\n"); 

				
				Ribe deverika = new Ribe("Kicmenjaci", "Deverika", "Puzici i skoljkice", "Slatka voda", 4, "neka vrsta");
				deverika.stampaj();

				Staniste reka = new Staniste("Reka");

				reka.setListaZivotinja(deverika);
				

				reka.stampaj(); 

			}

		}

