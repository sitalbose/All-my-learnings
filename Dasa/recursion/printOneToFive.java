package recursion;

public class printOneToFive {
    public static void PrintNumb(int n){
        if(n==6){
            return;
        }
        System.out.println(n);
        PrintNumb(n+1);
    }
    public static void main(String[] args) {
        int n=1;
        PrintNumb(n);
    }
    
}
