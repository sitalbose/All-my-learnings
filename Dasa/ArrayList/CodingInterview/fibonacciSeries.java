package ArrayList.CodingInterview;

public class fibonacciSeries {
    public static void PrintFibonacciSeries(int n){
        int a=0,b=1;
        System.out.print(a+ " "+ b);

        for(int i=2;i<=n;i++){
            int c=a+b;
            System.out.print(" "+ c);
            a=b;
            b=c;
        }
    }
    public static void main(String[] args) {
        int n=10;
        PrintFibonacciSeries(n);
        }
        
    
}
