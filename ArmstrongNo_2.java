import java.util.*;
public class ArmstrongNo_2 {
    static void isArmsNo(int n){// 153
        int p = n;
        int count =0;
        // cal no of digits
        while(p>0){
         p /=10;
         count++;
        } // count = 3
        int q = n;
        double sum = 0;
        int lastDig = 0;
        while(q>0){
            lastDig = lastDig % 10;// get last digit 
            sum += Math.pow(lastDig, count);
        }
        if(n == sum){
            System.out.println("Armstrong No");
        }
        else{
            System.out.println("Not Armstrong No");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        isArmsNo(num);
    }
}
