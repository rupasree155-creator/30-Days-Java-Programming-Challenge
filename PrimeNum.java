import java.util.Scanner;
class PrimeNum{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = s.nextInt();
        int count = 0;
        for(int i = 1; i <= n; i++){
            if(i % 2 == 0)
                count++;
        }
        if(count == 2)
            System.out.println(n+" is a Prime Number.");
        else{
            System.out.println(n+" is NOT a Prime Number.");
        }
    }
}