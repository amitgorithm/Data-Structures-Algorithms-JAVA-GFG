package Day5;

import java.util.Scanner;

public class sumOfDigitsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = sc.nextInt();
        // example 56142
        int sum = 0;
        while (n!=0)
            {
            sum = sum + n%10;
            n = n/10; // iteration on n , dividing by 10 until it reaches 0
        }
        System.out.println("Sum of Digits is " + ((sum>0) ? sum : -sum));


    }
}
