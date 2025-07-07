package Day19Strings;

public class compareTostringMethod {
    public static int compareTo(String a, String b){
        return -1; // HW HomeWork
    }
    public static void main(String[] args) {
        String a = "raghav";
        String b = "rPreet";
        System.out.println(a.compareTo(b));
        System.out.println(compareTo(a,b));
        a = a.concat(b);
        System.out.println(a.concat(b));
    }
}
