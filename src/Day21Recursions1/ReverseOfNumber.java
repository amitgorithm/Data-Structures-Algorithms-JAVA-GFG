package Day21Recursions1;

public class ReverseOfNumber {
    public static int reverse (int n, int r){
       if(n==0) return r;
       return reverse(n/10,r*10+n%10);
    }

    public static void main(String[] args) {
        int n = 2456;
//        int r = 0;
//        while(n!=0){
//            r*=10;
//            r+=(n%10);
//            n/=10;
//
//        }
        System.out.println(reverse(n,0));
    }
}
