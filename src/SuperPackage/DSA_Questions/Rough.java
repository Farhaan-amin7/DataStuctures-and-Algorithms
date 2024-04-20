package SuperPackage.DSA_Questions;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Rough {
    public static void main(String[] args) {


        String p = "ba";
//        System.out.println(name.substring(1,5));
        char ch = p.charAt(0);
        String f = p.substring(1 , 1);
        System.out.println(f);
//        int temp1 = 100;
//        for (int i = 0; i <= 2; i++) {
//            int num = temp1 % 10;
//            System.out.println(num);
//            temp1 = temp1 / 10;
//            System.out.println(temp1);
//        }
//        Creating a new multidimensional List of lists.
//        List<List<String>> list = new ArrayList<>();
//        list.add(new ArrayList<>());
//        List<String> string = new ArrayList<>(list.get(0));
//        list.add(string);
//       // This is the new arraylist in the existing List of List which i have created.
//        System.out.println(list.get(0).get(0));
//        System.out.println(list);

//        int [] arr = new int[temp.length + 1];
//        List<Integer> list = new ArrayList<>(); // The decleration of the actaul list that we are going to return in our  question.
//
//        for (int i = 0; i < temp.length; i++) {
//            list.add(i, temp[i]);
//        }
//         System.out.println(list);
//         System.out.println(Arrays.toString(temp));
//        System.out.println(Arrays.toString(arr));
////     int count = 5;
//        int [] arr = new int[2];
//        count++;

//        System.out.println(arr.length);
//        temp = letsreturnit(arr);
//        System.out.println(Arrays.toString(temp));
//        System.out.println(arr.length);
//        System.out.println(ans(arr));
//        int n= ResetTheIthBit(arr[0]);
//        System.out.println(n);
//        int n = 49;
//        if((n&1)==1) System.out.println("ITs odd");
//        else System.out.println("ITs not odd");
//        System.out.println(PowerOfTwo(256));
//        System.out.println(arr());
//

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
    static double arr(){
        int n = 40;
        double root;
        while (true){
            double x = n;

            root = Math.abs(0.5 * x / (n /x));
            x = root;

            if(root < 1){
                break;
            }
        }

        return root;
    }
    static int[] letsreturnit(int [] nums){
        int [] temp;
        return new int[]{-1,-1};
    }



}