package com.marlabs.day3.interfaceactivity;

public class PermanentEmployee extends Employee {
	double empBasic;
	double empCommission;
	double takeHomeSalary;

	@Override
	public void doSalaryCalculation() {
		if (deptNumber == 10) {
			takeHomeSalary = Math
					.round(empBasic + empBasic * HRA_PERCENTILE + empBasic * DA_PERCENTILE + empCommission + 1500);
		} else if (deptNumber == 20) {
			takeHomeSalary = Math
					.round(empBasic + empBasic * HRA_PERCENTILE + empBasic * DA_PERCENTILE + empCommission);
		} else if (deptNumber == 30) {
			takeHomeSalary = Math.round(empBasic + empCommission);
		}
	}

	/**
	 * @param number
	 * @param name
	 * @param job
	 * @param empPassword
	 * @param deptNumber
	 * @param empBasic
	 * @param empCommission
	 * @param takeHomeSalary
	 */
	public PermanentEmployee(int number, String name, String job, String empPassword, int deptNumber, double empBasic,
			double empCommission, double takeHomeSalary) {
		super(number, name, job, empPassword, deptNumber);
		this.empBasic = empBasic;
		this.empCommission = empCommission;
		this.takeHomeSalary = takeHomeSalary;
	}

}
