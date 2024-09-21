import java.util.Scanner;

public class PalindromeNo {
    static void isPalindrome(int n){
        int z = n;
        int rev = 0;
        while(z>0){
            rev = (rev*10) + z%10;
            z = z/10;
        }
        if(rev == n){
            System.out.println("It is Palindrome No: ");
        }
        else{
            System.out.println("It is Not Palindrome No: "); 
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println();
        isPalindrome(n);
    }
}
