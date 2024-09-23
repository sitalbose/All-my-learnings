package function;

import java.util.Scanner;

public class display_digits {

    public static int f(int num){
        while(num>0){
            int digit=num%10;
            
            num=num/10;
            
            
        }
        return num;
    
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();

        int display=f(num);
        

    }
    
}
