import java.util.Scanner;

class Commission
{
    private double sales;

    public Commission(double sales)
    {
        this.sales = sales;
    }

    public double commission()
    {
        return sales * 0.1; // Assuming 10% commission rate
    }
}

public class Q33
{
    public static void main(String[] args)
    {
        Scanner S = new Scanner(System.in);
        double sales;

        System.out.print("Enter the sales amount: ");
        sales = S.nextDouble();

        if (sales < 0)
        {
            System.out.println("Invalid Input");
        }
        else
        {
            Commission obj = new Commission(sales);
            double comm = obj.commission();
            System.out.println("The commission is: " + comm);
        }
    }
}
