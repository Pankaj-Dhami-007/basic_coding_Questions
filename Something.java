public class Something {
    public static void bubbleSort(int arr[]){

        int n = arr.length;
        System.out.print("Before Sorting: ");
        for(int i =0; i< n; i++){
            System.out.print(arr[i]+" ");
          }
          for (int i = 0; i < n-1; i++) {
              for (int j = 0; j < n-1-i; j++) {
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
    public static void main(String[] args) {
        int rollNo[] = {50, 20, 11, 1, 99, 33, 9, 100};
        bubbleSort(rollNo);
    }
}
