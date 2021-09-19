package Primeri;

import java.util.Scanner;

public class DomaciZadatak15 {

	public static void main(String[] args) {
		/* 
		DodatniFunkcije3: -> spojena prva dva zadatka sa malo izmenjenim zahtevima -> 
		Napisati program koji ce procitati 3 cela broja sa standardnog ulaza i poziva i ispisuje dve metode. 
		Prva ispisuje zbir tri unesena broja, a druga vraca najveci od unetih brojeva.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite prvi broj: ");
		int prviBroj = sc.nextInt();
		System.out.print("Unesite drugi broj: ");
		int drugiBroj = sc.nextInt();
		System.out.print("Unesite treci broj: ");
		int treciBroj = sc.nextInt();
		
		System.out.println("Zbir unetih brojeva je: " + zbirBrojeva(prviBroj, drugiBroj, treciBroj));
		System.out.println("Najveci broj je: " + najveciBroj(prviBroj, drugiBroj, treciBroj));
		
		
		sc.close();
	}
	
	static int zbirBrojeva(int a, int b, int c) {
		
		int zbir = a + b + c;
		return zbir;
		
	}
	static int najveciBroj(int a, int b, int c) {
		
		int max = a;
		
		if(b > max) {
			
			max = b;
		}
		if(c > max) {
			
			max = c;
		}
			
		return max;
	}

}
