package SuperPackage.DSA_Questions;

import java.util.*;

public class Rough {
    public static void main(String[] args) {
//     int [] arr = {5,6,7,7,6,5,8};
//        System.out.println(ans(arr));
//        int n= ResetTheIthBit(arr[0]);
//        System.out.println(n);
//        int n = 49;
//        if((n&1)==1) System.out.println("ITs odd");
//        else System.out.println("ITs not odd");
        System.out.println(PowerOfTwo(256));

    }
    static int ans(int [] arr){
        int uni = 0;
        for( int n : arr){
            uni= uni ^ n;
        }
        return uni;
    }
    static int ResetTheIthBit(int n){
        return ~(1 << (n- 1));

    }
    static boolean PowerOfTwo(int n){
       return (n & (n - 1)) == 0;
    }

}