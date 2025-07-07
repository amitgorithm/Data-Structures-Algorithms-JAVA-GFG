package Day12TwoDArrays;

public class maximumSumRow2DArray {
    public static void main(String[] args) {
        int[][] arr  = {{1,2,5},
                        {3,4,7},
                        {5,6,9},
                        {7,8,25},
                        {9,10,30}};
        int m = arr.length, n =arr[0].length;
        for(int[] arr1D : arr){
            for(int ele : arr1D){
                System.out.print(ele + " ");
            }
            System.out.println();
        }


        int maxSum = Integer.MIN_VALUE;
        int maxRow = 0;
        for (int i = 0; i < m; i++) {
            int sumRow = 0;
            for (int j = 0; j < n; j++) {
                sumRow += arr[i][j];
            }
            if(sumRow >  maxSum)
                maxSum = sumRow;
                maxRow =  i;

        }
        System.out.println(maxSum);
        System.out.println(maxRow);
    }
}
