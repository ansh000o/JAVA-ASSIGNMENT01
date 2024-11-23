import java.util.Scanner;

public class Q28
{
    public static void main(String[] args)
    {
        Scanner S = new Scanner(System.in);
        int n, sum = 0;

        System.out.print("Enter the number of elements: ");
        n = S.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++)
        {
            array[i] = S.nextInt();
            if (array[i] % 2 != 0)
            {
                sum += array[i];
            }
        }

        System.out.println("The sum of all odd numbers is " + sum);
    }
}
