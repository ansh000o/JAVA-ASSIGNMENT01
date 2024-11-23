import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        System.out.println("Enter the Year :");
        int year= S.nextInt();
        if(year%4==0 || year%400==0){
            System.out.println("This year is your Leap year");
        }
        else if(year%100==0){
            System.out.println("Sorry,This year is not a Leap year");
        }
        else {
            System.out.println("Sorry,This year is not a Leap year");
        }
    }
}