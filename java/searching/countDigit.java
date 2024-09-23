package searching;

public class countDigit {
    public static void main(String[] args) {
        int [] nums={12,45,456,7894};
        System.out.println(even(nums));
        
    }
    static int findNumbers(int nums){
        int count =0;
        for(int num:nums){
            if(even(nums)){
                count++;
            }
            }
            return count;

        }
        static boolean even(int num){
            int numberofDigit=digit(num);
             if(numberofDigit%2==0){
                return true;
             }
             return false;
            
        }
        static  int digit(int num){
            int count=0;
            while(num>0){
                count++;
                num=num/10;
            }
            return count;
        }

    }

    