package Day2;

import java.util.Scanner;

public class TakingInputExamples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Length of Rectangle: ");
        double l = sc.nextDouble();
        System.out.print("Enter Breadth of Rectangle: ");
        double b = sc.nextDouble();
        double area = b*l;

        System.out.println("Area of Rectangle with breadth: " + b + " and length: " + l + " is: " + area );

    }

}
