import java.util.Scanner;

public class counts_digits {
    // program to print all the digits in a number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any no.");
        int num=sc.nextInt();

        int temp=num;

        int count=0;
        while(num>0){
            num=num/10;
            count++;

        }// loop breaks the number into digits
        while(temp>0){
            //finding the remainder
            num=temp%10;
            System.out.println(num);
            temp=temp/10;
            count--;

        }

    }
    
}
