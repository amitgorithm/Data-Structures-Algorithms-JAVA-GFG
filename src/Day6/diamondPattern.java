package Day6;

import java.util.Scanner;

public class diamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a  number :  ");
        int n = sc.nextInt();

        int nsp = n - 1, nst = 1;
        for (int i = 1; i <= n; i++) { // lines
            for (int j = 1; j <= nsp; j++) { // loop for spaces
                System.out.print(" " + " ");
            }

            for (int j = 1; j <= nst; j++) { // loop for stars
                System.out.print("*" + " ");
            }
            nsp--;  // decrease number space per every line
            nst += 2; // increase stars by two in every line
            System.out.println();

        }

        nsp = 1;
        nst = 2*n-3;
        for (int i =1; i<= n-1; i++){
            for (int j = 1; j <= nsp; j++) { // loop for spaces
                System.out.print(" " + " ");
            }

            for (int j = 1; j <= nst; j++) { // loop for stars
                System.out.print("*" + " ");
            }
            nsp++;  // increase number of space per every line
            nst -= 2; // decrease stars by two in every line
            System.out.println();

        }


        }

    }

