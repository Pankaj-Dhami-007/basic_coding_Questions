public class Fibbo_2 {

    static long sumOfFibbo(int n){
       int num1 = 0;
       int num2= 1;
       long sum = num1+num2;
       for(int i =3 ; i<= n; i++){
        int nextNum = num1+num2;
        sum = sum + nextNum;
        num1 = num2;
        num2=  nextNum;
       }
       return sum;
    }
    static int findNthFibbo(int n){
        if(n <= 0){
            System.out.println("Invalid term");
            return -1;
        } else if(n == 1){
            return 0;
        } else if(n == 2){
            return 1;

        }
        int num1 = 0;
        int num2 = 1;
        int nextNum = 0;
        for(int i =3; i<= n; i++){
            nextNum = num1+num2;
            num1 = num2;
            num2 = nextNum;
        }
        return num2;

    }
    static void fibboSeries(int n){
        int num1 = 0;
        int num2 = 1;
        System.out.print(num1+" "+num2+" ");
        for(int i =2; i< n; i++){
            int nextNum = num1+num2;
            System.out.print(nextNum+" ");
            num1 = num2;
            num2 = nextNum;
        }
    }
    public static void main(String[] args) {
        int n = 5;
        fibboSeries(n);
        System.out.println();
        System.out.println(findNthFibbo(n));
        System.out.println();
        System.out.println(sumOfFibbo(n));
    }
}
