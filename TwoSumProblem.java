import java.util.Scanner;

class TwoSumProblem {
    public static void findTwoSum(int[] arr, int target) {
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Pair found: " + arr[i] + " + " + arr[j] + " = " + target);
                    found = true;
                }
            }
        }
        if (!found) System.out.println("No pair found for target " + target);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        while (true) {
            System.out.print("Enter target sum (-1 to exit): ");
            int target = sc.nextInt();

            if (target == -1) {
                System.out.println("Exiting program...");
                break;
            }

            findTwoSum(arr, target);
            System.out.println();
        }
    }
}
