// Readfile.java
// Jason Yu
// 1602944
// Program 3 - Data Analysis
// Reads set of data and provides simple analysis on the data. Provides average, minimum, and maximum.

import java.util.*;
import java.io.*;
import java.io.FileNotFoundException;

public class ReadFile {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner scnr = new Scanner(System.in);
		double[] data = populateArray();
		
		String input = "";
		while(!(input.equals("quit"))){
			System.out.println("Enter the option \"average\", \"highest\", \"lowest\": ");
			input = scnr.nextLine();
			if(input.equalsIgnoreCase("average")){
				System.out.printf("Average rainfall since 1849: %.2f inches\n", findAverage(data));
				System.out.println();
			}
			else if(input.equalsIgnoreCase("lowest")){
				System.out.println("Lowest rainfall since 1849: " + data[findLowestYearIndex(data)] + " inches which occured during year " + (findLowestYearIndex(data) + 1849));
				System.out.println();
			}
			else if(input.equalsIgnoreCase("highest")){
				System.out.println("Highest rainfall since 1849: " + data[findHighestYearIndex(data)] + " inches which occured during year " +  (findHighestYearIndex(data) + 1849));
				System.out.println();
			}
			else if(input.equalsIgnoreCase("quit")){
				System.out.print("Program done.");
			}
			else{
				System.out.println("Invalid input");
				System.out.println();
			}
			
		}

	}
	
	public static double[] populateArray() throws FileNotFoundException{
		File file = new File("rainfall.txt");
		Scanner console = new Scanner(file);
		double[] data = new double[168];
		for(int i = 0; i < 168; i++){
			data[i] = console.nextDouble();
		}
		console.close();
		return data;
	}
	
	public static int findHighestYearIndex(double[] data){
		double max = data[0];
		int year = 0;
		for(int i = 1; i < 168; i++){
			if(data[i] > max){
				max = data[i];
				year = i;
			}
		}
		return year;
	}
	
	public static int findLowestYearIndex(double[] data){
		double min = data[0];
		int year = 0;
		for(int i = 1; i < 168; i++){
			if(data[i] < min){
				min = data[i];
				year = i;
				
			}
		}
		return year;
	}
	
	public static double findAverage(double[] data){
		double average = 0.0;
		double sum = 0;
		for(int i = 0; i < 168; i++){
			sum += data[i];
		}
		average = sum/168;
		 
		return average;
	}
	

}
