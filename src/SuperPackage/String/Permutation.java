package SuperPackage.String;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        int count = 0;
        permutations("", "abc",0);

    }
    static void permutations(String p, String up, int count){
        if(up.isEmpty()){
            System.out.println(p);
            count += count;
            System.out.println(count);
            return;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0 , i);
            String s = p.substring(i, p.length());
            permutations(f + ch + s, up.substring(1), count + 1);
        }
    }
    static ArrayList<String> permutationsList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String>  list= new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        // Local to a specific call
        ArrayList<String > ans = new ArrayList<>();


        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0 , i);
            String s = p.substring(i, p.length());
            ans.addAll(permutationsList(f + ch + s, up.substring(1)));
        }
        return ans;
    }
}