import java.util.Scanner;

class NeonNumber {
    public static boolean isNeon(int num) {
        int square = num * num;
        int sum = 0;

        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }

        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number to check (or -1 to exit): ");
            int num = sc.nextInt();

            if (num == -1) {
                System.out.println("Exiting program...");
                break;
            }

            if (isNeon(num)) System.out.println(num + " is a Neon Number");
            else System.out.println(num + " is NOT a Neon Number");
        }
    }
}
