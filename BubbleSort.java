import java.util.Scanner;
class BubbleSort{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the no.of elements in an array : ");
        int n = s.nextInt();

        int arr[] = new int[n];

        System.out.print("Enter the elements in an array : ");
        for(int i = 0; i < n; i++)
            arr[i] = s.nextInt();

        int temp;

        for( int i = 0; i < n - 1; i++){
            for( int j = 0; j < n - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp; 

                }
                
            }
        }
        System.out.print("Sorted elements : ");
        for(int i = 0; i < n; i++)
             System.out.print(arr[i]+" ");
    }
}