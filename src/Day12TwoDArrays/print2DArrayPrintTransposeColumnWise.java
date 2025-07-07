package Day12TwoDArrays;

public class print2DArrayPrintTransposeColumnWise {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 5},
                        {3, 4, 7},
                        {5, 6, 9},
                        {7, 8, 25},
                        {9, 10, 30}};
        int m = arr.length, n = arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[j][i]);

            }
            System.out.println();

        }
    }
}
