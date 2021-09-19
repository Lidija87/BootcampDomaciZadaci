package Primeri;

import java.util.Scanner;

public class DomaciZadatak11 {

	public static void main(String[] args) {
		
		 /*
		 Napisati program koji stampa sliku na ekranu za N redova. N unosi korisnik preko skenera.
		 (Koristiti for petlju)	 
		 */
		 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite neki prirodan broj: ");
		int N = sc.nextInt();
		String zvezdica = "*";	
		
		for(int i = 0; i < N; i++) {
			
			System.out.println(zvezdica);			
			zvezdica += "*";
			
		}
		System.out.println();		
		sc.close(); 	
		 
	}

}
