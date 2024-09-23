package pattern;

import java.util.Scanner;

public class pattern_4 {
    // right aligned
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        
        int Space=1;
        int star=n-1;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=Space;j++){
                System.out.print("\t");
            }
            for(int j=1;j<=star;j++){
                System.out.print("*\t");
            }
            star--;
            Space++;
            System.out.println();
    }
    
    }
}
