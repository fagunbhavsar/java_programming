import java.util.Scanner;

public class AgeInFiveYrs
{

	public static void main( String[] args )

	{
		Scanner keyboard = new Scanner( System.in );

		String myName;
		int myAge;
		int fiveMore;
		int fiveLess;

		System.out.print(" Hello, what is your name? ");
		myName = keyboard.next();

		System.out.print(" Hi, " + myName + " How old are you? ");
		myAge = keyboard.nextInt();

		fiveMore = myAge + 5;
		System.out.print(" Did you know that in five years you will be " + fiveMore + " years old? \n ");
		
		fiveLess = myAge - 5;
		System.out.print(" And five years ago you were " + fiveLess + " ! " + " Imagine that! \n ");
		


	}
}