package Day23Recursions3;

public class recursionOnArrays {
    public static void main(String[] args) {
        int[] arr = {5,6,7,12,30,45};
        recPrint(arr,0);
        int target = 30;
        System.out.println(exists(arr,target,0));
    }
    public static boolean exists (int[] arr, int target, int idx){
        if(arr[idx] == target) return true;
        if(arr[idx]==target) return true;
        return exists(arr,target,idx+1);

    }

    public static void recPrint(int[] arr, int idx){
        int n = arr.length; // base case
        if(idx==n) return;
        System.out.print(arr[idx]+ " ");
        recPrint(arr,idx+1);
    }




}
