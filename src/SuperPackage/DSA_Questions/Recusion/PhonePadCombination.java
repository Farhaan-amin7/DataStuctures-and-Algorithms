package SuperPackage.DSA_Questions.Recusion;

import java.util.ArrayList;

public class PhonePadCombination {
    public static void main(String[] args) {
        String digits = "23";
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i < digits.length(); i++) {
          ans = phonePadCombination("",Integer.parseInt(String.valueOf(digits.charAt(i))));
        }
//        return ans;
    }
    public static ArrayList<String> phonePadCombination(String p, int howManyTimes){
        ArrayList<String> combination = new ArrayList<>();
        String [] input = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        for (int i = 0; i < input[howManyTimes].length() ; i++) {

        }
        return new ArrayList<>();
    }
}