package Day6;
import java.util.Scanner;

public class starCrossPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an odd positive number ");
        int n = sc.nextInt();

        for ( int i = 1; i <= n; i++) {
            for ( int j = 1; j <= i; j++){
//
                if (i==j) {
                    System.out.print("* ");
                }
                else  {
                    System.out.print("  ");
                }


            }
            System.out.println();
        }

       // to print cross on a square
        for ( int i = 1; i <= n; i++) {
            for ( int j = 1; j <= n; j++){

                if ((i==j) || ((i+j)==(n+1)) ) {
                    System.out.print("* ");
                }
                else  {
                    System.out.print("  ");
                }


            }
            System.out.println();
        }

        // to print straight plus sign:
        for ( int i = 1; i <= n; i++) {
            for ( int j = 1; j <= n; j++){
//
                if ((i==(n/2+1)) || ((j)==(n/2)+1) ) {
                    System.out.print("* ");
                }
                else  {
                    System.out.print("  ");
                }


            }
            System.out.println();
        }




    }

}
