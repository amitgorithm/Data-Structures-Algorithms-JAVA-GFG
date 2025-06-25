package Day8Arrays;
import java.util.Arrays;

public class shallowCopyDeepCopy {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        int[] x = arr; // x is shallow copy of arr
        x[0] = 100; // we are calling and accessing the value of arr through x.

        int[] y = Arrays.copyOf(arr, arr.length);
        // this is a deep copy
        y[0]  = 130;
        arr[0] = 100; // this will not change the main array
        System.out.println(arr[0]);


        // to create a deep copy using a for loop by
        // creating an array brr using new int.
        int[] brr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            brr[i] = arr[i];

        }

    }
}
