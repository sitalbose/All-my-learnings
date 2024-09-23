package function;

import java.util.Scanner;

public class calculateProduct {

    public static int CalProduct(int a , int b){
        int product=a*b;
        return product;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b=sc.nextInt();
        int product=CalProduct(a, b);
        System.out.println("Product is:"+product);
    }
    
}
