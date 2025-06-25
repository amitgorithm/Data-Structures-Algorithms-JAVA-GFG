package Day6;

import java.util.Scanner;

public class binaryTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();


        // to print
        // 1
        // 2 3
        // 4 5 6
        // 7 8 9 10
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if((i+j)%2 == 0) System.out.print("1 ");
                if((i+j)%2 != 0) System.out.print("0 ");

            }
            System.out.println();
        }
    }
}
