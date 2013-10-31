package musicalinstrument;

public class Strings extends MusicalInstrument {

	public Strings() {
	}

	public void play () {
		setName("Strings");
		setPlayType("Pluck & Bow");
		setIsPlaying(true);
		setIsTuned(true);
	}// End Play

	public String display () {
		return super.display();
	}// End display

}
