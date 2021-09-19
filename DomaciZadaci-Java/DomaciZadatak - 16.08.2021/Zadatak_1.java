package Primeri;

import java.util.Scanner;


public class DomaciZadatak05 {

	public static void main(String[] args) {
	
		//Naci sumu parnih i sumu neparnih brojeva izmedju dva proizvoljno uneta broja
		
        Scanner sc = new Scanner(System.in); 
		
		System.out.print("Unesite prvi broj: ");	
		int brojMin = sc.nextInt();
		System.out.print("Unesite drugi broj: ");
		int brojMax = sc.nextInt();	
			
			if(brojMin > brojMax) {
				
				int tmp = brojMin;
				brojMin = brojMax;
				brojMax = tmp;
			}
			
			int iterator = brojMin;
			int zbirParnihBrojeva = 0;
			int zbirNeparnihBrojeva =0;
			
				
			while(iterator < brojMax) {
				
				if(iterator % 2 ==0 ) {
				zbirParnihBrojeva += iterator;
				System.out.println("  Iterator: " + iterator + " , zbir parnih brojeva:   " + zbirParnihBrojeva + ";");
			}else{
				zbirNeparnihBrojeva += iterator;
				System.out.println("  Iterator: " + iterator + " , zbir neparnih brojeva: " + zbirNeparnihBrojeva + ";");
			}	
		   iterator ++;
		}
	
		System.out.println("\n  Zbir parnih brojeva je " + zbirParnihBrojeva +  ", a zbir neparnih brojeva je " + zbirNeparnihBrojeva + ".");
		
		sc.close();
	}
}
		
		