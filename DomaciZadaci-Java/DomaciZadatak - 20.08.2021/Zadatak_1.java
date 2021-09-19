package Primeri;

public class DomaciZadatak12 {

	public static void main(String[] args) {
		
		/*String gradovi[] = {"Beograd", "Nis", "Novi Sad", "Kraljevo", "Leskovac"};
		
		for(int i = 1; i < gradovi.length - 1; i++) {
					
				System.out.println("Grad[" + i + "]: " + gradovi[i]);		
				
		}
		*/
		/*Napisati program gde u nizu napisete ovih 5 gradova (Lisabon, London, Helsinki, Prag i Madrid)
	    a program stampa gradove sve dok ne dodje do "Prag"-a*/
		
		String straniGradovi [] = {"Lisabon", "London", "Helsinki", "Prag", "Madrid"};
		
		
		for(String grad: straniGradovi){
			
			if(grad.equals("Prag")) {
				
				break;
			}else {
				
				System.out.println("Grad: " + grad);		
			}
		}	
			
	}

}
