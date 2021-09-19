package Primeri;

import java.util.Scanner;

public class DomaciZadatak09 {

	public static void main(String[] args) {
			
		/*
		Napisati program gde korisnik unosi pozitivne brojeve, 
		kad unese negativan broj prikaze mu se suma svih prethodno unetih brojeva
		 i na kraju zakomentarisati koje ste brojeve sve unosili po testu
		na primer:
		//test 1 x, y, z
		//test 2 x, y, z
		//test 3 x, y, z
		(Koristiti do while petlju)
		*/
		
		Scanner sc = new Scanner(System.in);
		int broj;
		int suma = 0;	
		
		
		do{
			
		System.out.print("Unesite pozitivan broj: ");
		broj = sc.nextInt();
		
		if(broj >= 0 ) {
		suma += broj;
		}else {
			System.out.println("Uneli ste negativan broj.");	
		}
		}while(broj > 0);
				
		System.out.println("Suma svih prethodno unetih brojeva je: " + suma);		
		
		sc.close();
		
		//test 1: 7, 9, 5, 3, -5;  rezultat je: 24
		//test 2: 10, 20, 30, 40, -50; rezultat je: 100
		//test 3: 0; rezultat je: 0
		//test 4: -5; rezultat je: 0		
		
  }
}
