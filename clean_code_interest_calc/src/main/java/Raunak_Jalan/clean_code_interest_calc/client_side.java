package Raunak_Jalan.clean_code_interest_calc;
import java.util.Scanner;
import java.io.IOException;  

public class client_side
{
	public static void main(String[] args)throws IOException
	{
		int choice;
		
		App calculate = new App();
		
		Scanner scanner_var  = new Scanner(System.in);
		
		System.out.println("Interest Calculator...");
		System.out.println("1. Simple Interest");
		System.out.println("2. Compound Interest");
		System.out.println("Enter choice: ");
		
		choice = scanner_var.nextInt();
		
		System.out.println("Enter principle: ");
		double principle = scanner_var.nextDouble();
		
		System.out.println("Enter time: ");
		double time = scanner_var.nextDouble();
		
		System.out.println("Enter rate of interest: ");
		double rateOfInterest = scanner_var.nextDouble();
		
		if(choice == 1)
		{
			System.out.println("Simple Interest: "+calculate.simpleInterestCalculator(principle,time,rateOfInterest));
		}
		else
		{
			System.out.println("Compound Interest: "+calculate.compoundInterestCalculator(principle,time,rateOfInterest));
		}
		
		
	}
}