public class PalindromeNo_2 {
    static int isPalindrome(int num){
        int n = num;// 121
        int rev = 0;
        while (n>0) {
            int digit = n%10;
            rev = rev * 10 + digit;
            n/=10;
        }
return rev;
    }
    public static void main(String[] args) {
       int n = 121;
       if (isPalindrome(n) == n) {
        System.out.println(n+ " is a palindrome");
       }
       else{
        System.out.println(n+ " is not a Palindrome");
       }
    }
}
