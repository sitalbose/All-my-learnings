import java.util.Scanner;

public class primeFactorization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        for(int div=2;div<=num;div++){
            while(num%div==0){
                System.out.print(div +" ");
                num=num/div;
            }
        }
        if(num!=1){
            System.out.println(num);
        }

    }
}
