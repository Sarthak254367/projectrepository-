import java.util.Scanner;

public class vowel {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter your name: ");
        String name=sc.nextLine().toLowerCase();
        
       
        for(int i=0; i<name.length(); i++ ){
            char ch =name.charAt(i);
         
          if(isVowel(ch)) {
                System.out.println(ch + " ");
            }

        }
    }

//checking if a character is vowel or not
 static  boolean isVowel(char ch){
    return  ch == 'a' || ch == 'e' || ch == 'i'
            || ch == 'o' || ch == 'u';
}
      
}