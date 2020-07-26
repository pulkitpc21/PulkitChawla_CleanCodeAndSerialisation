package clean_code.clean_code_construct_cost;
import java.util.Scanner;
import java.io.IOException;  


public class client_side
{
	public static void main(String[] args)throws IOException
	{
		
		App calculate = new App();
		
		Scanner scanner_var  = new Scanner(System.in);
		
		System.out.println("Construction Cost Calculator...");
		
		String materialStandard;
		double area;
		String automated;
		
		System.out.println("Enter Material Standard: ");
		materialStandard = scanner_var.nextLine();
		
		System.out.println("Enter total area of house: ");
		area = scanner_var.nextInt();
		
		scanner_var.nextLine();
		
		System.out.println("Do you want it fully automated? ");
		automated = scanner_var.nextLine();
		
		System.out.println("Total Cost: "+calculate.getCost(materialStandard, area, automated));
		
	}
}