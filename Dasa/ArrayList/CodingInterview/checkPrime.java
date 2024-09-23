package ArrayList.CodingInterview;

public class checkPrime {
    public static boolean isPrime(int num){
        if (num<=1){
            return false;
        }
    for(int i=2;i<=num/2;i++){
        if(num%i==0){
            return false;
        }
        
} return true;
    }

public static void main(String[] args){
    int num=29;
    boolean result=isPrime(num);
    System.out.println(result);


}
    }