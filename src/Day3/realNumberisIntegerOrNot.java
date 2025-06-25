package Day3;

import java.util.Scanner;

public class realNumberisIntegerOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        double n = sc.nextDouble(); // -3.145
        int x = (int)n; // typecasting the double 'n' to integer 'x'
        if (n-x == 0) System.out.println("Is an Integer");
        else System.out.println("Not an Integer");

        // alternative with using typecasting in if statement itself
        if(n-(int)n == 0) System.out.println("Is an Integer");
        else System.out.println("Not an Integer");


        // alternative
        if(n == (int)n ) System.out.println("Is an Integer");
        else System.out.println("Not an Integer");


    }
}
