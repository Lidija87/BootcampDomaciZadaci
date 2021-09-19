package primer01;

import java.util.Scanner;

public class DomaciZadatak01 {

	public static void main(String[] args) {
		
		/*
		Napisati program gde deklarisete vase ime, prezime kao string, pol kao char i odstampajte 
		adekvatno sva tri unosa. Nakon toga preko skenera treba da unesete ukupan broj medalja 
		koliko je Srbija osvojila na olimpijskim igrama i ukupan broj zlatnih medalja koliko je Srbija 
		osvojila na olimpijskim igrama, na kraju treba odstampati procenat zlatnih medalja u odnosu
		na ukupan broj medalja. Ako ima pitanja pisite u thread
	        */
				
		Scanner scanner = new Scanner(System.in);
		
		String ime = "Lidija";
		System.out.println("Ime: " + ime);
		
		String prezime = "Veljkovic Mirkovic";
		System.out.println("Prezime: " + prezime);
		
		char pol = 'ž';
		System.out.println("Pol: " + pol);
		
		System.out.println("Unesi ukupan broj medalja koliko je Srbija osvojila na olimpijskim igrama: ");
		double ukupanBrojMedalja = scanner.nextDouble();
		
		System.out.println("Unesi ukupan broj zlatnih medalja koliko je Srbija osvojila na olimpijskim igrama: ");
		double ukupanBrojZlatnihMedalja = scanner.nextDouble();
		
		double procenatZlatnihMedalja = ukupanBrojZlatnihMedalja  / ukupanBrojMedalja * 100;
		
	        System.out.println("Procenat zlatnih medalja u odnosu na ukupan broj medalja: " + procenatZlatnihMedalja + "%");
		
		scanner.close();
		
	}
}
