/**
 * 
 */
package epam.training;

/**
 * @author Vishwanath Reddy
 *
 */
import java.util.*;

public class Calculator 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two numbers in which the operations need to be performed: ");
		// Scanning input from the user.
		int first_Number = sc.nextInt();
		
		int second_Number = sc.nextInt(); 
		
		OperationsOfCalculator operations=new OperationsOfCalculator(); // creating object to perform operations.
		
		// Setting the operands in the OperationsOfCalculator class Setter Method to perform operations.
		operations.setOperands(first_Number, second_Number);
		
		System.out.println("Choose the operation need to be performed: ");
		
		System.out.println("1. Addition.\n2. Subtraction.\n3. Multiplication.\n4. Division.\n");
		
		int choose_Operation = sc.nextInt();
		
		switch(choose_Operation)
		{
			case 1:
				operations.additionOfTwoNumbers();
				break;
				
			case 2:
				operations.subtractionOfTwoNumbers();
				break;
			
			case 3:
				operations.multiplicationOfTwoNumbers();
				break;
				
			case 4:
				operations.divisionOfTwoNumbers();
				break;
			
			default:
				System.out.println("Choose operations i.e from 1-4 only");
		}
	}

}