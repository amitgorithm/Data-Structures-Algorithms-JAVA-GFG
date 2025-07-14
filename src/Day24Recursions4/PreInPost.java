package Day24Recursions4;

public class PreInPost {
    public static void main(String[] args) {
        pip(1);
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
