import java.util.Scanner;
class PalindromeNum{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a num : ");
        long num = s.nextLong();
        long originalNum = num;
        long r = 0;
        long reversedNum = 0;
        while( num != 0){
            r = num % 10;
            reversedNum = reversedNum * 10 + r;
                
            num = num/10;
            
        }
        if(originalNum == reversedNum)
            System.out.println(originalNum+" is Palindrome");
        else
            System.out.println(originalNum+" is not Palindrome");
        s.close();
    }
}