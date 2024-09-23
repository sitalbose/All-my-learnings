import java.util.Scanner;

public class pythogorian_triplets {
    // to find of the square roots of two no.s is equal to the square roots of the third no.s
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        int max=a; // finding the maximum no. between the three no.s for 5^2 = 4^2 + 3^2
        if(b>=a){
            max=b;
        }
        if(c>=b){
            max=c;
        }
      // now we have check the condition and return true and false for itx`
      if(a==max){
        boolean flag=((b*b+c*c)==(a*a)); // returns the pythogorian triplets for it
        System.out.println(flag);

      }else if(b==max){
        boolean flag=((a*a+c*c)==(b*b));
        System.out.println(flag);
        
      }else{
        boolean flag=((b*b+a*a)==(c*c));
        System.out.println(flag);

      }

      }
    }
    

