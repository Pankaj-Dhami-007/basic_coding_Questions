public class GCD {
    static int findLCM(int a, int b){
        int lcm = (a*b)/findGCD(a, b);
        return lcm;
    }
    static int findGCD(int a, int b){
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
    }
    public static void main(String[] args) {
       System.out.println(findGCD(48, 18));
       System.out.println(findLCM(48, 18));
    }
}
