package Day24Recursions4;

public class TowerOfHanoi {
    public static void main(String[] args) {
        hanoi(5,'A','B','C');
    }

    private static void hanoi(int n, char a, char b, char c) {
        if(n==0) return;  // base

        // take n-1 discs from src to dest vis helper
        hanoi(n-1,a,c,b);

        // largest from src to dest;
        System.out.println(a+"->"+c);

        // n-1 disks from B to C via A
        hanoi(n-1,b,a,c);
    }
}
