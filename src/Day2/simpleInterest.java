package Day2;

import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal Amount : ");
        double p = sc.nextDouble();
        System.out.print("Enter Principal Amount : ");
        double r = sc.nextDouble();
        System.out.print("Enter Principal Amount : ");
        double t = sc.nextDouble();

        double SI = p*r*t/100;
        System.out.println("Simple Interest is : " + SI);

        int a = 6;
        int b = 4;
        int c = a%b;
        System.out.println(c);

    }
}
