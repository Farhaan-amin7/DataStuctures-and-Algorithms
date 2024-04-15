package SuperPackage.DSA_Questions.Recusion.RecurrArrays;

import java.util.ArrayList;

public class FindElements {
    public static void main(String[] args) {
        int[] arr = {1, 4, 52, 1, 4, 18};
        int target = 1;
        System.out.println(findAllIndexes2(arr, target, 0));
    }
    // List reference variable's may change but the object will stay the same.

    static boolean find(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || find(arr, target, index + 1);
    }

    static int findIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndex(arr, target, index + 1);
        }

    }

    static int findIndexFromLast(int[] arr, int target, int index) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndex(arr, target, index - 1);
        }
    }

    static int findAllIndexes(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndexes(arr, target, index + 1);
    }

    static ArrayList<Integer> findAllIndexes1(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndexes1(arr, target, index + 1, list);
    }

    // Passing the reference variable's to the argument means that the variable will be helpful to other calls as well/ will be available to other function calls as well
    // Declaring the Variable into the function body, means that the variable will be available to the function body only in a specific call.
    static ArrayList<Integer> findAllIndexes2(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndexes2(arr, target, index + 1);
        list.addAll(ansFromBelowCalls);
        return list;

    }
}