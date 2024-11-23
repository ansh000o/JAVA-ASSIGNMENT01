import java.util.Scanner;

public class Q30
{
    public static void main(String[] args)
    {
        Scanner S = new Scanner(System.in);
        int n;

        System.out.print("Enter the number of elements: ");
        n = S.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++)
        {
            array[i] = S.nextInt();
        }

        System.out.println("Every alternate number:");
        for (int i = 0; i < n; i += 2)
        {
            System.out.print(array[i] + " ");
        }
    }
}
