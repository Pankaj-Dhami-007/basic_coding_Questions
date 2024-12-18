class AllPrograms{
    public long sum(int arr[]){
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public int findFactorial(int n){

        int fact = 1;
        while(n>0){
            fact *= n;
            n--;
        }
        return fact;
    }
    
    public int largestNo(int arr[]){

        int max = Integer.MIN_VALUE;
        int index =-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
                index = i;
            }
        }
        System.out.println("Index of Largest No is: "+index);
    return max;
    }

    public int secondLargest(int arr[]){

        int max = largestNo(arr);
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > secondMax && arr[i] < max){

                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    public void findFibboSeries(int n){

        int num1 = 0;
        int num2 = 1;
        System.out.print(num1+" "+num2+" ");
        for (int i = 2; i < n; i++) {
            int nextNum = num1+num2;
            System.out.print(nextNum+" ");
            num1 = num2;
            num2 = nextNum; 
        }
    }

    public int findNthFibboNo(int n){

        int num1 =0;
        int num2 = 1;
        int nextNum =0;
        int count =1;
        for (int i = 2; i < n; i++) {
            nextNum = num1+num2;
            num1 = num2;
            num2 = nextNum;
        }
        
      return num2;
    }

    public int reverseANo(int n){

        int rev = 0;
        while (n> 0) {
            int lastDigit = n % 10;
            rev = rev * 10+ lastDigit;
            n /=10;
        }
        return rev;
    }

    public String revString(String str){

        String rev = "";
        System.out.println("Length is: "+rev.length());
        for (int i = str.length()-1; i >= 0; i--){
            rev = rev+ str.charAt(i);
        }
     return rev;
    }

    public boolean isPalindrome(int n){

        int m = reverseANo(n);
       if(m == n){
        return true;
       }
       return  false;
    }

    public boolean isPalindromeString(String input){

         String rev = "";
         for (int i = input.length()-1; i >=0; i--) {
             rev = rev + input.charAt(i);
         }

         if (!input.equals(rev)) {
            return false;
         }
         return true;
    }

    
    public void bubbleSort(int arr[]){

        int n = arr.length;
        System.out.print("Before Sorting: ");
        for(int i =0; i< n; i++){
            System.out.print(arr[i]+" ");
          }
          for (int i = 0; i < n-1; i++) {
              for (int j = 0; j < n-i-1; j++) {
                  if(arr[j] > arr[j+1]){

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                  }
              }
          }
          System.out.println();
          System.out.print("After Sorting: ");
          for(int i =0; i< n; i++){
            System.out.print(arr[i]+" ");
          }
    }
}

public class SumAndFact {

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7};
        int rollNo[] = {50, 20, 11, 1, 99, 33, 9, 100};
        int n = 5;
        int a = 123;
        int p = 121;
        String s = "Pankaj";
        String is = "madam";
        AllPrograms run = new AllPrograms();
        System.out.println("Sum is: "+run.sum(nums));

        System.out.println("Fcatorial is: "+run.findFactorial(n));

        System.out.println("Largest No is: "+run.largestNo(nums));

        System.out.println("Second Largest No is: "+run.secondLargest(nums));

        run.findFibboSeries(n);
        System.out.println();

        System.out.println(n+"th Fibbo No is: "+run.findNthFibboNo(n));

        System.out.println("Reverse of a num "+a+" is: "+run.reverseANo(a));

        System.out.println("Reverse of a String "+s+" is: "+run.revString(s));

        System.out.println("Is Palindrome No: "+run.isPalindrome(p));

        System.out.println("Is Palindrome String: "+run.isPalindromeString(is));

        run.bubbleSort(rollNo);
    }
}