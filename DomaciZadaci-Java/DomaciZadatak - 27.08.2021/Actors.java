package ClassActors;

public class Actors {
	
	public String nameAndSurname;
	public int birthYear;
	public char gender;
	private boolean married;
	private int earningsPerFilm;
	private int numberOfMovies; 
	private int totalEarnings;
	public int nextYear;
	
	public Actors(String nameAndSurname, int birthYear, char gender, boolean married, int earningsPerFilm, int numberOfMovies) {
		
		this.nameAndSurname = nameAndSurname;
		this.birthYear = birthYear;
		this.gender = gender;
		this.married = married;
		this.earningsPerFilm = earningsPerFilm;
		this.numberOfMovies = numberOfMovies;	
	}
	
	public Actors() {
		
	}
	
	public void setMarried(boolean married) {
		this.married = married;
	}
	
	public boolean getMarried() {
		return this.married;
	}
	
	public void setEarningsPerFilm(int earningsPerFilm) {
		this.earningsPerFilm = earningsPerFilm;
	}

	public double getEarningsPerFilm() {
		return this.earningsPerFilm;
	}
	
	public void setNumberOfMovies(int numberOfMovies) {
		this.numberOfMovies = numberOfMovies;
	}

	public int getNumberOfMovies() {
		return this.numberOfMovies;
	}
	
	public int totalEarnings() {
		
		int totalEarnings = this.earningsPerFilm * this.numberOfMovies;
		return totalEarnings;
	}
	
	public int nextYear() {
		
		int nextYear = 2022 - this.birthYear;
		return nextYear;
	}

	

   public void stampanje() {
		
		if(gender == 'M') {
			
			System.out.println("Name and surname of the actor: Mr. " + nameAndSurname + ".\nGender: " + gender + ".\nMarried: " + married +
					".\nEarnings per film: " + earningsPerFilm + " milions.\n" + "Number of films made: " + numberOfMovies + ".\nTotal earnings: " + 
					totalEarnings() + " milions.\nNext year will be " + nextYear() + " years old.\n\n");
		}else{
			
			System.out.println("Name and surname of the actor: Mrs. " + nameAndSurname + "\nGender: " + gender + "\nMarried: " + married +
					"\nEarnings per film: " + earningsPerFilm + " milions\n" + "Number of films made: " + numberOfMovies + ".\nTotal earnings: " + 
					totalEarnings() + " milions.\nNext year will be " + nextYear() + " years old.");
	}

   }
}
