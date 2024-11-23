import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int a, b, hcf = 1;
        System.out.print("Enter the first number: ");
        a = S.nextInt();
        System.out.print("Enter the second number: ");
        b = S.nextInt();
        for (int i = 1; i <= Math.min(a, b); i++)
        {
            if (a % i == 0 && b % i == 0)
            {
                hcf = i;
            }
        }
        System.out.println("HCF of " + a + " and " + b + " is " + hcf);
    }
}
