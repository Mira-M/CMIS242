import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SMollarhw2 {
	public static int intA;
	public static int intB;
	public static int result;
	public static int answer;
	public static boolean loop;
	
	public static class Divide {

	public static int divide2Ints (int intA, int intB) {
		if (intB == 0)
				throw new ArithmeticException("Divisor cannot be zero!");
			return (intA/intB);
		}// End divide2Ints
		
	public static void main(String[] args) {
		 //Create a new instance of JTextField
	      JTextField intAString = new JTextField(5);
	      JTextField intBString = new JTextField(5);
	      
	      //Enter the parameters to accept two integers
	      JPanel prompt = new JPanel();
	      prompt.add(new JLabel("1st integer:"));
	      prompt.add(intAString);
	      
	      prompt.add(Box.createHorizontalStrut(17));
	      
	      prompt.add(new JLabel("2nd integer:"));
	      prompt.add(intBString);
	      
	      //Try/Catch block to catch the ArithmenticException that can be thrown if 0 is entered
			try {
				JOptionPane.showMessageDialog(null, prompt,"Please enter two integers", JOptionPane.PLAIN_MESSAGE);

					JOptionPane.showMessageDialog(null, "The integers you entered are: "
							+ intAString.getText() + " and: "
							+ intBString.getText());
					
				
				//Convert JFields to Integers

				String inputA = intAString.getText();
				intA = Integer.parseInt(inputA);

				String inputB = intBString.getText();
				intB = Integer.parseInt(inputB);

				result = divide2Ints(intA, intB);
				
				//Displays results
				JOptionPane.showMessageDialog(null, intA + " / "
						+ intB + " = " + result
						+ "\n Thank you for using this program!");
			}// End try	
			
			catch (ArithmeticException e) { //Catches the AE exception and prompts user to reenter int

				JOptionPane.showMessageDialog(null, "Error: An integer cannot be divided by zero!");
				
				String inputBString = JOptionPane.showInputDialog(null, 
						"Please enter another integer to replace the"
						+ "\n value of the 2nd integer");
				intB = Integer.parseInt(inputBString);
				
				result = divide2Ints(intA,intB);
				JOptionPane.showMessageDialog(null, intA + " / "
						+ intB + " = " + result
						+ "\n Thank you for using this program!");

			}// End catch

		}// End main
	
	} // End Divide

}// End SMollarhw2
