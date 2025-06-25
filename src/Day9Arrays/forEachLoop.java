package Day9Arrays;

public class forEachLoop {
    public static void main(String[] args) {
        int[] arr = {5,8,2,6,9,30,-3};

        for(int ele : arr) {
            System.out.print(ele + " ");
        }

        for(int ele : arr){
            ele  *=2;
        } // this does not work as ele is just a copy of the elements of array



//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//
//        }
    }
}
