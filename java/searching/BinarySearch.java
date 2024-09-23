package searching;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={4,6,8,10,12,14,16,22,45};
        int target=22;
        int ans=binarySearch(arr, target);
        System.out.println(ans);
        
    }
    public static int binarySearch(int arr[],int target){
        // returns the index of elements
        // not found then-1
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]<target){
                start=mid+1;
            }else if(arr[mid]>target){
                end=mid-1;
            }else{
                return mid;
            }

        }
        return -1;

    }
}
