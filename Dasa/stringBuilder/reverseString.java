package stringBuilder;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.next();

        StringBuilder str1 = new StringBuilder();

        str1.append(str);

        str1.reverse();

        System.out.println(str1);
    }
    
}
