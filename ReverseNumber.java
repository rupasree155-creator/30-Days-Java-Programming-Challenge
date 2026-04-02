import java.util.Scanner;
class ReverseNumber{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a num : ");
        long n = s.nextLong();
        long result = 0;
        System.out.print("Reversed Number : ");
        while( n != 0){
            result = n % 10;
            System.out.print(result+" ");
            n = n/10;
            
        }
        
        s.close();
    }
}