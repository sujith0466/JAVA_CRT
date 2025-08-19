import java.util.Scanner;

class ArraySearching {
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) return i;
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) return mid;
            else if (arr[mid] < key) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array is:");
        for (int num : arr) System.out.print(num + " ");
        System.out.println();

        System.out.println("\nChoose search type:");
        System.out.println("1. Linear Search");
        System.out.println("2. Binary Search");
        int choice = sc.nextInt();

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        if (choice == 1) {
            int res = linearSearch(arr, key);
            if (res == -1) System.out.println("Element not found");
            else System.out.println("Element found at index " + res);
        } else if (choice == 2) {
            // Binary search requires sorted array
            java.util.Arrays.sort(arr);
            int res = binarySearch(arr, key);
            if (res == -1) System.out.println("Element not found");
            else System.out.println("Element found at index " + res);
        } else {
            System.out.println("Invalid choice");
        }
    }
}
