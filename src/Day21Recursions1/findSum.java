package Day21Recursions1;

public class findSum {
    public static int findSum(int n){
        if(n==1) return 1;
            return n + findSum(n-1);
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(findSum(n));
    }
}
