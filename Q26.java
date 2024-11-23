import java.util.Scanner;

public class Q26
{
    public static void main(String[] args)
    {
        Scanner S = new Scanner(System.in);
        int front = -1, rear = -1, choice, size;

        System.out.print("Enter the size of the queue: ");
        size = S.nextInt();
        int[] queue = new int[size];

        do
        {
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = S.nextInt();

            if (choice == 1)
            {
                if (rear == size - 1)
                {
                    System.out.println("Queue Overflow");
                }
                else
                {
                    System.out.print("Enter the element to enqueue: ");
                    int element = S.nextInt();
                    if (front == -1)
                    {
                        front = 0;
                    }
                    queue[++rear] = element;
                }
            }
            else if (choice == 2)
            {
                if (front == -1 || front > rear)
                {
                    System.out.println("Queue Underflow");
                }
                else
                {
                    System.out.println("Dequeued element: " + queue[front++]);
                }
            }
            else if (choice == 3)
            {
                if (front == -1 || front > rear)
                {
                    System.out.println("Queue is empty");
                }
                else
                {
                    System.out.println("Queue elements:");
                    for (int i = front; i <= rear; i++)
                    {
                        System.out.println(queue[i]);
                    }
                }
            }
        }
        while (choice != 4);
    }
}
