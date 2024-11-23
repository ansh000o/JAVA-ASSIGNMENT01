import java.util.Arrays;
import java.util.Scanner;

public class Q22
{
    public static void main(String[] args)
    {
        Scanner S = new Scanner(System.in);
        int n;
        System.out.print("Enter the number of elements: ");
        n = S.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++)
        {
            nums[i] = S.nextInt();
        }

        Arrays.sort(nums);
        double ans;

        if (n % 2 == 0)
        {
            ans = (nums[n / 2 - 1] + nums[n / 2]) / 2.0;
        }
        else
        {
            ans = nums[n / 2];
        }

        System.out.println("The median is " + ans);
    }
}
