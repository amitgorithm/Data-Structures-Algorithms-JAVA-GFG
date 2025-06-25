package Day8Arrays;

import java.util.Scanner;


public class patterPrintingArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[] arr = {5, -8, 2, 67, 43, -97, 80, 76, 67, 89, 45};
//        System.out.println(arr.length);
//        int n = arr.length; // index - 0 to n-1
//
//        for (int i = 0; i<n ; i++) {
//            System.out.println(arr[i]);
//        }

//        int[] karan = new int[7];

        // input
//        for (int i = 0; i < 7; i++) {
//            karan[i] = sc.nextInt();
//        }
//        for (int i = 0; i < 7; i++) {
//            System.out.println( karan[i]+ " ");
//        }

        // print negative values
        System.out.print("Enter array size ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter Array elements: ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

// to  print negative values

        for (int i = 0; i < n; i++) {
            if(arr[i]<0) System.out.print(arr[i] + " ");

        }

    }
}
