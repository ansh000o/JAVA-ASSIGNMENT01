import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int range, sum = 0;

        System.out.print("Enter range: ");
        range = S.nextInt();

        for (int i = 1; i <= range; i++)
        {
            sum = sum + i;
        }

        System.out.println("The sum of natural numbers up to " + range + " is " + sum);
    }
}
