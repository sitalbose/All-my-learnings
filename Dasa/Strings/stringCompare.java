package Strings;

import java.util.Scanner;

public class stringCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();

        if(s1.compareTo(s2)==0){
            System.out.println("Strings are equal ");

        }else{
            System.out.println("Strings are not equal");
        }
        
    }
    
}
