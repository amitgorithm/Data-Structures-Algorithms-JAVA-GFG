package Day4;
import java.util.Scanner;
public class ternaryInVariable {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter a pos number : ");
        int x =  sc.nextInt();

        int xyz = (x>=0) ? xyz = 100 : x;
        System.out.println(xyz);


    }
}
