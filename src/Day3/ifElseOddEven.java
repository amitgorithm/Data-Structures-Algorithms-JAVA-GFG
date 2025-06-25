package Day3;
import java.util.Scanner;


public class ifElseOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        double x = sc.nextDouble();
        if (x%2 == 0) {
            System.out.println("The number you have entered  " + x + " is Even ");
            System.out.println();
        } else if (x%2 == 1) {
            System.out.println("The number you have entered  " + x + " is Odd ");
        } else {
            System.out.println("The number you have entered is not a positive integer.");
        }


    }
}
