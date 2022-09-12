package com.ecsaccessmentjava.model;

import com.ecsaccessmentjava.operators.Operators;

public class Student {
	
	private String name;
	private int addmissionNumber;
	private double physicsMarks;
	private double chemistryMarks;
	private double mathMarks;
	
	String physicsGrade;
	String  chemistryGrade ;
	String mathsGrade;
	double percentage;
	double totalMark;
	double physicsGradepoint;
	double chemistryGradepoint;
	
	
	
	public String getChemistryGrade() {
		return chemistryGrade;
	}
	public void setChemistryGrade(double chemistryMarks) {
		Operators cg = new Operators();
		chemistryGrade=cg.getGrade(chemistryMarks);

	}
	public String getMathsGrade() {
		
		return mathsGrade;
	}
	public void setMathsGrade(double mathMarks) {
		Operators cg = new Operators();
		mathsGrade=cg.getGrade(mathMarks);

	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double physicsMarks,double chemistryMarks,double mathMarks) {
		Operators cg = new Operators();
		percentage=cg.getPercentage(physicsMarks, chemistryMarks, mathMarks);
		

	}
	public double getTotalMark() {
		return totalMark;
	}
	public void setTotalMark(double physicsMarks,double chemistryMarks,double mathMarks) {
		Operators cg = new Operators();
		totalMark = cg.getTotalmarks(physicsMarks, chemistryMarks, mathMarks);

	}
	public double getPhysicsGradepoint() {
		return physicsGradepoint;
	}
	public void setPhysicsGradepoint(double physicsMarks) {
		Operators cg = new Operators();
		physicsGradepoint=cg.getPoint(physicsMarks);

	}
	public double getChemistryGradepoint() {
		return chemistryGradepoint;
	}
	public void setChemistryGradepoint(double chemistryMarks) {
		Operators cg = new Operators();
		chemistryGradepoint=cg.getPoint(chemistryMarks);

	}
	public double getMathsGradepoint() {
		return mathsGradepoint;
	}
	public void setMathsGradepoint(double mathMarks) {
		Operators cg = new Operators();
		mathsGradepoint=cg.getPoint(mathMarks);

	}
	double mathsGradepoint;
	
	
	public String getPhysicsGrade() {
		
		
		return physicsGrade;
	}
	public void setPhysicsGrade(double physicsMarks) {
		Operators cg = new Operators();
		physicsGrade=cg.getGrade(physicsMarks);

	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAddmissionNumber() {
		return addmissionNumber;
	}
	public void setAddmissionNumber(int admissionNumber) {
		addmissionNumber = admissionNumber;
	}
	public double getPhysicsMarks() {
		return physicsMarks;
	}
	public void setPhysicsMarks(double physicsmarks) {
		physicsMarks = physicsmarks;
	}
	public double getChemistryMarks() {
		return chemistryMarks;
	}
	public void setChemistryMarks(double chemistrymarks) {
		chemistryMarks = chemistrymarks;
	}
	public double getMathMarks() {
		return mathMarks;
	}
	public void setMathMarks(double mathmarks) {
		mathMarks = mathmarks;
	}
	
	
	
	
	
}

	
	
	
