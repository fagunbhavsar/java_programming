import java.util.Scanner;
public class WeekdayName {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    int whichDay;
    String weekDay;

    System.out.println("Enter the day of the week: ");
    whichDay = keyboard.nextInt();

    if (whichDay == 0)
    {
      weekDay = "Saturday";
      System.out.println(weekDay);
    }
    else if(whichDay == 1)
    {
      weekDay = "Sunday";
      System.out.println(weekDay);
    }
    else if(whichDay == 2)
    {
      weekDay = "Monday";
      System.out.println(weekDay);
    }
    else if(whichDay == 3)
    {
      weekDay = "Tuesday";
      System.out.println(weekDay);
    }
    else if(whichDay == 4)
    {
      weekDay = "Wednesday";
      System.out.println(weekDay);
    }
    else if(whichDay == 5)
    {
      weekDay = "Thursday";
      System.out.println(weekDay);
    }
    else if(whichDay == 6)
    {
      weekDay = "Friday";
      System.out.println(weekDay);
    }
    else if(whichDay == 7)
    {
      weekDay = "Saturday";
      System.out.println(weekDay);
    }
    else
    {
      System.out.println("error");
    }
  }
}