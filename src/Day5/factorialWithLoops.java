package Day5;

import java.util.Scanner;

public class factorialWithLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = sc.nextInt();
        int fact = 1;

        for(int i=1;i<=n;i++){
            fact *= i;
            System.out.println(fact);
        }
        System.out.println(fact);

    }
}
