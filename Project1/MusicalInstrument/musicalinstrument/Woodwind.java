package musicalinstrument;

public class Woodwind extends MusicalInstrument {

	public Woodwind() {
	}
	
	public void play () {
		setName("Woodwind");
		setPlayType("Reed");
		setIsPlaying(true);
		setIsTuned(true);
	}// End play
	
	public String display () {
		return super.display();
	}// End display
	
}// End Class Woodwind
