import java.util.Scanner;

public class MoreInputData

{
	public static void main( String[] args )

	{
		Scanner keyboard = new Scanner(System.in);

		String firstName;
		String lastName;
		String login;
		int    grade;
		int    id;
		double gpa;

		System.out.print(" First Name: ");
		firstName = keyboard.next();

		System.out.print(" Last Name: ");
		lastName = keyboard.next();

		System.out.print(" Grade (9-12) :" );
		grade = keyboard.nextInt();

		System.out.print(" Student ID: ");
		id = keyboard.nextInt();

		System.out.print(" Login: ");
		login = keyboard.next();

		System.out.print(" GPA (0.0 - 4.0) :" );
		gpa = keyboard.nextDouble();

		System.out.print(" Your information: \n " + " Login:  " + login + "\n" + " ID: " + id + "\n" + " Name: " + lastName + " , " + firstName + " \n" + "GPA: " + gpa + "\n" + "Grade: " + grade);



	}
}