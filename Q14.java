import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int start, end;

        System.out.print("Enter starting: ");
        start = S.nextInt();
        System.out.print("Enter ending: ");
        end = S.nextInt();

        System.out.println("Multiples of 10 in the interval are:");
        for (int i = start; i <= end; i++)
        {
            if (i % 10 == 0) 
            {
                System.out.print(i + " ");
            }
        }
    }
}
