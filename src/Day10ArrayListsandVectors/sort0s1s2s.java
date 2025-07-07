package Day10ArrayListsandVectors;

public class sort0s1s2s {
    public static void main(String[] args) {
        int[] arr = {0,0,1,2,2,0,0,1,1,2,0,1};
        int n = arr.length;

        int numOfZeroes = 0;
        int numOfOnes = 0;
        int numOfTwos = 0;

        for (int i = 0; i < n-1; i++) {
            if(arr[i] == 0) numOfZeroes += 1;
            else if (arr[i] == 1) numOfOnes += 1;
            else if (arr[i] == 2) numOfTwos += 1;


        }
        for (int i = 0; i < numOfZeroes ; i++) {
            arr[i] = 0;
        }
        for(int i = numOfZeroes; i < numOfOnes; i++ ){
            arr[i] = 1;
        }
        for (int i = numOfOnes; i < n-1; i++) {
            arr[i] = 2;

        }
        for (int i = 0; i < n-1; i++) {
            System.out.print(arr[i] + " ");

        }
    }

}
