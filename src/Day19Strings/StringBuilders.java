package Day19Strings;

public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("amit");
        System.out.println(s);
        System.out.println(s.length()+ " "+ s.capacity());

        s.append("jape");
        System.out.println(s); // this works like an arraylist
        System.out.println(s.length()+ " "+ s.capacity());

        s.setCharAt(1,'o');
        System.out.println(s);
        String t = s.toString();
        System.out.println(t);
        s.append("tesitngjhbbkhdhhfmd hkbjhfhkanme ");
        System.out.println(s.length()+ " "+ s.capacity());




    }
}
