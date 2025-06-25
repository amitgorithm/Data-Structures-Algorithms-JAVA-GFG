package Day3;
import java.util.Scanner;

public class divisibleby53both {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = sc.nextInt();

//        if(n>999 && n<10000)
//            System.out.println("4 digit number");
//        else System.out.println("not a 4 digit number");

        //alternatively using math.log function:
//        if((int)Math.log10(n)==4)
//            System.out.println("4 digit number");
//        else System.out.println("not a 4 digit number");

        // alternatively in one statement
//        if(n%1000==n)
//            System.out.println("Not a 4 digit Number ");
//        else
//            System.out.println("4 digit number.");
        // alternatively : n=n/10
        //Count++
        //If(count==4)
        //4 digit

        // || is OR relational operator, if either of the conditions is true,
        // it will pass as true
//        if (n%5 == 0 || n%3 == 0)
//            System.out.println("Divisible by 5 or 3");
//        else
//            System.out.println("Not Divisible by 5 or 3");

        // if (cond1) ----
//                else if(cond2) ---
//                else if(cond3)---
//                else if(cond4)---
//           else ----

        if (n % 3 == 0 && n % 5 == 0){
            System.out.println("Divisible by both 3 and 5");
      }  else if (n % 3 == 0) {
            System.out.println("Divisible by only 3");
        } else if (n % 5 == 0) {
            System.out.println("Divisible by only 5");
        } else {
            System.out.println("Not divisble by 5 or 3");
        }

        // alternatively using boolean and storing boolean value to check divisibility
//        boolean divBy3 = (num % 3 == 0);
//        boolean divBy5 = (num % 5 == 0);
//
//        if (divBy3 && divBy5) {
//         System.out.println("Apurva");
//        } else if (divBy5) {
//        System.out.println("Riya");
//        } else if (divBy3) {
//         System.out.println("Bannu");
//         } else {
//         System.out.println("Isha");
//         }






    }
}
