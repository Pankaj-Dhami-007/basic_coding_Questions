import java.util.*;
public class ArmstrongNo {
    static void print(int n){
        // cal no of digits
        int x = n;
        int count =0;
        while(x >0){
            x = x/10;
            count++;
        }
        System.out.println(count);
        int y = n;
        int sum =0;
        while(y>0){
            int dig = y % 10;// to find last digit
            int prod = 1;
             for(int i =1; i<=count; i++){
                prod = prod * dig;
             }
             sum = sum + prod;
                y = y/10;
        }
        if(sum == n){
            System.out.println("It is armstrong No");
        }
        else{
            System.out.println("Not");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println();
        print(n);
    }
}
