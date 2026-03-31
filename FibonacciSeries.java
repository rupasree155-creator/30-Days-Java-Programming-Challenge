import java.util.Scanner;
class FibonacciSeries{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n1 = 0;
        int n2 = 1;
        System.out.println("Enter no of terms : ");
        int n = s.nextInt();
        System.out.println("Fibonacci Series : ");
        System.out.print(n1+" "+n2);
        for(int i = 1; i <= n - 2; i++){
            int n3 = n1 + n2;
            System.out.print(" "+n3);
            n1 = n2;
            n2 = n3;
            
        }
    }
}