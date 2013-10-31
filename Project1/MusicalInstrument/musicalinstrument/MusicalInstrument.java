package musicalinstrument;

public class MusicalInstrument {
	private String name;
	private String playType;
	private boolean isPlaying;
	private boolean isTuned;
	
	public MusicalInstrument() {
	}// End Constructor
	
	public MusicalInstrument (String name, boolean isPlaying, boolean isTuned, String playType) {
		this.name = name;
		this.isPlaying = isPlaying;
		this.isTuned = isTuned;
		this.playType = playType;
	}// End Overloaded Constructor
	
	// Return Instrument Name
	public String getName() {
		return name;
	}// End getName
	
	// Set a new Instrument Name
	public void setName(String name) {
		this.name = name;
	}// End setName
	
	// Return Play Type
	public String getPlayType() {
		return playType;
	}// End getPlayType
	
	// Set a new Instrument Play type
	public void setPlayType (String playType) {
		this.playType = playType;
	}// End setMethod
	
	// Set isPlaying
	public void setIsPlaying(boolean isPlaying) {
		this.isPlaying = isPlaying;
	}// End setIsPlaying
	
	// Return Playing
	public boolean isPlaying() {
		return isPlaying;
	}// End isPlaying

	// Return Tuned
	public boolean isTuned(){
		return isTuned;
	}// End is Tuned
	
	//Set is Tuned
	public void setIsTuned(boolean isTuned) {
		this.isTuned = isTuned;
	}// End setIsTuned
	
	public String display () {
		return "Instrument: " + name + "\nPlaying: " 
				+ isPlaying + "\nTuned: " + isTuned 
				+ "\nPlaying method: " + playType + "\n";
	}// End display

}// End Class MusicalInstrument
