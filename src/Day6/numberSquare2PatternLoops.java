package Day6;

import java.util.Scanner;

public class numberSquare2PatternLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows : ");
        int n = sc.nextInt();
//        System.out.println("Enter columns : ");
//        int col = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i + " * ");
            }
            System.out.println();
        }
    }
}
