package Day21Recursions1;

public class powerOfNumbers {
    public static int pow(int a, int b){
        if(b==0) return 1;
        int call = pow(a,b/2);
        if(b%2==0) return call*call;
        else  return call*call*a;
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 3;
        System.out.println(pow(a,b));
    }
}
