package Day9Arrays;

public class reverseArray2variablePointerTechnique {
    public static void main(String[] args) {
        int[] arr = {6,8,1,2,5,9,-10,6,-15};
        int n = arr.length;

        //using for loop and running the loop till n/2
//        for (int i = 0; i < n/2; i++) {
//            // swap arr[i] and arr[n-1-i]
//
//            int temp = arr[i];
//            arr[i] = arr[n-1-i];
//            arr[n-1-i] = temp;
//
//        }

//        // using while loop and going from both ends, until i meets  j in the center
//        int i = 0, j = n-1;
//        while(i<j){
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//            i++;
//            j--;
//        }
        int i = 2, j = 5;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }




        for(int ele : arr) System.out.print(ele + " ");

    }
}
