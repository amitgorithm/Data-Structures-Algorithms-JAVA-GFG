package Day3;
import java.util.Scanner;

public class greatestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // take 3 pos integers and print greatest of them
        // using nested ifelse

        System.out.println(" Enter 1st no. : ");
        int a = sc.nextInt();
        System.out.println(" Enter 2nd no. : ");
        int b = sc.nextInt();
        System.out.println(" Enter 3rd no. : ");
        int c = sc.nextInt();

        if (a >= b) {
            if (a >= c) System.out.println(a);
            else // c>a
                System.out.println(c);
        } else { // b > a
            if (b >= c) System.out.println(b);
            else // c > b
                System.out.println(c);
        }

    }
}
