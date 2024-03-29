package SuperPackage.String;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

public class RandomString {
    public static void main(String[] args) {
//        int size = 25;
//       String name =  InsertRandomString(size);
//        System.out.println(name);

        String sentence = "Hi What is    your nameeee         .";
        System.out.println(sentence.replaceAll("\\s", ""));
        String arr = "Farhaan amin,mir,what,is,your name";
        String [] name2 = arr.split(",");
        System.out.println(Arrays.toString(name2));
        DecimalFormat df = new DecimalFormat("0.00000");
        System.out.println(df.format(7.29));

    }
public static String InsertRandomString(int size){
    StringBuffer sb = new StringBuffer(size);
    Random random = new Random();
    for (int i = 0; i < size; i++) {
        int randomchar = 97 + (int)(random.nextFloat() * 26);
        sb.append((char) randomchar);
    }
    return sb.toString();
}
}