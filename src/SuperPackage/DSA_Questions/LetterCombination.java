package SuperPackage.DSA_Questions;

import java.util.ArrayList;
// Let's break down the question into multiple lame sections and then try to compress the lame questions into a function or a loop maybe.
    // I have to map the value the second index and create the combinations of the first index of the second index item with all the elements of the third
// all the items of the third index.
// Probably that's how we could solve it in high time complexity.
public class LetterCombination {
    public static void main(String[] args) {
        System.out.println(padReturn("", "23"));

    }
    static void pad(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0';
        for (int i = digit - 1; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            pad(p + ch, up.substring(1));
        }
    }
    static ArrayList<String> padReturn(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';
        ArrayList<String> list = new ArrayList<>();
        for (int i = digit - 2; i < digit * 3 - 1; i++) {
            char ch = (char) ('a' + i);
            list.addAll(padReturn(p + ch, up.substring(1)));
        }
        return list;
    }
}