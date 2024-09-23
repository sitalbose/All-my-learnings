package searching;
import java.util.*;

public class linear_search {
    public static void main(String[] args) {
        int [] nums={4,5,71,56,12,46};
        int target=12;

        System.out.println(search2(nums, target));

        
    }
    public static int search2(int arr[],int target){
        if(arr.length==0){
            return -1;
        }
        // to run the loop 
        for(int index=0;index<arr.length;index++){
            int elemnts=arr[index];
            if(elemnts==target){
                return index;
            }

        }
        return -1;
            
    }
}



   

        
            


        
            



    


        
        

        
    



   