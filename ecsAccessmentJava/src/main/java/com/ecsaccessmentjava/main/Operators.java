package com.ecsaccessmentjava.main;

public class Operators {
	
	
	
	
	public String getGrade(double mark) {
		
		
		if (mark > 90d) {
			
			
			return "A1";
			
		} else if (mark > 80d) {
			
			
			
			return "A2";
		} else if (mark > 70d) {
			
			
			return "B1";
		} else if (mark > 60d) {
			
			
			return "B2";
		} else if (mark > 50d) {
			
			
			return "C1";
		} else if (mark > 40d) {
			
			
			return "C2";
		} else if (mark > 32d) {
			
			
			return "D";
		} else if (mark > 20d) {
			
			
			return "E1";
		} else {
			
			
			return "E1";

		}
	}
	public double getPercentage(double phyMark, double chemMark, double mathMark) {
		
		

		return ((phyMark + chemMark + mathMark) * 100) / (300);
	}
	public double getTotalmarks(double phyMark, double chemMark, double mathMark) {
		

		return phyMark + chemMark + mathMark;
	}
	public double getPoint(double mark) {
		
		if (mark > 90d) {
			
			
			
			return 10.0;
		} else if (mark > 80d) {
			
			
			
			return 9.0;
		} else if (mark > 70d) {
			
			
			
			return 8.0; 
		} else if (mark > 60d) {
			
			
			
			return 7.0;
		} else if (mark > 50d) {
			
			
			
			return 6.0;
		} else if (mark > 40d) {
			
			
			
			return 5.0;
		} else if (mark > 32d) {
			
		
			
			return 4.0;
		} else  {
			
			
			
			return 0.0;
		}
   
 }
}
