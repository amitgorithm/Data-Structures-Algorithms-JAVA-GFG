package Day22Recursions2;

public class GCDof2Numbers {
    // using for loop:
//    public static int gcd(int a, int b){
//        int hcf = 1;
//        for (int i = 2; i < Math.min(a,b); i++) {
//            if(a%i==0 && b%i==0){ // i is common factor
//                hcf = i;
//            }
//        }
//        return hcf;
//    }
    // using recursion:
    public static int gcd(int a, int b){
        if(a==0) return b;
        return gcd(b%a,a);
    }
    public static void main(String[] args) {
        int a = 12;
        int b = 16;
        System.out.println(gcd(a,b));

    }
}
