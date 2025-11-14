import java.util.Scanner;

public class MyProgram 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);

        System.out.print("What is the secret number? ");
        int secret = in.nextInt();

    
        for (int i = 0; i < 50; i++) 
        {
            System.out.println();
        }

        int guess = 0;
        int tries = 0;

        while (guess != secret) 
        {
            System.out.print("Guess the secret number: ");
            guess = in.nextInt();
            tries++;

        if (guess > secret) 
        {
            System.out.println("Too high.");
        } 
        else if (guess < secret) 
        {
        System.out.println("Too low.");
        }
    }

    System.out.println("Correct!");
    System.out.println("Number of guesses: " + tries);
  }
}
