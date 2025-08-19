import java.util.Scanner;

class QueueOperations {
    int[] queue;
    int front, rear, capacity;

    public QueueOperations(int size) {
        capacity = size;
        queue = new int[capacity];
        front = 0;
        rear = -1;
    }

    public void enqueue(int value) {
        if (rear == capacity - 1) {
            System.out.println("Queue Overflow");
            return;
        }
        queue[++rear] = value;
        System.out.println(value + " added to queue");
    }

    public void dequeue() {
        if (front > rear) {
            System.out.println("Queue Underflow");
            return;
        }
        int val = queue[front++];
        System.out.println(val + " removed from queue");
    }

    public void peek() {
        if (front > rear) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Front element is " + queue[front]);
    }

    public void display() {
        if (front > rear) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter queue size: ");
        int size = sc.nextInt();
        QueueOperations queue = new QueueOperations(size);

        while (true) {
            System.out.println("\n1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to enqueue: ");
                    queue.enqueue(sc.nextInt());
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.peek();
                    break;
                case 4:
                    queue.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
