import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        System.out.println("Enter tempture in Celsius:");
        float Cel=S.nextFloat();
        float Fahr=Cel*(9/5)+32;
        System.out.println("Tempreture in Fahrenheit is :"+Fahr);
        
        System.out.println("Enter tempture in Fahrenheit :");
        Fahr=S.nextFloat();
        Cel=(Fahr-32)*5/9;
        System.out.println("Tempreture in Celsius is :"+Cel);

        
    }
}
