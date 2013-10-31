package musicalinstrument;

public class Percussion extends MusicalInstrument {

	public Percussion() {
	}
	
	public void play () {
		setName("Percussion");
		setPlayType("Hit");
		setIsPlaying(true);
		setIsTuned(true);
	}// End Play

	public String display () {
		return super.display();
	}// End display

}// End class Musical Instrument
