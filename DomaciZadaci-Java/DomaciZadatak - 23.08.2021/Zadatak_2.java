package Primeri;

import java.util.Scanner;

public class DomaciZadatak14 {

	public static void main(String[] args) {
		
		/* 
		Funkcije2: Napisati program koji ce procitati 3 cela broja sa standardnog ulaza 
		i taj program treba da pozove i vrati (u mainu) proizvod unetih brojeva.
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite prvi broj: ");
		int prviBroj = sc.nextInt();
		System.out.print("Unesite drugi broj: ");
		int drugiBroj = sc.nextInt();
		System.out.print("Unesite treci broj: ");
		int treciBroj = sc.nextInt();
		
		System.out.println("Proizvod brojeva je: " + proizvodBrojeva(prviBroj, drugiBroj, treciBroj));
		

		sc.close();
	}
	
	static int proizvodBrojeva(int a, int b, int c) {
		
		int proizvod = a * b * c;
		return proizvod;
		
	}

}
