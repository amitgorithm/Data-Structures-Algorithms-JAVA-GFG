package Day6;

import java.util.Scanner;

public class alphabetSquareSmallCapital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
//        System.out.println("Enter columns : ");
//        int col = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((j)%2==0){
                    System.out.print((char)(j+64)+ " ");
                } else {
                    System.out.print ((char)(j+95)+ " ");
                }
            }
            System.out.println();
        }

    }
}
