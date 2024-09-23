package arrays;

import java.util.Scanner;

import javax.security.auth.x500.X500Principal;

public class arraySearchElem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();

        int arr[]= new int[size];

        // input
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter a number to search:");
        int x=sc.nextInt();

        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                System.out.println("X found at the index "+ i);
            }
        }
    }
}
