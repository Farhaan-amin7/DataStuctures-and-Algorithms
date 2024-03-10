package SuperPackage.DSA_Questions;


import java.util.Arrays;

import static java.lang.String.valueOf;

public class ShuffleStrings {
    public static void main(String[] args) {
       String add = "codeleet";
       int [] arr = {4,5,6,7,0,2,1,3};

       String output = ShuffledStringis(arr, add);
        System.out.println(output);
    }

     static String ShuffledStringis(int[] arr, String add) {
        char [] str = new char[arr.length];

         for (int i = 0; i < arr.length; i++) {
             str[arr[i]] = add.charAt(i);
         }
        return valueOf(str);
    }




}