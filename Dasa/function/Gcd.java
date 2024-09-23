package function;

import java.util.Scanner;

public class Gcd {
    public static int gcd(int a, int b){
        int result=Math.min(a, b); // find the minimum between the two no.s
        while(result>0){
            if(a % result==0 && b % result==0){
                break;
            }
            result--;
        }
        // return gcd of a and b
        return result;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first no.");
        int a=sc.nextInt();
        System.out.println("Enter the second no.");
        int b=sc.nextInt();
        System.out.println("Gcd of 2 no.s "+gcd(a, b));
    }
}
