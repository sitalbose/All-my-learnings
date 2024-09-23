import java.util.Arrays;
public class two2dSearch {
    



    public static void main(String[] args) {
        int arr[][]=  {
                                  {5,8,12,23},
                                  {2,8,6,7},
                                  {7,12,4,34},
                                  {45,56,7}};
        int target=8;
        int[] ans=search2(arr,target);
        System.out.println(Arrays.toString(ans));                          

    }
     static int[] search2(int[][]arr,int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col]==target){
                     return new int[] {row,col};
                    
                }
                
            }


            
        }
		return new int[]{-1,-1};
        
       
        
    }
    
}



    
}
