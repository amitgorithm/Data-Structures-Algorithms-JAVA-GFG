package Day19Strings;

public class reverseSb {
    public static void main(String[] args) {
        String s = "JohnDoe";
        StringBuilder sb = new StringBuilder(s);
//        sb.reverse();
        int i = 0, j =sb.length()-1;
        while(i<=j){
            char temp1 = sb.charAt(i);
            char temp2 = sb.charAt(j);
            sb.setCharAt(i,temp2);
            sb.setCharAt(j,temp1);
            i++;
            j--;
        }
        System.out.println(sb);

        sb.reverse();
        System.out.println(s);

        sb.deleteCharAt(1);
        System.out.println(sb);

        sb.delete(0,3);
        System.out.println(sb);

        String abc = "Aditya"; // to reverse this string :
        StringBuilder SB = new StringBuilder(abc);
        SB.reverse();
        abc = SB.toString();
        System.out.println(abc);

    }
}
