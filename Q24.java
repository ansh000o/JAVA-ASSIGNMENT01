import java.util.Scanner;

public class Q24
{
    public static void main(String[] args)
    {
        Scanner S = new Scanner(System.in);
        int n, sum = 0;

        System.out.print("Enter the size of the array: ");
        n = S.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++)
        {
            arr[i] = S.nextInt();
            sum += arr[i];
        }

        double avg = (double) sum / n;

        System.out.println("Sum of the array elements is " + sum);
        System.out.println("Average of the array elements is " + avg);
    }
}
