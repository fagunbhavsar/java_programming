import java.util.Scanner;

public class SpaceBoxing
{
	public static void main(String[] args){

		Scanner keyboard = new Scanner(System.in);

		int myWeight, planetNum;
		double weightOnPlanet;
		String myPlanet;

		System.out.println("Please enter your weight on earth in pounds: ");
		myWeight = keyboard.nextInt();

		System.out.println("Please enter the planet code: ");
		planetNum = keyboard.nextInt();


		if (planetNum == 1)
		{
			myPlanet = "Venus";
			weightOnPlanet = myWeight * 0.78;
			System.out.println("Your weight would be " + weightOnPlanet + " on " + myPlanet);
		}

		else if (planetNum == 2)
		{
			myPlanet = "Mars";
			weightOnPlanet = myWeight * 0.39;
			System.out.println("Your weight would be " + weightOnPlanet + " on " + myPlanet);
		}

		else if (planetNum == 3)
		{
			myPlanet = "Jupiter";
			weightOnPlanet = myWeight * 2.65;
			System.out.println("Your weight would be " + weightOnPlanet + " on " + myPlanet);
		}

		else if (planetNum == 4)
		{
			myPlanet = "Saturn";
			weightOnPlanet = myWeight * 1.17;
			System.out.println("Your weight would be " + weightOnPlanet + " on " + myPlanet);
		}

		else if (planetNum == 5)
		{
			myPlanet = "Uranus";
			weightOnPlanet = myWeight * 1.05;
			System.out.println("Your weight would be " + weightOnPlanet + " on " + myPlanet);
		}

		else if (planetNum == 6)
		{	
			myPlanet = "Neptune";
			weightOnPlanet = myWeight * 1.23;
			System.out.println("Your weight would be " + weightOnPlanet + " on " + myPlanet);
		}

		else if (planetNum == 7)
		{
			myPlanet = "Mercury";
			weightOnPlanet = myWeight * 0.20;
			System.out.println("Your weight would be " + weightOnPlanet + " on " + myPlanet);
		}

		else
		{
			System.out.println("You don't need to go anywhere! Just stay wherever you are!");
		}


	}
}