package com.miramollar.hw1;

/*
 * CMIS 242
 * S.Mollar
 * Due 10/27/13
 * Professor V. Gubanov
 * 
 */

public class SMollarhw1test {

	public static void main(String[] args) {
		
		// Creates an instance of Deposit Class for a deposit for October 20th
		Deposit october20 = new Deposit("Mira", 32.42, 345.78);
		
		System.out.println("The deposit for " + october20.getAuditor() + " is: \n" 
				+ "Register 1 Total: $" + october20.getRegOne() + ".\n"
				+ "Register 2 Total: $" + october20.getRegTwo() + ".\n"
				+ "Total Deposit: $" + october20.getBankDeposit() + ".\n");
		
		/*
		 * This instance will add the default values of regOne and regTwo based on 
		 * protocols that may stipulate that an entry must be entered even if there 
		 * was no deposit for that day.
		 */
		
		Deposit october21 = new Deposit("Shannon");
		
		System.out.println("The deposit for " + october21.getAuditor() + " is: \n"
				+ "Register 1 Total: $" + october21.getRegOne() + ".\n"
				+ "Register 2 Total: $" + october21.getRegTwo() + ".\n"
				+ "Total Deposit: $" + october21.getBankDeposit() + ".\n");
		
		// Creates an instance of Deposit Class for a deposit for October 22nd
		Deposit october22 = new Deposit ("Rebecca", 44.5, 789.45);
		
		System.out.println("The deposit for " + october22.getAuditor() + " is: \n"
				+ "Register 1 Total: $" + october22.getRegOne() + ".\n"
				+ "Register 2 Total: $" + october22.getRegTwo() + ".\n"
				+ "Total Deposit: $" + october22.getBankDeposit() + ".\n");
	}// End Main

}// End class SMollarhwtest1
