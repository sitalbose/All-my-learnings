package recursion;

public class calculateSum {
    public static int CalculateSum(int n){
        if(n<=0){
            return 0;
        }else{
            return n+CalculateSum(n-1);
        }
    }
    public static void main(String[] args) {
        int n=5;
        int result=CalculateSum(n);
        System.out.println(result);
    }
}