import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int a, count = 0;

        System.out.print("Enter an integer: ");
        a = S.nextInt();

        if (a == 0)
        {
            count = 1;
        } 
        else
        {
            while (a != 0)
            {
                a =a/ 10;
                count++;
            }
        }

        System.out.println("The number of digits is " + count);
    }
}
