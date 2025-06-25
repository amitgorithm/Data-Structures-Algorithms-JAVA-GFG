package Day8Arrays;

import java.util.Scanner;

public class evenOddArrayIndices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // product of array
        int[] arr = {3,7,3,8,1,4,-2,6,-3};
        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            product *= arr[i];

        }
        System.out.println(product);

        // min element of array
        int min= arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min) min = arr[i];

        }
        System.out.println(min);

        // to multiply by 2 to even index, add 10 to odd index
        print(arr);
        for (int i = 0; i < arr.length; i++) {
            if(i%2==0) arr[i] *= 2;
            else arr[i] +=10;
        }
        print(arr);

    }

    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

        }
        System.out.println();
    }
}
