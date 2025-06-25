package Day9Arrays;

public class secondMaximum {
    public static void main(String[] args) {
        int[] arr = {4,10,10,6,3,8};
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        // calculate max
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max) max = arr[i];
        }

        // calculate second max
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>smax && arr[i]!=max) smax = arr[i];

        }
        System.out.println(max);
        System.out.println(smax);

        // this is other method using just one loop
        /*  int[] arr = {-6, 8, 14, -2, 23, 47, 4, 3, 10};
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        System.out.println("Second maximum number is: " + secondMax);
    }
*/

    }
}
