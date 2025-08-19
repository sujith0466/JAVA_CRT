import java.util.Scanner;

class PatternPrograms {
    public static void butterflyPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) System.out.print("*");
            for (int j = 1; j <= 2*(n-i); j++) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) System.out.print("*");
            for (int j = 1; j <= 2*(n-i); j++) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }
    }

    public static void rightAngledTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) System.out.print("* ");
            System.out.println();
        }
    }

    public static void invertedTriangle(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) System.out.print("* ");
            System.out.println();
        }
    }

    public static void pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) System.out.print(" ");
            for (int j = 1; j <= 2*i-1; j++) System.out.print("*");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of pattern: ");
        int n = sc.nextInt();

        while (true) {
            System.out.println("\nPattern Menu:");
            System.out.println("1. Butterfly Pattern");
            System.out.println("2. Right-angled Triangle");
            System.out.println("3. Inverted Triangle");
            System.out.println("4. Pyramid");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    butterflyPattern(n);
                    break;
                case 2:
                    rightAngledTriangle(n);
                    break;
                case 3:
                    invertedTriangle(n);
                    break;
                case 4:
                    pyramid(n);
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
