package Strings;

import java.util.*;

public class stringBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName=sc.nextLine();
        String lastName=sc.nextLine();

        String fullName=firstName+" "+lastName;
        System.out.println("Your full name is:"+ fullName);

        for(int i=0;i<fullName.length();i++){
            System.out.println(fullName.charAt(i));
        }


    }
    
}
