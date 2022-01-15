package finalProject;
import java.util.Scanner;
import java.text.DecimalFormat;
public class currencyConvert {
	public static void main(String[] args) {
		 
		double amount,dollar, pound, code, euro, yen;
 
		
		Scanner input = new Scanner(System.in);
 
		System.out.println("Welcome to the Currency Converter!");
 
		System.out.println("which currency You want to Convert ? ");
		
		System.out.println("\n1:Dollar \n2:Pound \n2:Euro \n4:Yen");
		code = input.nextInt();
		
		System.out.println("How much Money you want to convert ?");
		amount = input.nextFloat();
 
		// For amounts Conversion
		
			if (code == 1) {
			// For Dollar Conversion
			
			pound = amount * 0.73;
			System.out.println("Your " + amount + " Dollar is : " + pound + " Pound");
 
			euro = amount * 0.88;
			System.out.println("Your " + amount + " Dollar is : " + euro + " Euro");
 
			yen = amount * 114.24;
			System.out.println("Your " + amount + " Dollar is : " +yen + " Yen");
 
			
		} else if (code == 2) {
			// For Pound Conversion
 
			
			dollar = amount * 1.37;
			System.out.println("Your " + amount + " pound is : " + dollar + " Dollar");
 
			euro = amount * 1.20;
			System.out.println("Your " + amount + " pound is : " + euro + " Euro");
 
			yen = amount * 156.15;
			System.out.println("Your " + amount + " pound is : " + yen + " Yen");
 
			
		} else if (code == 3) {
			// For Euro Conversion
 
			
 
			dollar = amount * 1.14;
			System.out.println("Your " + amount + " euro is : " + dollar + " Dollar");
 
			pound = amount * 0.83;
			System.out.println("Your " + amount + " euro is : " + pound + " Pound");
 
			yen = amount * 130.39;
			System.out.println("Your " + amount + " euro is : " + yen + " Yen");
 
		
		} else if (code == 4) {
 
			// For Yen Conversion
 
			
			dollar = amount * 0.008;
			System.out.println("Your " + amount + " yen is : " + dollar + " Dollar");
 
			pound = amount * 0.006;
			System.out.println("Your " + amount + " yen is : " + pound + " Pound");
 
			euro = amount * 0.007;
			System.out.println("Your " + amount + " yen is : " + euro + " Euro");
 
			
		}else {
			System.out.println("Invalid input");
		}
		
		
	}
	

}


