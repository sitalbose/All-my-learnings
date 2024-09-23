package arrays;

import java.util.Scanner;

public class multi_dimentional {
    public static void main(String[] args) {
        
    
    int arr[] []= new int[3][2];
    Scanner sc = new Scanner(System.in);
    for(int row=0;row<3;row++){
        for(int col=0;col<2;col++){
             arr[row][col]=sc.nextInt();
             System.out.println(arr[row][col]);

        }
    }
    
}
}
