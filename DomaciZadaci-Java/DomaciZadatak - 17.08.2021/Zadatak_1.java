package Primeri;

import java.util.Scanner;

public class DomaciZadatak08 {

	public static void main(String[] args) {

                /*
		Napisati program koji oponasa kviz za pogadjanje glavnog grada.
		- Program treba da ispisuje 3 opcije za izbor drzave + 1 opciju kao izlaz iz programa.
		    1. Francuska
		    2. Italija
		    3. Srbija
		    4. Izlaz
		- Nakon odabira drzave, potrebno je postaviti pitanje 'Koji je glavni grad drzave xxxxxxx ?'
		- Ako korisnik odgovori tacno, ispisuje se poruka 'Odgovor je tacan'
		- Ako korisnik odgovori netacno, ispisuje se poruka 'Odgovor nije tacan'
		- Nakon davanja odgovora (bilo da je tacan ili netacan), ponovo treba da se postave
		sve pocetne opcije i ponudi korisniku da odabere neku od njih.
		- Program se zavrsava kad korisni odabere 4. opciju 'Izlaz'
		- Program uraditi koriscenjem dosad naucenog + do-while petlje
                */	
		
		/*
		Prvi nacin: 
		
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		int opcija;
		String glavniGrad;
				
		do{
			System.out.println();
			System.out.println("Izaberite opciju od ponudjenih: ");
			System.out.println();
			
			System.out.println("1. Francuska");
		    System.out.println("2. Italija");
			System.out.println("3. Srbija");
			System.out.println("4. Izlaz");
			
			opcija = sc.nextInt();
			
			if(opcija == 1) {
				System.out.println("Koji je glavni grad Francuske? ");
				glavniGrad = sc.next();
					if(glavniGrad.equals("Pariz")) {
						System.out.println("Odgovor je tacan.");
					}else{
						System.out.println("Odgovor nije tacan.");		
					}
			}else if(opcija == 2){
				System.out.println("Koji je glavni grad Italije? ");
				glavniGrad = sc.next();
					if(glavniGrad.equals("Rim")) {
						System.out.println("Odgovor je tacan.");
					}else{
						System.out.println("Odgovor nije tacan.");	
					}
			}else if(opcija == 3){
				System.out.println("Koji je glavni grad Srbije? ");
				glavniGrad = sc.next();
					if(glavniGrad.equals("Beograd")) {
						System.out.println("Odgovor je tacan.");
					}else{
						System.out.println("Odgovor nije tacan.");		
					}
			}
			 
		}while(opcija != 4);
		
		System.out.println("Izasli ste iz programa.");

		sc.close();
		*/
		
		//Drugi nacin:
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dobrodosli u kviz: \"Pogodite glavni grad !\" ");
		boolean condition = true;

		
		do {
			System.out.println("Izaberite opciju: \n" + 
		               "1. Francuska \n" +
					   "2. Italija \n" +
		               "3. Srbija \n" +
					   "4. Izlaz");
			
			int indexOpcije = sc.nextInt();
			String glavniGrad = sc.next();
			
			switch(indexOpcije) {
			case 1:
				System.out.println("Koji je glavni grad Francuske ?");
				glavniGrad = sc.next();
				
				if(glavniGrad.equalsIgnoreCase("pariz")) {
					
					System.out.println("To je tacan odgovor!");
						
				}else {
					System.out.println("To nije tacan odgovor!");
				}
				
				break;
			case 2:
				System.out.println("Koji je glavni grad Italije ?");
				glavniGrad = sc.next();
				
				if(glavniGrad.equalsIgnoreCase("rim")) {
					
					System.out.println("To je tacan odgovor!");
						
				}else {
					System.out.println("To nije tacan odgovor!");
				}
				
				break;
			case 3:
				System.out.println("Koji je glavni grad Srbije ?");
				glavniGrad = sc.next();
				
				if(glavniGrad.equalsIgnoreCase("beograd")) {
					
					System.out.println("To je tacan odgovor!");
						
				}else {
					System.out.println("To nije tacan odgovor!");
				}
				break;
			case 4:
				System.out.println("Odabrali ste izlaz!");
				condition = false;
				break;
			default:
				System.out.println("Niste izabrali odgovarajucu opciju.");
			}
		              		
			
		}while(condition);
		
		sc.close();
		System.out.println("Kraj programa.");
		
	}
}
			
