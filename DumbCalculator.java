import java.util.Scanner;

public class DumbCalculator

{
	public static void main( String[] args )

	{
		Scanner keyboard = new Scanner(System.in);

		double num0, num1, num2, division;

		System.out.print(" What is the first number? " );
		num0 = keyboard.nextDouble();

		System.out.print(" What is the second number? \n" );
		num1 = keyboard.nextDouble();

		System.out.print(" What is the third number? \n" );
		num2 = keyboard.nextDouble();

		division = (num0 + num1 + num2)/2 ;


		System.out.print( "(num0 + num1 + num2)/2" + " is " + "....." + division + "\n" );

	}

}