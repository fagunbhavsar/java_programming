import java.util.Scanner;

public class HowOldAreYou

{
	public static void main(String[] args){

		int age;
		String name;

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Please enter your name: ");
		name = keyboard.next();

		System.out.println("Please enter your age: ");
		age = keyboard.nextInt();

		if (age < 16)
		{
			System.out.println("You can't drive!");
		}

		else if (age >= 16 && age <= 17)
		{
			System.out.println("You can drive but not vote!");
		}

		else if (age >=18 && age <= 24)

		{
			System.out.println("You can drive and vote but not rent a car!");
		}

		else if (age >= 25)

		{
			System.out.println("You can do almost anything!");
		}
	}
}