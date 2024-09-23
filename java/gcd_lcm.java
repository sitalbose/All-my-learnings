import java.util.Scanner;

public class gcd_lcm {
    // to find the gcd and lcm of any two number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int on1=n1;
        int on2=n2;

        while(n1%n2!=0){
            int remainder=n1%n2;
            n1=n2;
            n2= remainder;
        }
        int gcd=n2;
        System.out.println("Gcd of n1 and n2 is "+gcd);
        int lcm=on1*on2/gcd;
        System.out.println("lcm of n1 and n2 "+lcm);
    }
    
}
