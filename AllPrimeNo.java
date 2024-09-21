import java.util.*;
public class AllPrimeNo {
    static void print(int n){
        int total = 0;
        for(int i =1; i<=n; i++){
            int count = 0;
            for(int j =1; j<=i; j++){
                if(i % j == 0){
                    count++;
                }
            }
            if(count == 2){
                System.out.print(i + " ");
                total = total+1;
            }
           
        }
        System.out.println();
        System.out.println("Total prime no: "+total);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println();
        print(n);
    }
}
