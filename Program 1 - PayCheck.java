// PayCheck.java
// Jason Yu
// 1602944
// Program 1 - Paycheck Calculator
// Takes in hours worked and hourly wage to calculate total money made.

import java.util.Scanner;

public class PayCheck {

	public static void main(String[] args) {
		System.out.println("Please enter the total hours worked Monday through Sunday.");
		Scanner console = new Scanner(System.in);
		double h = console.nextInt();
		System.out.println("Please enter your pay rate (in terms of dollars per hour).");
		double r = console.nextDouble();
		System.out.printf("%.2f%n",calculate(h,r));
		
		

	}
	
	public static double calculate(double h,double r){
		double ot;
		ot = h-40;
		if(h<= 40){
			return(h*r);
		}
		if(h>40){
			return(ot*r*1.5 + 40*r);
		}
		if(h < 0){
			return 0;
		}
		else{
			return 0;
		}
	}
	
	

}
