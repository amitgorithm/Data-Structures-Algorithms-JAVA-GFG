package Day6;

import java.util.Scanner;

public class bridgePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a  number :  ");
        int n = sc.nextInt();



        int nsp = 1;
        for (int i = 1; i <= n-1; i++) { // lines
            for(int j=1;j<=n;j++ ){
                System.out.print("*");
            }


            for (int j = 1; j <= nsp; j++) { // loop for spaces
                System.out.print(" " + " ");
            }
            for(int j=1;j<=n;j++ ){
                System.out.print("*");
            }


            }
            nsp--;  // decrease number space per every line
            System.out.println();

        }


    }


