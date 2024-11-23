import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int a = 12;
        long b = 1;

        for (int i = 1; i<=a; i++)
        {
            b=b*i;
        }

        System.out.println("The factorial of " + a + " is " + b);
    }
}
