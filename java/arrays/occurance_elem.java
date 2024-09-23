package arrays;

import java.util.Scanner;

public class occurance_elem {
    // in find occurance of element in an array
    public static void main(String[] args) {
        int arr[]= new int[]{5,5,8,4,4,4,7};
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        // displaying the original array
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                count++;
            }
        }
        System.err.println("frequency of element "+ count);
 }
    
}
