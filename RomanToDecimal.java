import java.util.Scanner;

class RomanToDecimal {
    public static int romanToInt(String s) {
        int result = 0;
        int prev = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int value = 0;
            char c = s.charAt(i);
            switch (c) {
                case 'I': value = 1; break;
                case 'V': value = 5; break;
                case 'X': value = 10; break;
                case 'L': value = 50; break;
                case 'C': value = 100; break;
                case 'D': value = 500; break;
                case 'M': value = 1000; break;
                default:
                    System.out.println("Invalid Roman numeral character: " + c);
                    return -1;
            }
            if (value < prev) result -= value;
            else result += value;

            prev = value;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter Roman numeral (or type 'exit' to quit): ");
            String roman = sc.nextLine().toUpperCase();

            if (roman.equals("EXIT")) {
                System.out.println("Exiting program...");
                break;
            }

            int decimal = romanToInt(roman);
            if (decimal != -1) {
                System.out.println("Decimal value: " + decimal);
            }
            System.out.println();
        }
    }
}
