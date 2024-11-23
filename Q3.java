
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter first number");
        a=S.nextInt();
        System.out.println("Enter second number");
        b=S.nextInt();
        System.out.println("Enter third number");
        c=S.nextInt();

        int ans=a;
        if(ans<b)
        {
            ans=b;
        }
        if(ans<c)
        {
            ans=c;
        }
        System.out.println("The maximum is "+ans);

    }
    
}
