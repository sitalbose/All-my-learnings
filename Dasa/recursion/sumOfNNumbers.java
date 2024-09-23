package recursion;

public class sumOfNNumbers {
    //using recursion print sum of n numbers 1+2+3+4+5....n
    public static void Printsum(int i,int n,int sum){
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }

        sum+=i;
        Printsum(i+1, n, sum);
    }
    public static void main(String[] args) {
        int n=5;
        Printsum(1, 5, 0);
    }
}
