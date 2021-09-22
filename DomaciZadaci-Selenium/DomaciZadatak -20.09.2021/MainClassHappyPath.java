package DomaciZadatakHappyPath;

import java.util.Scanner;

public class MainClassHappyPath {

	public static void main(String[] args) {

		
	Scanner s=new Scanner (System.in);	
	
    HappyPath p1=new HappyPath();
	
	SadPath s1=new SadPath();
	
	int izbor = 0;
	
	System.out.println("Izaberite od ponudjenih: \n1.Happy Path\n2.Sad Path");
	
    izbor=s.nextInt();
	
	
	switch (izbor)  {
	
	case 1:
		p1.happyPath();
		break;
		
	case 2:
		s1.sadPath();
		break;
		
	 }
   }
}