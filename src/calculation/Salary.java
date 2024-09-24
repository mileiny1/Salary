package calculation;
import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.print("Enter a gross salary: $");
double grossSalary = input.nextDouble();
System.out.print("Enter a taxrate %:");
double taxrate = input.nextDouble();

double totalTax = grossSalary * (taxrate / 100);
double netSalary = grossSalary - totalTax;
System.out.printf("The net salary is:$%.2f" , netSalary);
input.close();

	}

}
