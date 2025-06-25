package Day3;
import java.util.Scanner;

public class profitOrLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Cost Price: ");
        double cp = sc.nextDouble();
        System.out.print("Enter Selling Price: ");
        double sp = sc.nextDouble();

        double profitper = ((sp/cp)*0.1);




//        if(sp>cp) System.out.println("profit");
//        else System.out.println("loss"); // problem is there is no profit no loss statement

        if(sp>cp) System.out.println("profit is " + (sp-cp) + "  profit % is : " + profitper );
        else if(cp>sp) System.out.println("Loss is " + (cp-sp));
        else System.out.println("No Profit No Loss");

    }
}
