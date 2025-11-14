public class RandomNumber
{
    public static void main(String[] args)
    {
        int sum = 0;
        int count = 0;

        while (count < 5) 
        {
            int num = (int)(Math.random() * 10) + 1; 
            System.out.print(num + " ");
            sum += num;
            count++;
        }

        System.out.println("The average is " + (sum / 5.0));
    }
}
