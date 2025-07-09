package Day21Recursions1;

import java.util.Scanner;

public class ARaisedToPowerB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base: ");
        int a = sc.nextInt();
        System.out.print("Enter Exponent: ");
        int b = sc.nextInt();
        System.out.println(a + " raised to the power "+b+" is "+power(a,b));
    }
        public static int power(int a, int b){
            if(b==0) return 1;
            int call = power(a,b/2);
            if(b%2==0) return call*call;
            else return a*call*call;


    }
    // with bad time complexity
//    public static int power(int a, int b){
//        if(b==0) return 1;
//        return a*power(a,b-1);
//
//    }
}
