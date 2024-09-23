package sorting;

public class insertionSort{
    public static void InsertionSort(int arr[]){
        int n=arr.length;
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;

            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
    public static void main(String[] args) {
        int arr[]=new int[]{7,8,9,6,3,1,2,3};
        System.out.println("Orginal array");
        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.println();

        InsertionSort(arr);
        System.out.println("Sorted array");
        for(int num:arr){
            System.out.print(num+" ");
        }
    }

}
    

