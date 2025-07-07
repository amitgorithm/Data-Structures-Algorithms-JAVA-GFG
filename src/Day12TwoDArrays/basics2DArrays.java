package Day12TwoDArrays;

public class basics2DArrays {
    public static void main(String[] args) {
        int[][] arr = new int [4][5];
        // rows - 0 to 3 and columns - 0 to 4
        arr[3][4] = 56;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + " ");


            }
            System.out.println();

        }
    }
}
