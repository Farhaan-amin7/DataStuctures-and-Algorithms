package SuperPackage.Arrays;

import java.util.ArrayList;
import java.util.List;

public class SubSet {
    public static void main(String[] args) {
        int [] arr = {1,2,2};
        List<List<Integer>> ans = subSetDuplicates(arr);
        for (List<Integer> list: ans){
            System.out.print(list + " -> ");
        }
        System.out.println("END");
    }
    static List<List<Integer>> subSet(int [] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int num : arr){
            int n = outer.size();
            for (int i = 0; i < n; i++) {
               ArrayList<Integer> internal = new ArrayList<>(outer.get(i));
//                System.out.println(outer.get(i));
            // gets the ith indexed list from the outer array list and then adds the num to the specified list(Internal list)
            // and then adds the newly created list to the outer list which is the original list.
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }
    static List<List<Integer>> subSetDuplicates(int [] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            start = 0;
            if(i > 0 && arr[i] == arr[i - 1]){
                start = end + 1;
            }
            end = outer.size() - 1;
            int n = outer.size();
            for (int j = start; j < n; j++) {
                ArrayList<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
}