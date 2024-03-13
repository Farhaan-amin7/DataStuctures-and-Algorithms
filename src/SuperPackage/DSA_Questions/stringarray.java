package SuperPackage.DSA_Questions;

import java.util.Arrays;

public class stringarray {
    public static void main(String[] args) {
   char [] s = {'h','e','l','l','o'};
        reverseString(s);
        for(char element:s){
            System.out.println(element);
        }
    }
    public  static void reverseString(char[] s){
       FearTheGod(s,0,s.length- 1);

    }
     public static char [] FearTheGod(char [] s, int start, int end){
        if(end == start){

            return s;
        }
        if(end > s.length / 2){
            {
                int temp = s[start];
                s[start] = s[end];
                s[end] = (char)temp;
            }
            return FearTheGod(s,start + 1,end - 1);
        }
        return s;
    }


}