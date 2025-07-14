package Day23Recursions3;

import java.util.ArrayList;
import java.util.List;

public class PrintSubsetsofString {
    public static void main(String[] args) {
        String s = "abc";
        List<String> list = new ArrayList<>();
        subsets("",s,0,list);
    }

    private static void subsets(String ans, String s, int idx, List<String> list) {
        if(idx==s.length()){
            if(ans.length()!=0) list.add(ans);
            return;
        }
        char ch = s.charAt(idx);
        subsets(ans+ch,s,idx+1,list); // pick
        subsets(ans,s,idx+1,list); // skip
    }
}
