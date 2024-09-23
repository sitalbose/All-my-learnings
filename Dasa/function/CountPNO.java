package function;

import java.util.Scanner;

public class CountPNO {
    // take n inputs from users and count positive , count negetive and zeros
    public static void countPN0(int arr[],int n){
        int CountP=0;
        int CountN=0;
        int CountO=0;
    
        for(int i=0;i<=n;i++){
            if(arr[i]>0){
                CountP++;
            }else if(arr[i]<0){
                CountN++;
            }else{
                CountO++;
            }
            }
            System.out.println(" total Positive no. " +CountP+ " Total Negative no. "+CountN+"total Zero "+CountO);
    

            }

    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // take input
        int n = sc.nextInt(); // the total no. of user wants to enter

        int arr[]= new int[n]; // initialize the array
        System.out.println("Enter any " + n + " no.s");
        for(int i=0;i<=n;i++){
            arr[i]=sc.nextInt(); // storing n no. in the array
        }
        countPN0(arr,n);

        
    }
}
    


