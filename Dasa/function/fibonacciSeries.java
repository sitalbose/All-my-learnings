package function;

import java.util.Scanner;

public class fibonacciSeries {
    public static void printFibonacci(int n){
        int firstTerm=0;
        int secondTerm=1;  // iniliaze the two no.s

        System.out.println("Fibonacci series "+n+" numbers are");

        for(int i=0;i<n;i++){
            System.out.print(firstTerm+ " ");
            int nextTerm=firstTerm+secondTerm;
            firstTerm=secondTerm;
            secondTerm=nextTerm;
        }

    }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        printFibonacci(n);
       
    }
    
}
