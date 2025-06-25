package Day6;

import java.util.Scanner;

public class starTriangleVerticallyFlipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a  number :  ");
        int n = sc.nextInt();


        // method 1 : consider it a square and print only when
        // (i+j)>n else print space.
//        for (int i = 1; i <= n; i++) {
//
//            for (int j = 1; j <= n; j++) {
//                if((i+j) > n) System.out.print("*");
//                else System.out.print(" ");
//            }
//            System.out.println();
//
//            }
        // method 2 by using two loops inside a loop
        // to print spaces by one loop
        // and to print '*' by other
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) { // loop for spaces
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) { // loop for stars
               System.out.print("* ");

            }
            System.out.println();

        }

        // number triangle vertically flipped:
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) { // loop for spaces
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) { // loop for stars
                System.out.print(j);

            }
            System.out.println();

        }
        // HW alphabet triangle vertically flipped
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n-i; j++) { // loop for spaces
//                System.out.print(" ");
//            }
//
//            for (int j = 1; j <= i; j++) { // loop for stars
//                System.out.print(j);
//
//            }
//            System.out.println();
//
//        }
        // to print rhombus
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) { // loop for triangle spaces
                System.out.print(" ");
            }

            for (int j = 1; j <= n; j++) { // loop for square stars
                System.out.print("*");

            }
            System.out.println();

        }
// for pyramid:
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) { // loop for spaces
                System.out.print("  ");
            }

            for (int j = 1; j <= 2*i-1; j++) { // loop for stars
                System.out.print("*" + "  ");

            }
            System.out.println();

        }









    }

}
