import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int a;
        int first = 0, second = 1, next;

        System.out.print("Enter the number of terms for the Fibonacci series: ");
        a = S.nextInt();

        System.out.print("Fibonacci series: ");
        for (int i = 1; i<=a; i++)
        {
            System.out.print(first + " ");
            next = first + second;
            first = second;
            second = next;
        }
    }
}
