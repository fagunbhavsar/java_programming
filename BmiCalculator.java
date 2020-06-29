import java.util.Scanner;

public class BmiCalculator

{

	public static void main(String[] args)

	{
		Scanner keyboard = new Scanner(System.in);

		double myHeight, myWeight, myBmi;

		System.out.print(" Your height in m: ");
		myHeight = keyboard.nextDouble();

		System.out.print(" Your weight in kg: ");
		myWeight = keyboard.nextDouble();

		myBmi = myWeight/myHeight;

		System.out.print(" Your BMI is " + myBmi + " \n ");


	}
}