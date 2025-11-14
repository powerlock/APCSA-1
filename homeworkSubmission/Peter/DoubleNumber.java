import java.util.Scanner;

public class Double
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter an integar: ");
        int number = input.nextInt();
        int count = 0;
        
        while(number <= 99 && number >= -99)
        {
            number *= 2;
            System.out.println(number);
            count++;
        }
        System.out.println("The number was doubled " + count + " times.");
    }
}
