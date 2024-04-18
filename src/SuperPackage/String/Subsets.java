package SuperPackage.String;

import java.util.ArrayList;

public class Subsets {
    public static void main(String[] args) {
        subSeq("","abc");

    }
    static void subSeq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        subSeq(p + ch,up.substring(1) );
        subSeq(p, up.substring(1));
    }
//    static ArrayList<String> AlsubSeq(String p, String up){
//        if(up.isEmpty()){
//            System.out.println(p);
//            return;
//        }
//        char ch = up.charAt(0);
//
//        subSeq(p + ch,up.substring(1) );
//        subSeq(p, up.substring(1));
//    }
}