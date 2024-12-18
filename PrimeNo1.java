public class PrimeNo1 {
    static boolean isPrime(int n){
        if(n <=1) return false;
        for(int i =2; i<= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }

    
    public static void main(String[] args) {
    //     int n = 2;
    //     if(isPrime(n)){
    //      System.out.println(n+" is a Prime No");
    //     }else{
    //         System.out.println(n+" not a prime no");
    // 
    
    int n = 50;
    for(int i =1; i<= n; i++){
        if(isPrime(i)){
            System.out.print(i+" ");
        }
    }

     }
}
