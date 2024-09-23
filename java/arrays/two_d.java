package arrays;

import java.util.Scanner;

public class two_d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows=sc.nextInt();
        int col=sc.nextInt();

        System.out.println("Enter the elemnts");
        int two_d[][]= new int[rows][col];
        // for taking input
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;i++){
                two_d[i][j]=sc.nextInt();
            }
        }
        System.out.println("Data you entered");
        // printing the purpose
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;i++){
                System.out.println(two_d[i][j]+"");
}
    
        }
        System.out.println();
    }

}
