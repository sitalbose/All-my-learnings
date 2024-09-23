package function;

import java.util.Scanner;

public class greaterNo {
    // Print the greater no. between two the no.
    public static int printGreaterNo(int n1,int n2){
        if(n1>n2){
            return n1;
        }else{
            return n2;
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int ans=printGreaterNo(n1, n2);
        System.out.println("The greater no. is" +" "+ans);

        
    }
    
}
