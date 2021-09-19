package Primeri;

import java.util.Scanner;

public class DomaciZadatak06 {

	public static void main(String[] args) {
		
		/*
		While1:Napisati program koji unosi i sabira brojeve dokle god nije unesen negativan broj,
		i ispisuje njihov zbir (zbir pozitivnih brojeva).
		primer: ako korisnik unese 1 2 5 3 -1,  program treba da ispise 11
	        */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Uneti broj: ");
		
		int broj = sc.nextInt();
		
		int i = 0;
		int zbir = broj;
		
		while(i < broj) {
					
			System.out.print("Uneti broj: ");
			broj = sc.nextInt();		
			
			if(broj > 0) {
				
			zbir = zbir + broj;
				
			}else {
				
				System.out.println("Uneli ste negativan broj. ");	
			}
		 }
		System.out.println("Zbir pozitivnih brojeva: " + zbir);	
		
		sc.close();
	}
}
	


