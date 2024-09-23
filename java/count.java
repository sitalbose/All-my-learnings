import java.util.Scanner;


public class count {
    // Question is count the number of digits in a number like 4561 has 4 digits
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        
        int count=0;
        while(num>0){
            num=num/10;
            count++;

        }
        System.out.println(count);
    
    }
    

    
}
