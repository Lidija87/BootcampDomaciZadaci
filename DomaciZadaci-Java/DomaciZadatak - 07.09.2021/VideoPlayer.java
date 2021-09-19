package VideoPlayer;

public class VideoPlayer {
	 /*Kreirati klasu Video Player koja ima:
	 duzinu videa
	 trenutno vreme videa
	 jacinu zvuka
	 kvalitet videa (144, 240, 360, 480, 720, 1080)
	 getere, setere i konstruktore
	 metodu stampaj koja stampa podatke u formatu:
	 trenutno vreme videa
	 jacinu zvuka
	 kvalitet videa*/
	
	private int duzinaVidea;
	private int trenutnoVremeVidea;
	private int jacinaZvuka;
	private int kvalitetVidea;
		
	public VideoPlayer(int duzinaVidea, int trenutnoVremeVidea, int jacinaZvuka, int kvalitetVidea) {
		
		this.duzinaVidea = duzinaVidea;
		this.trenutnoVremeVidea = trenutnoVremeVidea;
		this.jacinaZvuka = jacinaZvuka;
		this.kvalitetVidea = kvalitetVidea;
	
	}
	public int getDuzinaVidea() {
		return duzinaVidea;
	}
	public void setDuzinaVidea(int duzinaVidea) {
		this.duzinaVidea = duzinaVidea;
	}
	public int getTrenutnoVremeVidea() {
		return trenutnoVremeVidea;
	}
	public void setTrenutnoVremeVidea(int trenutnoVremeVidea) {
		this.trenutnoVremeVidea = trenutnoVremeVidea;
	}
	public int getJacinaZvuka() {
		return jacinaZvuka;
	}
	public void setJacinaZvuka(int jacinaZvuka) {
		this.jacinaZvuka = jacinaZvuka;
	}
	public int getKvalitetVidea() {
		
		return kvalitetVidea;
	}
	public void setKvalitetVidea(int kvalitetVidea) {
		this.kvalitetVidea = kvalitetVidea;
	}
	
	public void stampa() {
		
		System.out.println("Trenutno vreme videa: " + this.trenutnoVremeVidea + "\nJacina zvuka: " + this.jacinaZvuka + "\nKvalitet videa: " + this.kvalitetVidea);
	}
	
}

