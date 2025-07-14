package Day24Recursions4;

public class PreInPost {
    public static void main(String[] args) {
        pip(3);
    }

    private static void pip(int n) {
        if(n == 0) return;
        System.out.println(n + " "); // pre
        pip(n-1);
        System.out.println(n + " "); // in
        pip(n-1);
        System.out.println(n + " "); // post
    }
}
// n = 1 : O/P ->        1 1 1
// n = 2 : O/P ->      2 1 1 1 2 1 1 1 2
// n = 3 : O/P ->    3 2 1 1 1 2 1 1 1 2 3 2 1 1 1 2 1 1 1 3
// n = 4 : O/P -> 4 (entire 3 pattern) 4 (entire 3 pattern) 4 (entire 3 pattern) 4