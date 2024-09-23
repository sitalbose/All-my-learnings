package arrays;

import java.util.Scanner;

public class sort_array {
    // sort the array in ascending order
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            
        }
        System.out.println("Orginal array"); // displaying the original array
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");

        }
        // sort in ascending array
        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }
       }
       System.out.println();
       // displaying the sort array
       System.out.println("New sorted array");
       for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]+" ");
       }
    }
    
}
