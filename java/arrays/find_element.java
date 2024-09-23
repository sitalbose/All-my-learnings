package arrays;

import java.util.Scanner;

public class find_element {
    // ques: find the element in array and return its index
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n]; // inilize the array

        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt(); // taking inputs of array all element
        }
        int data = sc.nextInt(); // element for which we have the return the its position

        int idx=-1; // inilize first index
        for(int i=0;i<arr.length;i++){       // iteraing through all element
            
            // returning the index the data
            if(data==arr[i]){ 
                idx=i;
                break;
            }
        }
        System.out.println(idx);
        


    }
    
}
