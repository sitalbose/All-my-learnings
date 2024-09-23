package function;

import java.util.Scanner;

public class sumOddNo {
    // print the sum of all the odd no. between 1 to n
    public static void printSumOdd(int n){
        int sum=0;
        for(int i=0;i<n;i++){
            if(i%2!=0){
                sum+=i;

            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printSumOdd(n);
    }
    
}
