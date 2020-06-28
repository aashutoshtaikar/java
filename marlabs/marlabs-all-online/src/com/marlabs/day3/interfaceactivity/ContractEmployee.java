package com.marlabs.day3.interfaceactivity;

public class ContractEmployee extends Employee {
	float perDaySalary;
	float numberofDays;
	float takeHomeSalary;

	@Override
	public void doSalaryCalculation() {
		if (deptNumber == 10) {
			takeHomeSalary = Math.round(perDaySalary * numberofDays + (perDaySalary * numberofDays) * HRA_PERCENTILE);
		} else if (deptNumber == 20) {
			takeHomeSalary = Math.round(perDaySalary * numberofDays);
		}
	}

	/**
	 * @param number
	 * @param name
	 * @param job
	 * @param empPassword
	 * @param deptNumber
	 * @param perDaySalary
	 * @param numberofDays
	 * @param takeHomeSalary
	 */
	public ContractEmployee(int number, String name, String job, String empPassword, int deptNumber, float perDaySalary,
			float numberofDays, float takeHomeSalary) {
		super(number, name, job, empPassword, deptNumber);
		this.perDaySalary = perDaySalary;
		this.numberofDays = numberofDays;
		this.takeHomeSalary = takeHomeSalary;
	}

}
