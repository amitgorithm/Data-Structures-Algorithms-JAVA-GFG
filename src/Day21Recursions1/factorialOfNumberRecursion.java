package Day21Recursions1;

public class factorialOfNumberRecursion {
    public static void main(String[] args) {
        int n=5;
        System.out.println(factorial(5));
    }
        public static int factorial(int n){
            if(n==0 || n==1) return 1;
            return n*factorial(n-1);

    }
}
