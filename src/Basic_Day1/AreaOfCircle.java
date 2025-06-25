package Basic_Day1;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        // area of circle = pi*r*r
        Scanner sc = new Scanner(System.in); // to take inputs

        System.out.print("Enter Radius:  ");
        double r = sc.nextDouble();

        double a = 3.14592 * r * r;
        System.out.println("Area is : " +  a);
//        double test = 22;
//        double testdec = test/7;
//        System.out.println(testdec);
    }
}
