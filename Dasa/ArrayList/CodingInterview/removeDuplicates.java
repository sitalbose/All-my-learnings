package ArrayList.CodingInterview;

import java.util.HashSet;
import java.util.*;

public class removeDuplicates {
    public static void RemoveDuplicates(int arr[]){
        LinkedHashSet<Integer> set= new LinkedHashSet<Integer>();
        for(int num:arr){
            set.add(arr[num]);
            System.out.print(set);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,2,3,4,4,5,6};
        RemoveDuplicates(arr);
    }
}