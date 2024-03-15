package SuperPackage.DSA_Questions;

import java.util.*;

public class Rough {
    public static void main(String[] args) {
     int [] arr = {2,6,5,2,4,4,5};
        System.out.println(ans(arr));

    }
    static int ans(int [] arr){
        int uni = 0;
        for( int n : arr){
            uni= uni ^ n;
        }
        return uni;
    }

}