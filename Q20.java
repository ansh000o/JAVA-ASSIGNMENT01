import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int number;
        boolean isPrime = true;

        System.out.print("Enter a number: ");
        number = S.nextInt();

        if (number <= 1)
        {
            isPrime = false;
        }
        else
        {
            for (int i = 2; i <= Math.sqrt(number); i++)
            {
                if (number % i == 0)
                {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime)
        {
            System.out.println("The number is prime");
        } else {
            System.out.println("The number is not prime");
        }

    }
}
