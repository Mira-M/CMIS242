package com.miramollar.hw1;


public class SMollarhw1 {
	private String auditor;
	private double regOne;
	private double regTwo;
	
	public SMollarhw1(String auditor, double regOne, double regTwo) {
		this.auditor = auditor;
		this.regOne = regOne;
		this.regTwo = regTwo;
	}// End Constructor
	
	public SMollarhw1(String auditor) {
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

}
