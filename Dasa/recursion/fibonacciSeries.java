package recursion;

public class fibonacciSeries {
    public static int PrintFibonacci(int n){
        if(n<=1){
            return n;
        }else{
            return PrintFibonacci(n-1)+PrintFibonacci(n-2);
        }
    }
    public static void main(String[] args) {
        int n=6;

        for(int i=0;i<n;i++){
            System.out.print(PrintFibonacci(i)+" ");
        }
    }
}