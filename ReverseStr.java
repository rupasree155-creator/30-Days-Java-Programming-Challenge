import java.util.Scanner;
class ReverseStr{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = s.nextLine();
        
        String emt = "";
        
        for(int j = str.length() - 1; j >= 0; j--){
            emt = emt + str.charAt(j);
        }
        System.out.print("Reverse String is : "+emt);
    }
}  