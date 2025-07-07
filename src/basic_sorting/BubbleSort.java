package basic_sorting;

public class BubbleSort {
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {90,-2,6,7,8,7,2};
        int n = arr.length;
        print(arr);

        for (int i = 0; i < n-1; i++) { // n-1 passes
            int min = Integer.MAX_VALUE;
            int mindx = -1;
            for (int j = 0; j < n; j++) {
                if(arr[j]<min){
                    min =arr[j];
                    mindx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[mindx];
            arr[mindx] = temp;
        }
        print(arr);

        // Bubble Sort
//        for (int i = 0; i < n-1; i++) {
//            for (int j = 0; j < n-1-i ; j++) {
//                if(arr[j] > arr[j+1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//
//                }
//            }
//
//        }
//        print(arr);
//

        // bubble sort optimised:
//        for (int i = 0; i < n-1; i++) {// n-1 passes
//            boolean isSorted = true;
//            for (int j = 0; j < n-1; j++) {
//                if(arr[j]>arr[j+1]){
//                    isSorted = false;
//                    break;
//                }
//
//            }
//
//            if(isSorted == true) break;
//            for (int j = 0; j < n-1-i ; j++) {
//                if(arr[j] > arr[j+1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//
//                }
//            }
//
//        }
//        print(arr);
    }
}
