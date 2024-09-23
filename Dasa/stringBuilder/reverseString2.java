package stringBuilder;

import java.util.Scanner;

public class reverseString2 {
    public static String reverseString(String str){
        StringBuilder reversed=new StringBuilder();

        for(int i=str.length()-1;i>=0;i--){
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String");
        String str=sc.next();
        
        String original=str;
        String reverse=reverseString(str);
        System.out.println("Orginal String  "+original);
        System.out.println("Reversed String "+ reverse);
        
        
    }
    
}
