import java.util.Scanner;

public class CheckCharacterIsVowel {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String v=sc.next();
        char c=v.charAt(0);

        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            System.out.println("the character is vowel");
        }else
            System.out.println("the character is not vowel");

    }
}
