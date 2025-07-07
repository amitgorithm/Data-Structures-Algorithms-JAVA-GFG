package Day19Strings;

public class SubStringOfString {
    public static void main(String[] args) {
        String s = "Jaishankar";
        System.out.println(s.substring(3));
        System.out.println(s.substring(1));
        System.out.println(s.substring(1,5)); // 1 to 4
        System.out.println(s.substring(1,s.length()-1)); // will print from index 1, but exclude last


    }
}
