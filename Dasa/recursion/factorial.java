package recursion;

public class factorial {
    public static int PrintFactorial(int n){
        if(n==0||n==1){
            return 1;
        }else{
            return n*PrintFactorial(n-1);
        }
    }
    public static void main(String[] args) {
        int n=5;
        int result=PrintFactorial(n);
        System.out.println(result);
    }
}