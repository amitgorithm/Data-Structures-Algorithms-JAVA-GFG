package Day23Recursions3;

import java.util.ArrayList;

public class StringsBasicsMore {
    public static void main(String[] args) {
        String s = "Kartikey";
        change(s);
        System.out.println(s);

        String[] arr = {"Santosh", "Krish", "Hemant", "Vivek", "Preet" };
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        ArrayList<String> al = new ArrayList<>();
        al.add("Shravani");
        al.add("Umang");
        al.add("Ayan");
        al.add("Shelly");
        al.add("Riya");
        System.out.println(al);
        chnage2(al);
        System.out.println(al);

    }

    private static void chnage2(ArrayList<String> al) {
        al.add("Biplab");
    }

    private static void change(String s) {
        s = "Lavish";
    }
}
