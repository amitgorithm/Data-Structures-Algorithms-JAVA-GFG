package Day6;

import java.util.Scanner;

public class starTriangle1Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
//        System.out.println("Enter columns : ");
//        int col = sc.nextInt();

//        for (int i = 1; i <= rows; i++) {
//            for (int j = 1; j <= col; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        // straight pattern star triangle
        // *
        // * *
        // * * *
        // * * * *
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }



        // to print inverted triangle :
        // * * * *
        // * * *
        // * *
        // *

//        for(int i  = 1; i <= n; i++) {
//            for (int j = i; j <= n; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//
//            }
       // to print triangle of number : output j + " "
//        for(int i  = 1; i <= n; i++) {
//            for (int j = i; j <= n; j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//
//        }

//
//        for(int i  = 1; i <= n; i++) {
//            for (int j = i; j <= n; j++){
//                System.out.print((char)(j+96) + " ");
//            }
//            System.out.println();
//        }

        // to print pattern:
        // 1
        // a
        for (int i = 1; i <= n; i++){
            for (int j = i; j <= n; j++){
                System.out.print(j);
                System.out.print((char)(j+64));
            }
            System.out.println();
        }

//        int a = n;
//        for (int i = 1; i <= n; i++){
//            for (int j = i; j <= a; j++){
//                System.out.print("*" + " ");
//            }
//            a--;
//            System.out.println();
//        }

    }
}
