package arrays;

import java.util.Scanner;

public class declareArrayI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();

        int arr[]=new int[size]; //iniliazing the array

        for(int i=0;i<size;i++){  // input
            arr[i]=sc.nextInt();
        }
        
        //output
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
    }
}

