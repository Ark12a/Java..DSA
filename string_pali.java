import java.util.*;
public class String_Build{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String sv=sc.next();
        StringBuilder sb = new StringBuilder(sv);
        for(int i=0;i<sb.length()/2;i++){
            int f=i;
            int b = sb.length()-1-i;

            char fchar = sb.charAt(f);
            char bchar = sb.charAt(b);

            sb.setCharAt(f,bchar);
            sb.setCharAt(b,fchar);
        }
        System.out.println(sb);
        // if(sb==sv){
        //     System.out.println("Palindrome String");
        // }
        // else{
        //     System.out.println("Not a Palindrom String");
        // }
    }
}