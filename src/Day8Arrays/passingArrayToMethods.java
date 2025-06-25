package Day8Arrays;

public class passingArrayToMethods {
    public static void main(String[] args) {
        int[] arr = {10,3,29,38};
        System.out.println(arr[2]);
//
//        change(x); // function is called for the parameter x
        change(arr);
        System.out.println(arr[2]);
    }

    public static void change(int[] x) { // this is a function change with
        // the parameter int[] x
        x[2] = 99;

    }
}
