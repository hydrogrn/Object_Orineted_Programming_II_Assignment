
/**
 * Write a description of class number_guess here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
  import java.util.Random;
import java.util.Scanner;

public class GuessingGame 
{
    public static void main (String[]args)
    {
        int answer,attemptsNum = 0;
        final int maxAttempts = 5;
        String str, another = "y";
        int [] guess = new int [5];


        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
        answer = generator.nextInt(101)+1;

        System.out.println("Guess a number between 1 and 100");
        System.out.println("Enter your guess (0 to quit):");
        
            guess[attemptsNum] = scan.nextInt();
            while (guess[attemptsNum] != 0)
            {
                if(guess[attemptsNum]==answer)
                        System.out.println("Right!");
                else if (guess[attemptsNum]<answer)
                    System.out.println("Your guess was too LOW.");
                
                else if (guess[attemptsNum]>answer)
                    System.out.println("Your guess was too HIGH.");
                    break;
            }

            System.out.println("Want to Play again?(y/n)");
            another = scan.next();

            while (guess[attemptsNum] != answer && ++attemptsNum < maxAttempts){
                if (attemptsNum == maxAttempts)
                    System.out.println ("The number was " + answer);
                    guess[attemptsNum] = scan.nextInt();

                    

        
                }
                    System.out.println("The numbers guessed are");
                    attemptsNum = 0;
                    while (guess[attemptsNum] != answer && ++attemptsNum < maxAttempts){
                                     System.out.println (guess[attemptsNum]);

                
                 }
}// instance variables - replace the example below with your own
}
