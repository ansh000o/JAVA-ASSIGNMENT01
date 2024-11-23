import java.util.Scanner;

public class Q25
{
    public static void main(String[] args)
    {
        Scanner S = new Scanner(System.in);
        int top = -1, choice, size;

        System.out.print("Enter the size of the stack: ");
        size = S.nextInt();
        int[] stack = new int[size];

        do
        {
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = S.nextInt();

            if (choice == 1)
            {
                if (top == size - 1)
                {
                    System.out.println("Stack Overflow");
                }
                else
                {
                    System.out.print("Enter the element to push: ");
                    int element = S.nextInt();
                    stack[++top] = element;
                }
            }
            else if (choice == 2)
            {
                if (top == -1)
                {
                    System.out.println("Stack Underflow");
                }
                else
                {
                    System.out.println("Popped element: " + stack[top--]);
                }
            }
            else if (choice == 3)
            {
                if (top == -1)
                {
                    System.out.println("Stack is empty");
                }
                else
                {
                    System.out.println("Stack elements:");
                    for (int i = top; i >= 0; i--)
                    {
                        System.out.println(stack[i]);
                    }
                }
            }
        }
        while (choice != 4);
    }
}
