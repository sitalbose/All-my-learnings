import java.util.Scanner;

public class display_digits_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int num=sc.nextInt();

        String number= Integer.toString(num);
        for(int i=0;i<num;i++){
            System.out.println(number.charAt(i));

        }

    }
    
}
