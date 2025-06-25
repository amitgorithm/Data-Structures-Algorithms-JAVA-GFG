package Day2;

public class charDataType {
    public static void main(String[] args) {
        // typecasting - one data type to another data type conversion

//        char ch = 'A';
//        int x = ch; // implicit typecasting
//        System.out.println(x);
//
//        char example = '$';
//        int y = (int) example; // explicit typecasting
//        System.out.println(y);
//
//        char test  = 'a';
//        int z = test;
//        System.out.println(z);
//
//        char harsh = '3';
//        System.out.println((int)harsh);
        char ch = 'b';
        System.out.println(ch+ch);

        // integer to character
        int x = 65;
        char ch1 = (char) x; // explicit typecasting
        char ch2 = ch1++;
        System.out.println(ch1);

        double abc = 4.0 * 2.0 / 3.0 ;
        System.out.println(abc);
    }
}
