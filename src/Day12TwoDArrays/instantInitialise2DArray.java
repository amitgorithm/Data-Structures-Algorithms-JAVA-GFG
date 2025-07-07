package Day12TwoDArrays;

public class instantInitialise2DArray {
    public static void main(String[] args) {
        int[][] arr  = {{1,2},{3,4},{5,6},{7,8},{9,10,11}};
        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + " ");


                for(int ele : arr[i]) {
                    System.out.print(ele + " ");
            }
            System.out.println();
        }





    }


}
