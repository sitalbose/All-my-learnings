package arrays;

import java.util.Scanner;

public class declareArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();  // taking the size input of array from user

        int [] arr= new int[size]; // declaring the array

        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }

    }
    
}
