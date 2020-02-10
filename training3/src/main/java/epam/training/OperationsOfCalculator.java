/**
 * 
 */
package epam.training;

/**
 * @author Vishwanath Reddy
 *
 */
public class OperationsOfCalculator 
{
	static int first_Number;
	static int second_Number;
	
	public void setOperands(int first_Number, int second_Number)
	{
		this.first_Number = first_Number;
		this.second_Number = second_Number;	
	}
	
	public void additionOfTwoNumbers() 
	{
		System.out.println("The Addition operation between the two numbers "+first_Number+" and "+second_Number+" is: "+(first_Number + second_Number));
	}
	
	public void subtractionOfTwoNumbers()
	{
		System.out.println("The Subtraction operation between the two numbers "+first_Number+" and "+second_Number+" is: "+(first_Number - second_Number));
	}
	
	public void multiplicationOfTwoNumbers()
	{
		System.out.println("The Multiplication operation between the two numbers "+first_Number+" and "+second_Number+" is: "+(first_Number * second_Number));
	}
	
	public void divisionOfTwoNumbers()
	{
		try {
			System.out.println("The Division operation between the two numbers "+first_Number+" and "+second_Number+" is: "+(first_Number / second_Number));
		}
		catch(Exception e)
		{
			System.out.println("Second Number cannot be 0");
		}
	}
}