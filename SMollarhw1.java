package com.miramollar.hw1;


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
		}
		
		public String getAuditor() {
			return auditor;
		}
		
		public double getRegOne () {
			return regOne;
		}
		
		public double getRegTwo () {
			return regTwo;
		}
		
		public double getBankDeposit () {
			return regOne + regTwo;
		}
		
	}// End class Deposit
	
}// End class SMollarhw1
