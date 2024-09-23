package arrays;

import java.util.Scanner;

public class span_of_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n =sc.nextInt();
        int arr[]= new int[n]; // inilize the array

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt(); // input
        }
        int max = arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];

            }
        }
        int span =max-min;
        System.out.println("Difference B/w maximum and minimum in array"+" "+ span);
    


    }
    
}
