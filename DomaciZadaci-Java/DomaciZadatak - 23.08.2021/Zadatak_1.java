package Primeri;

import java.util.Scanner;

public class DomaciZadatak13 {

	public static void main(String[] args) {
		
		/* 
		Funkcije1: Napisati program koji ce procitati 3 cela broja sa standardnog ulaza (znaci da korisnik unosi tri broja)
		i taj program treba da pozove i ispise (u mainu) najmanji od ta tri unesena broja.
		*/		

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite prvi broj: ");
		int prviBroj = sc.nextInt();
		System.out.print("Unesite drugi broj: ");
		int drugiBroj = sc.nextInt();
		System.out.print("Unesite treci broj: ");
        int treciBroj = sc.nextInt();
		
        System.out.println("Najmanji broj je: " + najmanjiBroj(prviBroj, drugiBroj, treciBroj));
        
		sc.close();
		}

	static int najmanjiBroj(int a, int b, int c) {
		
		int min = a;
		
		if(b < min) {
			min = b;
		}
		if(c < min){
			min = c;
		}
		
		return min;
	}
}

