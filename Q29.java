import java.util.Scanner;
import java.util.HashMap;

public class Q29
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

        HashMap<Integer, Integer> frequency = new HashMap<>();
        for (int num : array)
        {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        System.out.println("Duplicate elements and their frequency:");
        for (int key : frequency.keySet())
        {
            if (frequency.get(key) > 1)
            {
                System.out.println(key + " occurs " + frequency.get(key) + " times");
            }
        }
    }
}
