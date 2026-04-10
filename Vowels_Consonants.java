import java.util.Scanner;
public class Vowels_Consonants{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter a String :");
        String str = s.nextLine().toLowerCase();

        int vowels = 0;
        int consonants = 0;

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isLetter(ch)){
                if("aeiou".indexOf(ch) != -1){
                    vowels++;
                }
                else{
                    consonants++;
                }
            }
        }
        System.out.println("No of Vowels : "+vowels+ "\nNo of Consonants : "+consonants);
    }
}