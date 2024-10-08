package sorting;

public class selectionSort {
    public static void SelectionSort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int minIndex=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            //swap
            int temp =arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = new int[]{7,8,6,9,4,3,5,};
        System.out.println("Original array");
        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.println();
        SelectionSort(arr);

        System.out.println("Sorted array");
        for(int num:arr){
            System.out.print(num+" ");
        }

    }
    
}
