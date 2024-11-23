import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int a, temp, rev = 0, rem;

        System.out.print("Enter a number: ");
        a = S.nextInt();
        temp = a;

        while (a != 0)
        {
            rem = a % 10;
            rev = rev * 10 + rem;
            a /= 10;
        }

        if (temp == rev)
        {
            System.out.println("The number is a palindrome");
        }
        else
        {
            System.out.println("The number is not a palindrome");
        }
    }
}
