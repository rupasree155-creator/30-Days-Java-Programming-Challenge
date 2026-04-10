import java.util.Scanner;

class ArrayDeletion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[100];

        // Input size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        // Input elements
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input position to delete
        System.out.print("Enter position to delete: ");
        int pos = sc.nextInt();

        // Shift elements to left
        for (int i = pos - 1; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        n--;

        // Display updated array
        System.out.println("Array after deletion:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}