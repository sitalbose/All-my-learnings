package ArrayList.CodingInterview;

public class largestElement {
    public static int findLargest(int arr[]){
        int max=arr[0];
        for(int num:arr){
            if (num>max){
                max=num;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(findLargest(arr));
    }

    
}
