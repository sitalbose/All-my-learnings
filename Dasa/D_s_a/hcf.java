package D_s_a;

public class hcf {
    public static void main(String[] args) {
        int num1=20;
        int num2=10;
        int hcf=Hcf(num1, num2);
        System.out.println(hcf);

        }
          public static int Hcf(int num1,int num2){
            while(num2!=0){
                int temp=num2;
                num2=num1%num2;
                num1=temp;

            }
            return num2;
    }
    
}
