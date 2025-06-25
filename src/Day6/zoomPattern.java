package Day6;

import java.util.Scanner;

public class zoomPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();


        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(Math.min(i,j) + " ");
                // to print minimum of i,j

            }
            System.out.println();
        }


        for (int i = 1; i <= 2*n-1 ; i++) {
            for (int j = 1; j <= 2*n-1; j++) {
                int a = i, b = j;
                if(i>n) {
                    a = 2*n -i;
                }
                if(j>n) {
                    b = 2*n -j;
                }

                System.out.print(Math.min(a,b) + " ");
                // to print minimum of i,j

            }
            System.out.println();

        }


        for(int i = 1; i <=n ; i++){
            for (int j =1;  j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
