package twodArrays;

import java.util.Scanner;

public class transposeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();

        int matrix[][]= new int [m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[m][n]=sc.nextInt();
            }
        }
        System.out.println("The Transpose of Matrix is:");

        for(int j=0;j<n;j++){
            for(int i=0;i<m;i++){
                System.out.println("The given matrix is:"+matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
