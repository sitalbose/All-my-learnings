package recursion;

public class CalcPower {
    //print x^n with logn
   public static int CalPow(int x,int n){
    if(n==0){
        return 1;
    }else if(n%2==0){
   
        double halfPower=CalPow(x, n/2);
        return (int) (halfPower*halfPower);
    }else{
        double halfPower=CalPow(x,(n-1)/2);
        return (int) (x*halfPower*halfPower);
    }
   }
    public static void main(String[] args) {
        int x=2;
        int n=5;
        double result=CalPow(x, n);
        System.out.println(result);
    }
    
}
