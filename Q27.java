import java.util.Scanner;

public class Q27
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

        int smallest = array[0];
        for (int i = 1; i < n; i++)
        {
            if (array[i] < smallest)
            {
                smallest = array[i];
            }
        }

        System.out.println("The smallest number is " + smallest);
    }
}
