package Day19Strings;

public class immutabilityInStrings {
    public static void main(String[] args) {
        String s = "amit";
        s = "Harsh";
        System.out.println(s);

        String x = "Guddu"; //
        String y = "Guddu"; //
        String a = new String("Guddu"); //  creates new string in memory

        String b = "Karan";
        b += "Saini";
        // o/p => "KaranSaini" // completely new string will be formed

        String abc = "Bishal"; //change this to Bishul
        String xyz = abc.substring(0,4)+"u"+ abc.substring(5);
        System.out.println(xyz);
    }
}
