package musicalinstrument;

public class Brass extends MusicalInstrument {
	
	public Brass() {
	}
	
	public void play () {
		setName("Brass");
		setPlayType("Mouth Piece");
		setIsPlaying(true);
		setIsTuned(true);
	}// End Play

	public String display () {
		return super.display();
	}// End display

}// End Class Brass
