package Day6;

import java.util.Scanner;

public class patternNumbersLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows : ");
        int n = sc.nextInt();
//        System.out.println("Enter columns : ");
//        int col = sc.nextInt();

//        for (int i = 1; i <= rows; i++) {
//            for (int j = 1; j <= col; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        for (int i = 1; i<=n; i++){
//            for (int j = 1; j<=n; j++){
//                System.out.print(j + "  ");
//            }
//            System.out.println();
//        }

        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=n; j++){
                System.out.print((char)(j+96) + "  ");
            }
            System.out.println();
        }

    }
}
