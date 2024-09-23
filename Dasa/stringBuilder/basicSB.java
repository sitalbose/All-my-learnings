package stringBuilder;

public class basicSB {
    //Strings are immuatable
    //Strings cannot be changed or modified once they are created.
    //To perform operation, to modify Strings we use String Builder
    //String builder performs faster operations
    //heap memory stores the objects , example "hi" , str="hi"
    //stack memory stores the variable ,like str
    //str points to "hi" in heap memory
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Tony");
        System.out.println(sb);

        //char at first index
        System.out.println(sb.charAt(0));

        //set char at second index
        sb.setCharAt(1, 'e');
        System.out.println(sb);

        //inser char at the second index
        sb.insert(2,"e");
        System.out.println(sb);

        // delete char at the second index
        sb.delete(2, 3);

        sb.append('f');
        System.out.println(sb);
    }
    
}
