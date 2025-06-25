package Day4;

import java.util.Scanner;

public class printEvenNumbersLoop {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
//        for (int i = 1; i <=100 ; i++) {
//          if(i%2 == 0)  System.out.print(i +"  ");
//        }

        for (int i = 17; i <=170 ; i+=17) {
            System.out.print(i +"  ");
        }

        for (int i = 1; i <=10 ; i++) {
            System.out.print("  " + 17 * i);
        }

        for (int i = 1; i <=100 ; i++) {
           if (i%3 == 0 && i%2 != 0) System.out.print(i + "  ");
        }
    }
}
