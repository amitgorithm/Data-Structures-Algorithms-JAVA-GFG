package Day19Strings;

import java.util.Scanner;

public class CountDigitsUsingString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        String s = "" + n;
        System.out.println(s.length());

        String str = "7567854";
        int xstr = Integer.parseInt(str);
        System.out.println(n+1);
    }
}
