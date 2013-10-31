package musicalinstrument;

public class TestMusicalInstrument {

	public static void main(String[] args) {
		
		//Play Woodwind
		Woodwind playWoodwind = new Woodwind(); // creates an instance of class Woodwind
		
		playWoodwind.play();

		System.out.println(playWoodwind.display());
		
		// Play Brass
		Brass playBrass = new Brass(); // creates an instance of class Brass
		
		playBrass.play();
		
		System.out.println(playBrass.display());
		
		//Play Strings
		Strings playStrings = new Strings(); // creates an instance of class Strings
		
		playStrings.play();
		
		System.out.println(playStrings.display());
		
		//Play Percussion
		Percussion playPercussion = new Percussion(); // creates an instance of class Percussion
		
		playPercussion.play();
		
		System.out.println(playPercussion.display());
		
	}// End Main

}// End class TestMusicalInstrument
