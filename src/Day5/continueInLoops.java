package Day5;
import java.util.Scanner;

public class continueInLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = sc.nextInt();

        // print number from 1 to 20 with good morning, except number 13
        for(int i =1; i<=20; i++){
            System.out.println(i);
            if(i==13) continue; // skip this iteration and go to next
            System.out.println("Good Morning"); // this will be skipped when i=13



        }

    }
}
