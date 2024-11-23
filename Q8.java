
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int a = S.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = S.nextInt();

        if (divisor == 0)
        {
            System.out.println("Division by zero is not allowed");
        }
        else if (a % divisor == 0)
        {
            System.out.println(a + " is divisible by " + divisor);
        }
        else
        {
            System.out.println(a + " is not divisible by " + divisor);
        }
    }
}
