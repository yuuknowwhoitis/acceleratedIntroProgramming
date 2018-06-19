// Engineer.java
// Jason Yu
// 1602944 
// Program 5: Payroll for Startup Company
// The program simulates the payroll of employees of a startup.

public class Engineer extends Employee {

	Engineer(int yearsWorked) {
		super(yearsWorked);
	} // constructor

	final double YEARLY_BONUS = 5000; // $/year
	final int PAID_VACATION = 10; // days)
	final int UNPAID_VACATION = 10;
	final double HEALTH_INSURANCE = 10000; // $/year
	final double INCOME = 100000; // $/year
	int usedUnpaidVacation = 0;; // keeps track of how much
							// unpaid vacation has been used.
	int usedVacation = 0; // keeps track of how much paid vacation
						// has been used.

	public void setUsedUnpaidVacation(int x) {
		usedUnpaidVacation = x;
	}

	public void setUsedVacation(int x) {
		usedVacation = x;
	}

	public int getUsedUnpaidVacation() {
		return usedUnpaidVacation;
	}

	public int getUsedVacation() {
		return usedVacation;
	}

	void usePaidVacation() {
		usedVacation++;
	} // adds one to usedVacation

	// instance variable.

	void useUnpaidVacation() {
		usedUnpaidVacation++; // adds one to
	}

	// usedUnpaidVacation
	void workYear() {
		setYears(getYears() + 1); // Adds one to yearsWorked.
	}

	double YTDValue() {

		return YEARLY_BONUS + HEALTH_INSURANCE + INCOME + (PAID_VACATION * (INCOME / 260));
	}

	int yearsTillRetirement() {
		return (int)(35.5 - (getYears() + ((double) usedUnpaidVacation / 260) + ((double) usedVacation / 260) * 2));
	}
}