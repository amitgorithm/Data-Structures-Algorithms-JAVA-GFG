package Day6;

import java.util.Scanner;

public class alphaNumericTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            for (int j = i; j <= n; j++) {

//                System.out.print("* ");

                if ((i % 2 != 0)) System.out.print(j + " ");
                if ((i % 2 == 0)) System.out.print((char)(j+96) + " ");


            }
            System.out.println();
        }

    }
}
