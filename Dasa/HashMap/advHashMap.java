package HashMap;

import java.util.HashMap;

public class advHashMap {
    public static void main(String[] args) {
        HashMap<String,String> hap = new HashMap<String,String>();
        hap.put("Ayush78","PassWord");
        hap.put("Rahul26","xyz");
        hap.put("Aman79","pqrs");

        System.out.println(hap.containsKey("xyz"));
        System.out.println(hap.containsValue("xyz"));
        System.out.println(hap.size());

    }
    
}
