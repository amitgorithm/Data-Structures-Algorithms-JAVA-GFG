package Day6;

import java.util.Scanner;

public class pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a  number :  ");
        int n = sc.nextInt();

        // method 1 using 2*i-1
        // for pyramid:
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n-i; j++) { // loop for spaces
//                System.out.print("  ");
//            }
//
//            for (int j = 1; j <= 2*i-1; j++) { // loop for stars
//                System.out.print("*" + " ");
//
//            }
//            System.out.println();
//
//        }


        // method 2 using nst and nsp
        // number of spaces and number of stars , nsp nst
        // for pyramid:
        int nsp = n-1, nst = 1;
        for (int i = 1; i <= n; i++) { // lines
            for (int j = 1; j <= nsp; j++) { // loop for spaces
                System.out.print(" " + " ");
            }

            for (int j = 1; j <= nst; j++) { // loop for stars
                System.out.print("*" + " ");
            }
            nsp--;  // decrease number space per every line
            nst+=2; // increase stars by two in every line
            System.out.println();

        }

        // for number patterns in pyramid:
//        int nsp = n-1, nst = 1;
//        for (int i = 1; i <= n; i++) { // lines
//            for (int j = 1; j <= nsp; j++) { // loop for spaces
//                System.out.print(" " + " ");
//            }
//
//            for (int j = 1; j <= nst; j++) { // loop for stars
//                System.out.print((i) + " ");
//            }
//            nsp--;  // decrease number space per every line
//            nst+=2; // increase stars by two in every line
//            System.out.println();
//
//        }

    }
}
