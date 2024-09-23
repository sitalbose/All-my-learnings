package searching;

public class findMax {
    public static void main(String[] args) {
        int arr[][]=  {
                                  {5,8,12,23},
                                  {2,8,6,7},
                                  {7,12,4,34},
                                  {45,56,7}};
        
        
        System.out.println(max(arr));                          

    }
     static int max(int[][]arr){
    	 int maximum=arr[0][0];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                
                if(arr[row][col]>maximum) {
                	maximum=arr[row][col];
                	
                	
                
                    
                }
                
            }


            
        }
		return maximum;
		
        
       
        
    }
    
}
    
    

