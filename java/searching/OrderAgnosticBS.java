package searching;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int arr[]={-8,-7,4,6,8,10,12,14,16,22,45};
        int target=8;
        int ans=orderAgnosticBS(arr, target);
        System.out.println(ans);
        
    }
    public static int orderAgnosticBS(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        // find whether the array is sorted in ascending and decending order
        boolean isAsc=arr[start]<arr[end];

        while(start<=end){
        int mid=start+(end-start)/2;
        if(target==mid){
            return mid;
        }
        if(isAsc){
            if(target<arr[mid]){
                end=mid-1;
            }else if(arr[mid]>target){
                start=mid+1;
        }
    }else{
        if(arr[mid]<target){
            start=mid+1;
        }else if(arr[mid]>target){
            end=mid-1;
    }
    
}
    
    }
    return -1;
}
}
