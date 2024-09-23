package function;

import java.util.Scanner;

public class FuctionBasic {
    public static void printMyName(String name){
        System.out.println(name);
        return;
    
    }
    public static void main(String[] args) {
        System.out.println("Enter your name");
        // input the string
        Scanner sc = new Scanner(System.in);
        String name=sc.next();  // taking input and storing it

        printMyName(name); // calling the func


    }
    
}
