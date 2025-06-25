package Day6;
import java.util.Scanner;

public class patternStarPrintNestedLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows : ");
        int rows = sc.nextInt();
        System.out.println("Enter columns : ");
        int col = sc.nextInt();

//        for (int i = 1; i <= rows; i++) {
//            for (int j = 1; j <= col; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        for (int i = 1; i <= rows; i++) {
            for(int j = rows; j >= 1; j--) {
                System.out.print(" * ");
                col--;
            }
            System.out.println();
        }


        // print a square of stars with 'n' input
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        }
}
