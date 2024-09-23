package arrays;

import java.util.Arrays;

public class arrays_2 {
    public static void main(String[] args) {
        int nums[]={5,6,7,8};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
        
    }

    private static void change(int[] nums) {
        nums[0]=99;
    }
    
}