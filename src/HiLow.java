import java.util.Random;
import java.util.Scanner;

public class HiLow
{
    public static void main(String args[])
    {
        //declare variables
        final int MAX = 100;
        int  input, again = 1;
        double random, answer;
        Scanner scan = new Scanner(System.in);
        while(again == 1)
        {
            //get random number
            Random generator = new Random();
            answer = generator.nextInt(MAX) + 1;


            //tell user rules
            System.out.println("Try to guess what number I am thinking!"+
                    "I'll give you a hint, its between 1 and 100. Enter a negative number to exit.");

            //asking for input
            System.out.println("Enter your guess");
            input = scan.nextInt();
            while (input != answer &&  0 < input )
            {
                if (input > answer)
                {
                    System.out.println("Too hight! Try again!");
                    input = scan.nextInt();
                }//end if
                else
                {
                    System.out.println("Too low! Try again!");
                    input = scan.nextInt();
                }//end else
            }//end while

            //after game
            if (input == answer )
            {
                System.out.print("Congradulations, you guessed it!");

            }//end if
            else
            {
                System.out.println("oh no! you lost!");
            }//end else

            //ask to play a new game
            System.out.println("Do you want to play again? Enter 1 for yes and 0 for no.");
            again = scan.nextInt();
        }//end while

    }//end main
}
