import java.util.Scanner;

public class CaseStudy {

	public static void main(String[] args) {
	// CONVERT A HEXADECIMAL DIGIT TO DECIMAL VALUE.
		Scanner input= new Scanner (System.in);
			
		System.out.println("Enter a Hexadecimal digit from 0-9,A-F");
		String Hexadecimal =input.nextLine();
		
		int Decimal = Integer.parseInt(Hexadecimal,16);
		
		System.out.println("The result of Hexadecimal digit which is "+ Hexadecimal+" converted to decimal is "+Decimal );
		
		
		
	
		
			
		
		
		
	
		
		

	}

}
