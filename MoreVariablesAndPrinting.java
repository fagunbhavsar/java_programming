public class MoreVariablesAndPrinting
{
    public static void main( String[] args )

    {
        String myName, myEyes, myTeeth, myHair;
        int myAge, myHeight, myWeight;

        myName = "Zed A. Shaw";
        myAge = 35; // years
        myHeight = 181; // cms
        myWeight = 95; //kgs
        myEyes = "Brown";
        myTeeth = "White";
        myHair = "Black";

        System.out.println( "Let's talk about " + myName + " . " );
        System.out.println( "He's " + myHeight + " cms tall. " );
        System.out.println( "He's " + myWeight + " kgs heavy. " );
        System.out.println( "Actually, that's not too heavy. " );
        System.out.println( "He's got " + myEyes + " eyes and " + myHair + " hair. " );
        System.out.println( "His teeth are usually " + myTeeth + " depending on the coffee. " );

        System.out.println( "If I add " + myAge + " , " + myHeight + " , and " + myWeight + " I get " + (myAge + myHeight + myWeight) + " . " ); 

    }

}