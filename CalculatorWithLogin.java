import java.util.Scanner;

class CalculatorWithLogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correctUsername = "admin";
        String correctPassword = "admin1234";

        System.out.print("Enter username: ");
        String username = sc.nextLine();
        System.out.print("Enter password: ");
        String password = sc.nextLine();

        if (!username.equals(correctUsername) || !password.equals(correctPassword)) {
            System.out.println("Invalid username or password. Exiting...");
            return;
        }

        System.out.println("Login successful!\n");

        while (true) {
            System.out.println("Calculator Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Exiting calculator...");
                break;
            }

            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();
            double result;

            switch (choice) {
                case 1:
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;
                case 2:
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;
                case 3:
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;
                case 4:
                    if (num2 == 0) System.out.println("Cannot divide by zero");
                    else {
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                    }
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            System.out.println();
        }
    }
}
