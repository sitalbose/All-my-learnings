package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class arraylists {
    public static void main(String[] args) {
        ArrayList<Integer> list1= new ArrayList<Integer>();

     // arraylist is non continous
     // arraylist is not in fixed size like array.
        list1.add(6);
        list1.add(5);
        list1.add(4);

        System.out.println(list1);

        // get the elements
        int elements=list1.get(0);
        System.out.println(elements);

        //add ele in between.
        list1.add(1,1);
        System.out.println(list1);

        // add element in between
        list1.add(0,5);
        System.out.println(list1);

        // set elements
        list1.set(0, 7);
        System.out.println(list1);
        
        // delete elements in between
        list1.remove(0);
        System.out.println(list1);

        // iterate through elements
        for(int i=0; i<list1.size();i++){
            System.out.println(list1.get(i));
         }
         //sorting 
         Collections.sort(list1);
         System.out.println(list1);


        }
    
}
