import java.util.Scanner;

public class Q5{
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        System.out.println("Enter Distance in Miles :");
        float Miles=S.nextFloat();
        double KM=Miles*1.60934;
        System.out.println("Distance in KM is :"+KM);
    }
}