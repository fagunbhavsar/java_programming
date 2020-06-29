import java.util.Scanner;

public class NameAgeNSalary

{
	public static void main( String[] args )

	{
		Scanner keyboard = new Scanner( System.in );

		String 	name;
		int 	age;
		double 	rate;

		System.out.print(" Hello.  What is your name? ");
		name = keyboard.next();

		System.out.print(" Hi, " + name + " ! How old are you? ");
		age = keyboard.nextInt();

		System.out.print(" So you're " + age + " eh?  That's not old at all! ");
		System.out.print(" How much do you make, " + name + "?" );
		rate = keyboard.nextDouble();

		System.out.print( rate + "!" + " I hope that's per hour and not per year! LOL! \n " );

	}
}

