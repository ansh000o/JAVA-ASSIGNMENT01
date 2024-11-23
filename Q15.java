import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int a;

        System.out.print("Enter a number for its multiplication table: ");
        a = S.nextInt();

        for (int i = 1; i <= 10; i++)
        {
            System.out.println(a + " x " + i + " = " + (a * i));
        }
    }
}
