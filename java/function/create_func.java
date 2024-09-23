package function;

import java.util.Scanner;

public class create_func {
    public static int f(int x){  // this function in java representing f(x)=x^2, it returns the sqaure of a number
        int xsqaure=x*x;
        return xsqaure;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int x=sc.nextInt();

        int sqaure_of_num=f(x);
        System.out.println("x^2"+" = "+sqaure_of_num);

    }
    
}
