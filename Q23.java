public class Q23
{
    public static void main(String[] args)
    {
        int num = 1;

        for (int i = 1; i <= 3; i++)
        {
            for (int j = 1; j <= 2 * i - 1; j++)
            {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
        System.out.println("");
        System.out.println("");
        for (int i = 1; i <= 4; i++)
        {
            for (int j = i; j >= 1; j--)
            {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
