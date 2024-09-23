package sorting;

public class bubbleSort {
    public static void BubbleSort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    // swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;   // swaped
                }
            }
        }
    }
    // time complexity of bubble sort=O(n^2).
    public static void main(String[] args) {
        int arr[]=new int[]{7,8,9,6,5,2,1};

        System.out.println("Original array");
        for(int num:arr){
            System.out.print(num+" ");  // priting tghe original aray
        }
        System.out.println();

        BubbleSort(arr); // calling the func

        System.out.println("Sorted array");
        for(int num:arr){
            System.out.print(num+" ");
        }


    }
    
}
