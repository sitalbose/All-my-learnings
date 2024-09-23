import java.util.HashMap;

public class hash {
    public static void main(String[] args) {
        HashMap<String,Integer> happy= new HashMap<String,Integer>();
        happy.put("a",10);
        happy.put("b",50);
        happy.put("c",80);
        System.out.println(happy);
        System.out.println(happy.get("c"));

    }
    
}




