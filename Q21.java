import java.util.Scanner;

public class Q21
{
    public static void main(String[] args)
    {
        Scanner S = new Scanner(System.in);
        int ch, dec;
        String bin;

        System.out.println("Choose an option:");
        System.out.println("1. Binary to Decimal");
        System.out.println("2. Decimal to Binary");
        ch = S.nextInt();

        if (ch == 1)
        {
            System.out.print("Enter a binary number: ");
            bin = S.next();
            dec = Integer.parseInt(bin, 2);
            System.out.println("Decimal equivalent is " + dec);
        }
        else if (ch == 2)
        {
            System.out.print("Enter a decimal number: ");
            dec = S.nextInt();
            bin = Integer.toBinaryString(dec);
            System.out.println("Binary equivalent is " + bin);
        }
        else
        {
            System.out.println("Invalid choice");
        }
    }
}
