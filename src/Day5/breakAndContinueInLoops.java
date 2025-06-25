package Day5;

import java.util.Scanner;

public class breakAndContinueInLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = sc.nextInt();

        boolean isPrime = true; // true means prime
        // write a program to check if number is a composite number or not.
        // composite number is a number with more than two factors (divisible by thrm)
        // hence we divide it by 2 to n-1
        // as iot is divisible by 1 and itself, that is it is a prime number.

//           for (int i = 2; i<=n-1; i++) {
//               if(n%i == 0) {
//                   System.out.println("Composite Number ");
//                   break; // this breaks the loop, once condition is satisfied.
//               }
//           }

        // WAP to print both composite or prime:

        for (int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) {
                isPrime = false; // false means composite
                break;
            }
        }
        if(n==1) System.out.println("Neither Prime nor Composite ");
        if(isPrime ==false) System.out.println("Composite Number ");
        if(isPrime ==true) System.out.println("Prime Number ");


        // WAP to take number input and print all of its factors:
//        for (int i = 2; i <= Math.sqrt(n) ; i++) {
//            if(n % i == 0){
//                System.out.println(i);
//                if(i != n/i){
//                    System.out.println(n/i);
//                }
//            }

        }
}
