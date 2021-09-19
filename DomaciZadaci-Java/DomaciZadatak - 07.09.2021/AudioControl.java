package VideoPlayer;

public class AudioControl extends Control {
	/*Kreirati klasu AudioControl koja nasledjuje klasu Control i getere, setere i konstruktore.
	  Ima atribut koji kaze da li se smanjuje ili pojacava zvuk (tipa boolean). 
	  Implementirati metodu izvrsi akciju tako sto pojaca ili smanjuje zvuk za 1. U opsegu od 0 do 100.
	 */
	private boolean pojacava;
	
	public AudioControl(boolean pojacava){
		this.pojacava = pojacava;
	}

	public boolean isPojacava() {
		return pojacava;
	}

	public void setPojacava(boolean pojacava) {
		this.pojacava = pojacava;
	}

	@Override
	public void izvrsiAkciju(VideoPlayer vp) {
		if(pojacava = true){
			if(vp.getJacinaZvuka() < 100) {
				vp.setJacinaZvuka(vp.getJacinaZvuka() + 1);
			}else {
				vp.setJacinaZvuka(100);
			}
		}else {
			if(vp.getJacinaZvuka() > 0) {
			
			vp.setJacinaZvuka(vp.getJacinaZvuka() - 1);
				
			}else {
				vp.setJacinaZvuka(0);
			}
		
		}
		
	}

}
