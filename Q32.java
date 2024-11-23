public class Q32
{
    private int n;

    public Q32(int n)
    {
        this.n = n;
        System.out.println("The parameterized constructor is called with value: " + this.n);
    }

    public static void main(String[] args)
    {
        Q32 obj = new Q32(42);
    }
}
