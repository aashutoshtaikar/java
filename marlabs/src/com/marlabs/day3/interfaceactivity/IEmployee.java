package com.marlabs.day3.interfaceactivity;

public interface IEmployee {
	public abstract void setEmpPassword(final String empPassword);

	public abstract String getEmpPassword();

	public abstract void doSalaryCalculation();

	void displaySalaryStatement(); // public abstract void displaySalaryStatement();

	public final static double DA_PERCENTILE = 0.03d;
	double HRA_PERCENTILE = 0.04; // public final static double HRA_PERCENTILE = 0.04;
}
