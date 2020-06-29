import java.util.Scanner;

public class YourAge

{
	public static void main(String[] args)

	{
		Scanner keyboard = new Scanner(System.in);

		int myAge;
		String myName;

		System.out.print("What is your name? ");
		myName = keyboard.next();

		System.out.print("What is your age? ");
		myAge = keyboard.nextInt();

		if ( myAge < 16 )
		{
			System.out.println(" You can't drive! " + myName + " \n " );
		}

		if ( myAge < 18 )
		{
			System.out.println(" You can't vote! " + myName + " \n " );
		}

		if ( myAge < 25 )
		{
			System.out.println(" You can't rent a car! " + myName + " \n " );
		}

		if( myAge >= 25 )
		{
			System.out.println(" You can do anything and everything! " + myName + " \n ");
		}

	}
}