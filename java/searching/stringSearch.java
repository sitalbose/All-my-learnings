package searching;

import java.util.Arrays;

public class stringSearch {
    public static void main(String[] args) {
        String name="Rahul";
        char target='a';
        System.out.println(search2(name, target));
        System.out.println(Arrays.toString(name.toCharArray()));


    }
    public static boolean search2(String str ,char target){
        if(str.length()==0){
            return false;

        }
        for(int i=0;i<str.length();i++){
            if(target==str.charAt(i)){
                return true;
            }
        }
        return false;
        

    }
    
}
