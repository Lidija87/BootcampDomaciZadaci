package Primeri;

import java.util.Scanner;

public class DomaciZadatak07 {

	public static void main(String[] args) {

		/*	
		While2: Napisati program koji ce na standardnom izlazu ispisati poruku “Laku noc!” onoliko puta koliko je korisnik zadao preko konzole.
		Primer: ako korisnik unese broj 20, poruku Laku noc! treba ispisati 20 puta
		*/

		Scanner sc = new Scanner(System.in);	
		
		System.out.println("Unesi broj");
		int n = sc.nextInt();
		
		int i= 0;
		
		while(i < n) {
			 
			System.out.println("Laku noc");
			i++;
		}
		
		sc.close();
		
	}

}
