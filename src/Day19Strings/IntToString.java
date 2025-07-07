package Day19Strings;

import java.util.Scanner;

public class IntToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        String  s = ""; // empty string
//        s += n;  // appending number with empty string
        String s = Integer.toString(n);
        System.out.println(s); // output will be string

    }
}
