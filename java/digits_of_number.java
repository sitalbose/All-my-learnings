import java.util.Scanner;

public class digits_of_number {
    // to display all digit of a number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any no.");
        int num =sc.nextInt();

        while(num>0){
            int digits=num%10;
            System.out.println(digits);
            num=num/10;
        }
    }

}
       