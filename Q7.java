import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        int a;
        
        System.out.println("enter marks : ");
        a=S.nextInt();
        if(a>=90)
        {
            System.out.println("A grade");
        }
        else if(a>=80)
        {
            System.out.println("B grade");
        }
        else if (a>=70)
        {
            System.out.println("C grade");
        }
        else if(a>=60)
        {
            System.out.println("D grade");
        }
        else if(a>=40)
        {
            System.out.println("E grade");
        }
        else
        {
            System.out.println("F grade");
        }
    }
}
