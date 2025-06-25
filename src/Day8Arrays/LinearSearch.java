package Day8Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {12,3,27,53,45,29,6,8,88};
        int target = 18; // (generally taken as an input)
        int found = -1; // to put the index of the target in the variable 'found'
        //  boolean found = false; // false means target element is not in array
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                // System.out.println("Target exists in array at index " + i); // to print the index of the target
                // found = true; // true means target is present in array
                found = i;
                break;
            }
        }
        //if(found==true) System.out.println("Target exists in array"); // alternatively if(flag)
        if(found!=-1) System.out.println("Target exists  in array at index "+found);
        else System.out.println("Target missing in array");
    }
}
