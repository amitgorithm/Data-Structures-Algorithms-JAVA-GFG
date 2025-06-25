package Day5;

import java.util.Scanner;

public class countDigitsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = sc.nextInt();
        if(n==0) n=1; // as '0' is a 1 digit number
        int count  = 0;

       while(n!=0){
           n=n/10; // keep dividing until it is 0.
           count++; // increment

       }
        System.out.println(count);
    }
}
