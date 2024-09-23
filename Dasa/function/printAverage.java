package function;

import java.util.Scanner;

public class printAverage {
    public static void PrintAverage(int n1,int n2, int n3){
        int average=(n1+n2+n3)/3;
        System.out.println("Average is"+" "+ average);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        PrintAverage(n1, n2, n3);

    }
    
}
