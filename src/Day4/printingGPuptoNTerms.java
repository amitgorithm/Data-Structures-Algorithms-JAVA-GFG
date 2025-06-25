package Day4;

import java.util.Scanner;

public class printingGPuptoNTerms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 'n' to print till n terms : ");
        int n = sc.nextInt();
        // GP is 1,2,4,8,16,32,.... so r = 2, and a = 1
        int a = 1, r = 2;
        for (int i = 1; i <= n; i++) {
            System.out.println(a);
            a*=r;
        }



    }
}
