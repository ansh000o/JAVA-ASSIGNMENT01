import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n, math, phy, chem, total, mathphytotal;

        System.out.print("Enter the number of students: ");
        n = S.nextInt();

        for (int i = 1; i <= n; i++)
        {
            System.out.println("Enter marks for Student " + i + ":");
            System.out.print("Mathematics: ");
            math = S.nextInt();
            System.out.print("Physics: ");
            phy = S.nextInt();
            System.out.print("Chemistry: ");
            chem = S.nextInt();

            total = math + phy + chem;
            mathphytotal = math + phy;

            if ((math >= 60 && phy >= 50 && chem >= 40 && total >= 200) ||
                (math >= 60 && phy >= 50 && mathphytotal >= 150))
            {
                System.out.println("Student " + i + " is eligible");
            }
            else 
            {
                System.out.println("Student " + i + " is not eligible");
            }
        }
    }
}
