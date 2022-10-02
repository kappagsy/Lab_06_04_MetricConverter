import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double meters = 0;
        double miles = 0;
        double feet = 0;
        double inches = 0;
        String trash = "";

        System.out.print("What is the measurement in meters? ");

        if (in.hasNextDouble())
        {
           meters = in.nextDouble();
           in.nextLine();
           miles = meters / 1609.344;
           feet = meters * 3.28084;
           inches = meters * 39.3701;
           System.out.println("You said that the measurement is: " + meters + " meters long.");
           System.out.println(meters + " meters is also equal to: " + miles + " miles, " + feet + " feet, and " + inches + " inches.");
        }
        else
        {
         trash = in.nextLine();
         System.out.println("You have entered invalid input. Please try again!");
         System.exit(0);
        }


    }
}