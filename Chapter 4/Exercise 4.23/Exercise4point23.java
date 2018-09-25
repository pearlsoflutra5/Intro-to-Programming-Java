/*
Kacie Rae Cox
9-24-18
Code for Exercise 4.23 finding payroll using name, pay rate, and deductions. 
*/

import java.util.Scanner;

class Exercise4point23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/* also can declare here pr with system.out.print under.
		String name = "";
		double hours = 0;
		double payRate = 0;
		double federalTax = 0;
		double stateTax = 0;
		*/
		
		System.out.print("Enter employee's name (1 name only or no spaces): ");
		String name = input.next();
		
		System.out.print("Enter number of hours worked: ");
		double hours = input.nextDouble();
		
		System.out.print("Enter hourly pay rate: ");
		double payRate = input.nextDouble();
		
		System.out.print("Enter federal tax withholding rate: ");
		double federalTaxRate = input.nextDouble();
		
		System.out.print("Enter state tax withholding rate: ");
		double stateTaxRate = input.nextDouble();
		
		double grossPay = hours * payRate;
		double federalTax = grossPay * federalTaxRate;
		double stateTax = grossPay * stateTaxRate; 
		double totalDeduction = federalTax + stateTax; 
		double netPay = grossPay - totalDeduction;
		
		String out = "\n\n Employee name: " + name; // \n puts this on new line from line you said it on 
		out += "\n Hours worked: " + hours;
		out += "\n Pay Rate: $" + payRate;
		out += "\n Gross Pay: $" + grossPay * 100 / 100;
		out += "\n Deductions:";
		out += "\n\t Federal Withholding (" + federalTaxRate * 100  + " %) : $" + federalTax * 100 / 100.0;
		out += "\n\t State Withholding (" + stateTaxRate * 100  + " %) : $" + stateTax * 100 / 100.0;
		out += "\n\t Total Deductions: $ " + totalDeduction;
		out += "\n Net Pay: $" + netPay;

		System.out.print(out);		
		
	}
}