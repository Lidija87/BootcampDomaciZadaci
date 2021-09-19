import java.util.Scanner;

public class DomaciZadatak02 {

	public static void main(String[] args) {

		/*
		 Uneti poluprecnik kruga
		 Ako je manji ili jednak od 0 -> vratiti poruku da poluprecnik nije validan
		 Ako je poluprecnik manji ili jednak od 5 izracunati P
		 Ako je poluprecnik veci od 5 izracunati 0
		 Ako je poluprecnik veci od 10 izracunati P i O
    	         napomena: pi=3.14    P = r*r*pi    O=2*r*pi
                 prikazati sa ugnjezdenim if-ovima
		 */
	
		Scanner scanner = new Scanner(System.in);
		
	
		System.out.println("Uneti poluprecnik kruga: ");
		
		double r = scanner.nextDouble();
		
		if(r <= 0) {
			
			System.out.println("Poluprecnik nije validan");
			
		}else if(r>0 && r<= 5){
			
			double p = r*r * Math.PI;
			System.out.println("Povrsina kruga je: " + p);
			
		}else if( r > 5 && r <= 10)  {
			
			double o = 2 * r * Math.PI;
			System.out.println("Obim kruga je: " + o);
			
		}else if(r > 10){
			
			double p = r*r * Math.PI;
			double o = 2 * r * Math.PI;
			
			System.out.println("Povrsina kruga je: " + p + " , a obim kruga je: " + o);
			
		}else{
			System.out.println("Kraj programa");
		}
			
		
		scanner.close();
	}

}
