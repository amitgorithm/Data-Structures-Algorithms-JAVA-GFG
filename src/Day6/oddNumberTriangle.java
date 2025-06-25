package Day6;

import java.util.Scanner;

public class oddNumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an  number ");
        int n = sc.nextInt();

       int a = 0;

        for (int i = 1; i <= n; i++) {

            a = 1; // this will initialise a as 1 every iteration of " i "


            for (int j = 1; j <= i; j++) {
                System.out.print(a + " ");
                a+=2;
            }

            System.out.println();
        }

    }
}
