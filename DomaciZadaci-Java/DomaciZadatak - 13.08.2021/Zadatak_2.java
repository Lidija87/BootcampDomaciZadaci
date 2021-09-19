import java.util.Scanner;

public class DomaciZadatak03 {

	public static void main(String[] args) {
		
		/*
		Napisati program gde preko skenera unesete broj, 
		ako je broj manji od 10 onda ga pomnoziti sa 100, 
		ako je broj veci od 100 onda ga podeliti sa 10. 
		Na kraju zakomentarisite koje brojeve ste koristili za proveru programa.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Unesi broj ");
		
		int broj = scanner.nextInt();
		
		if(broj < 10) {
			
			//ovde sam koristila brojeve 9, 10, 11
			
			int pomnozenBroj = broj * 100;
			System.out.println("Broj je manji od 10 i pomnozen je sa 100: " + pomnozenBroj);
		}else if(broj > 100) {
			
			//ovde sam koristila brojeve 99, 100 ,101
			
			double podeljenBroj = broj / 10;
			System.out.println("Broj je veci od 100 i podeljen je sa 10: " + podeljenBroj);
		}else {
			
			System.out.println("Broj nije manji od 10 i nije veci od 100");
		}
		
		scanner.close();
	}

}
