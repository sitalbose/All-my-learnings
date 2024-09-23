package ArrayList.CodingInterview;

public class reverseString {
    public static String reverse(String str){
        if (str==null){
            return null;
        }
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    
    }
    public static void main(String[] args) {
        String str="Sital";
        String result=reverse(str);
        System.out.println(result);


    }
        
    
}
    

