import java.util.Scanner;

public class reverse_array {
    public static void main(String[] args) {
        // to reverse an array
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
        int len=arr.length;
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=len;i>=0;i--){
            System.out.println("Reverse array"+ " "+arr);
        }

        }
    }
    

