import java.util.Scanner;
class LinearSearch{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("------LINEAR SEARCH------");
        System.out.print("Enter no of elements : ");
        int n = s.nextInt();

        int arr[] = new int[n];

        System.out.print("Enter elements : ");
        for(int i = 0; i < n; i++){
            arr[i] = s.nextInt();
        }

        System.out.print("Enter Search element : ");
        int x = s.nextInt();
        boolean found = false;
        for(int i = 0; i < n; i++){
            if(x == arr[i]){
                System.out.print(x+" is found at "+(i+1));
                found = true;
                break;
            }   
        }
        if(!found) 
            System.out.print(x+" is not found");

    }
}