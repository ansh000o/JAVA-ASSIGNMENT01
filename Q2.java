import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        int a;
        Scanner S=new Scanner(System.in);
        System.out.print("give value of a : ");
        a=S.nextInt();
         if(a>0)
    {
        System.out.println("positive integer");
    }
    else if(a==0)
    {
        System.out.println("zero");
    }
    else{
        System.out.println("negative integer");
    }
    }
}