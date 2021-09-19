package Primeri;

public class DomaciZadatak16 {

	public static void main(String[] args) {
		
		/*
		ZADATAK
		F-ja  :  Povrsina pravougaonika
		F-ja  :  Obim pravougaonika
		*/

		int a = 7;
		int b = 4;
		
		int povrsina = getPovrsinaPravougaonika(a, b);
		System.out.println("Povrsina pravougaonika je : " + povrsina );
		
		int obim = getObimPravougaonika(a, b);
		System.out.println("Obim pravougaonika je : " + obim);	
			
	}
	
       static int getPovrsinaPravougaonika(int a, int b){
		
		return a * b;
       }
       
       static int getObimPravougaonika(int a, int b){ 
   		
   		return 2*a + 2*b;
   		
   	   }
}

