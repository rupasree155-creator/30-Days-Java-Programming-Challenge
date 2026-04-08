import java.util.Scanner;

class ArrayInsertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array declaration
        int arr[] = new int[100];

        // Input size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        // Input elements
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input position and value
        System.out.print("Enter position to insert: ");
        int pos = sc.nextInt();

        System.out.print("Enter value to insert: ");
        int val = sc.nextInt();

        // Shift elements to the right
        for (int i = n; i >= pos; i--) {
            arr[i] = arr[i - 1];
        }

        // Insert value
        arr[pos - 1] = val;
        n++;

        // Display updated array
        System.out.println("Array after insertion:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}