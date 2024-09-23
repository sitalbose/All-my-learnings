package arrays;

import java.util.Scanner;

public class array_intro {
    public static void main(String[] args) {
        int arr[] = new int[5]; // for storing collection of data
        Scanner in = new Scanner(System.in);
    

        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
            System.out.println(arr[i]+ "");
        }



    }
    
}
