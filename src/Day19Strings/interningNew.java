package Day19Strings;

public class interningNew {
    public static boolean equals(String s1, String s2){
        if(s1.length()!=s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i)!=s2.charAt(i))return false;
        }
        return true;
    }
    public static void main(String[] args) {
//        String s1 = "amit";
//        String s2 = "amit";
//        System.out.println(s1==s2); // true

        String s1 = "amit";
        String s2 = new String ("amit");
        System.out.println(s1.equals(s2)); // true
    }
}
