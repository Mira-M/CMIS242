package com.miramollar.hw1;

/*
 * CMIS 242
 * S.Mollar
 * Due 10/27/13
 * Professor V. Gubanov
 * 
 */

public class SMollarhw1 {

	static class Deposit {
		
		private String auditor;
		private double regOne;
		private double regTwo;
		
		public Deposit (String auditor, double regOne, double regTwo){
			
			this.auditor = auditor;
			this.regOne = regOne;
			this.regTwo = regTwo;
		}// End Constructor
		
		public Deposit (String auditor) {
			
			this(auditor, 0.0, 0.0);
		}// End Constructor 2
		
		public String getAuditor() {
			
			return auditor;
		}// End getAuditor
		
		public double getRegOne () {
			
			return regOne;
		}// End getRegOne
		
		public double getRegTwo () {
			
			return regTwo;
		}//End getRegTwo
		
		public double getBankDeposit () {
			
			return regOne + regTwo;
		}//End getBankDeposit
		
	}// End class Deposit
	
}// End class SMollarhw1
