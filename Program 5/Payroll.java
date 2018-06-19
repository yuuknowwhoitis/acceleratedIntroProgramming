
public class Payroll {
	Payroll(int x){
		employees = new Employee[x];
	}
	Employee[] employees;
	
	public void setEmployees(Employee worker){
		
	}
	
	public Employee[] getEmployees(){
		return employees;
	}
	
	void sortEmployeesByRetirement(){
		int n = employees.length;
		for(int i = 0; i < n-1; i++){
			for(int j = 0; j < n - i - 1; j++){
				if(employees[j].yearsTillRetirement() > employees[j+1].yearsTillRetirement()){
					Employee temp = employees[j];
					employees[j] = employees[j + 1];
					employees[j + 1] = temp;
				}
			}
		}
	}
	
	void sortEmployeesByCost(){
		
		int n = employees.length;
		for(int i = 0; i < n-1; i++){
			for(int j = 0; j < n - i - 1; j++){
				if(employees[j].YTDValue() < employees[j+1].YTDValue()){
					Employee temp = employees[j];
					employees[j] = employees[j + 1];
					employees[j + 1] = temp;
				}
			}
		}
		
	}
}
