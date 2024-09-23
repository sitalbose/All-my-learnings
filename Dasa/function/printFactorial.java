package function;

import java.util.Scanner;

public class printFactorial {

    public static void PrintFactorial(int n){
        int factorial=1; // initialize the value
        for(int i=n;i>1;i--){  // then value decreases and (n)*(n-1)*(n-2)....
            factorial=factorial*i;
        }
        System.out.println(factorial);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt(); // the no. which we want calculate the factorial
        PrintFactorial(n);
    }
    
}
