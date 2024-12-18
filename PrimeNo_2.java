public class PrimeNo_2 {

    static boolean isPrime(int num){
        if(num <= 1) return false;
        for(int i =2; i <= Math.sqrt(num); i++){
            if(num % i == 0) return false;

        }
        return true;
    }
    static int findNthPrime(int n){
        int count =0;
        int num =2;
        while (true) {
            if(isPrime(num)){
                count++;
                if(count == n) return num;
            }
            num++;
        }
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(findNthPrime(n));
    }
}
