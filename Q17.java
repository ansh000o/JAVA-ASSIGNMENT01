import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int a, b, lcm;

        System.out.print("Enter the first number: ");
        a = S.nextInt();
        System.out.print("Enter the second number: ");
        b = S.nextInt();

        lcm = Math.max(a, b);
        while (true) 
        {
            if (lcm % a == 0 && lcm % b == 0)
            {
                break;
            }
            lcm++;
        }

        System.out.println("LCM of " + a + " and " + b + " is " + lcm);
    }
}
