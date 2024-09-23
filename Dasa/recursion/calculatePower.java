package recursion;

public class calculatePower {
    public static int CalPow(int x,int n){
        if(n==0){
            return 1;
        }else{
            return x*CalPow(x, n-1);
        }
    }
  public static void main(String[] args) {
    int x=2;
    int n=5;
    int result=CalPow(x, n);
    System.out.println(result);
  }
    
}
