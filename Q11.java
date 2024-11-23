import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int a, ans = 0;

        System.out.print("Enter a number to reverse: ");
        a = S.nextInt();

        while (a != 0)
        {
            int dig=a%10;
            ans=ans*10+dig;
            a=a/10;
        }

        System.out.println("Reversed number is " + ans);
    }
}
