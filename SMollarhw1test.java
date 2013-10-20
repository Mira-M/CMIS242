package com.miramollar.hw1;

public class SMollarhw1test {

	public static void main(String[] args) {
		SMollarhw1 october20 = new SMollarhw1("Mira", 32.45, 345.78);
		System.out.println("The deposit for " + october20.getAuditor() + " is: \n" 
				+ "Register 1 Total: " + october20.getRegOne() + ".\n"
				+ "Register 2 Total: " + october20.getRegTwo() + ".\n"
				+ "Total Deposit: " + october20.getBankDeposit() + ".\n");
		
		/*
		 * This instance will add the default values of regOne and regTwo based on 
		 * protocols that may stipulate that an entry must be entered even if there 
		 * was no deposit for that day.
		 */
		SMollarhw1 october21 = new SMollarhw1("Shannon");
		System.out.println("The deposit for " + october21.getAuditor() + " is: \n"
				+ "Register 1 Total: " + october21.getRegOne() + ".\n"
				+ "Register 2 Total: " + october21.getRegTwo() + ".\n"
				+ "Total Deposit: " + october21.getBankDeposit() + ".\n");
	}// End Main

}// End class SMollarhwtest1
