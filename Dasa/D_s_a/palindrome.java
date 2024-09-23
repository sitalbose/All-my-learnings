package D_s_a;

public class palindrome{
    public static void main(String[] args) {
        String input="radar";

        if(isPalindrome(input)){
            System.out.println(input+" is a Palindrome");
        }else{
            System.out.println(input+" not a palindrome");
        }
    }
    public static boolean isPalindrome(String str){
        String lowercase=str.toLowerCase();

        String reversedString=new StringBuilder(lowercase).reverse().toString();

        return lowercase.equals(reversedString);

    }

}