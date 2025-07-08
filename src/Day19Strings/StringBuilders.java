package Day19Strings;

public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("amit");
        System.out.println(s.length()+ " "+ s.capacity());
        System.out.println(s);
        s.append("jape");
        System.out.println(s); // this works like an arraylist

    }
}
