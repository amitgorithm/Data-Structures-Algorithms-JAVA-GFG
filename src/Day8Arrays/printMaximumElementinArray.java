package Day8Arrays;

import java.util.Scanner;

public class printMaximumElementinArray {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter array size ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter Array elements: ");
        int max = arr[0];

        // taking input of array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // to print the sum of elements
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) max = arr[i];

        }
        System.out.println(max);

        // print min by your own


    }
}
