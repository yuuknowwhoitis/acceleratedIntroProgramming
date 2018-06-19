// Custodian.java
// Jason Yu
// 1602944 
// Program 5: Payroll for Startup Company
// The program simulates the payroll of employees of a startup.

public class Intern extends Employee{
	Intern(int yearsWorked){
		super(yearsWorked);
	} // constructor

	final int UNPAID_VACATION = 10;
	final double HEALTH_INSURANCE = 5000; // $/year
	final double INCOME = 40000; // $/year
	int usedUnpaidVacation = 0; // keeps track of how much
							// unpaid vacation has been used.
	
	public void setUsedUnpaidVacation(int x){
		usedUnpaidVacation = x;
	}

	public int getUsedUnpaidVacation(){
		return usedUnpaidVacation;
	}
	
	void useUnpaidVacation() {
		usedUnpaidVacation++; // adds one to
	}
	
	

	// usedUnpaidVacation
	void workYear() {
		setYears(getYears() + 1); // Adds one to yearsWorked.
	}

	double YTDValue() {

		return HEALTH_INSURANCE + INCOME;
	}

	int yearsTillRetirement() { 
		return (int) (35.5 - (getYears() + ((double) usedUnpaidVacation / 260)));
	}
}
