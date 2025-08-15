import java.util.Scanner;
class Array_operations {

    public static int linearSearch(int arr[],int Key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==Key) return 1;
        }
        return -1;
    }
    public static int binarySearch(int arr[],int Key){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==Key) return mid;
            else if(arr[mid]<Key) low=mid+1;
            else high=mid-1;
        }
        return -1;
    }
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
        public static void printArray(int[] arr) {
        for (int num : arr) System.out.print(num + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={7,5,4,1,2,6,3,8,9};
        int n=arr.length;
        while(true){
            System.out.println("\n 1.Linear Search\n 2.Binary Search\n 3.Bubble Sort\n 4.Exit\n Enter choice:");  
            int choice=sc.nextInt();
            switch (choice) {
                    case 1:
                        System.out.print("Enter element to search: ");
                        int key = sc.nextInt();
                        int res = linearSearch(arr, key);
                        if (res == -1) System.out.println("Element not found");
                        else System.out.println("Element found at index " + res);
                        break;
                    case 2:
                        System.out.print("Enter element to search: ");
                        int key1 = sc.nextInt();
                        int res1 = binarySearch(arr, key1);
                        if (res1 == -1) System.out.println("Element not found");
                        else System.out.println("Element found at index " + res1);
                        break;
                    case 3:
                        bubbleSort(arr);
                        System.out.println("Sorted array:");
                        printArray(arr);
                        break;
                    case 4:
                        System.out.println("Exiting program...");
                        return;
                    default:
                        System.out.println("Invalid choice");
                }

        }
    }
}
