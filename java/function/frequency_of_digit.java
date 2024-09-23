package function;

import java.util.Scanner;

public class frequency_of_digit {
    static int freq(int num, int d){
        int count=0;
        while(num>0){
            int digit=num%10;
            num=num/10;
            if(digit==d){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int d=sc.nextInt();

        int freq_of_d=freq(num, d);
        System.out.println("Frequency of"+"num"+ "="+freq_of_d);

        


    }
}