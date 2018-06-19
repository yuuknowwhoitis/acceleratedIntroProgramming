// BoardMember.java
// Jason Yu
// 1602944 
// Program 5: Payroll for Startup Company
// The program simulates the payroll of employees of a startup.

public class BoardMember extends Employee {
	BoardMember(int yearsWorked) {
		super(yearsWorked);
	} // constructor

	final double YEARLY_BONUS = 20000; // $/year
	final int PAID_VACATION = 20; // days
	final int UNPAID_VACATION = 10; // days
	final int SICK_LEAVE = 10; // days
	final double HEALTH_INSURANCE = 20000; // $/year
	final double INCOME = 200000; // $/year

	private int usedUnpaidVacation = 0; // keeps track of how much
	// unpaid vacation has been used.
	int usedVacation = 0; // keeps track of how much paid vacation
	// has been used.

	int usedSickDays = 0; // keeps track of how many sick days
	// have been used.

	public void setUsedUnpaidVacation(int x) {
		usedUnpaidVacation = x;
	}

	public void setUsedVacation(int x) {
		usedVacation = x;
	}

	public void setUsedSickDays(int x) {
		usedSickDays = x;
	}

	public int getUsedUnpaidVacation() {
		return usedUnpaidVacation;
	}

	public int getUsedVacation() {
		return usedVacation;
	}

	public int getUsedSickDays() {
		return usedSickDays;
	}

	void usePaidVacation() {
		usedVacation++;
	} // adds one to usedVacation
		// instance variable.

	void useUnpaidVacation() {
		usedUnpaidVacation++;
	} // adds one to
		// usedUnpaidVacation

	void useSickDay() {
		usedSickDays++;
	} // adds one to usedSickDays

	void workYear() {
		setYears(getYears() + 1);
	} // adds one to yearsWorked.

	double YTDValue() {
		return YEARLY_BONUS + HEALTH_INSURANCE + INCOME + (PAID_VACATION * (INCOME / 260))
				+ ((SICK_LEAVE - usedSickDays) * ((INCOME / 260) / 2));
	}
	int yearsTillRetirement() {
		return (int)( 35.5 - (getYears() + ((double) usedUnpaidVacation / 260) + (((double) usedVacation / 260) * 2) + ((double) usedSickDays / 260)));
	}
}
