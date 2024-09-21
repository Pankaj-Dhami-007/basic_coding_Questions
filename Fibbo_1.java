import java.util.*;
public class Fibbo_1 {
    static int fibboTerm(int n){
          if(n <=0){
            System.out.println("invalid input ");
          }
          else if(n == 1){
            return 0;
          }
          else if(n == 2){
            return 1;
          }
          int a = 0;
          int b = 1;
          int c = a+b;
          for(int i =2; i< n; i++){
            int temp = b;
            b = c;
            a = temp;
          }
          return b;
    }
    static void printFibbo(int n){// 0, 1, 1, 2, 3, 5, 8, 13, 21
        int a = 0;
        int b =1;
        for(int i =0; i<n; i++){
            System.out.print(a+" ");
            int c = a+b;
            a = b;
            b = c;
        }
    }
    public static void main(String[] args) {
        printFibbo(10);
        System.out.println();
        System.out.println(fibboTerm(5));
    }
}
