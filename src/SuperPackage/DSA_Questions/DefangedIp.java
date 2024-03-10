package SuperPackage.DSA_Questions;



public class DefangedIp {
    public static void main(String[] args) {
        String builder = "1.1.1.1";
        System.out.println((Defangedip((builder))));

    }

    public static String Defangedip(String builder) {
        if(builder.length() == 0 || builder.equals(null)){
            return "NUN";

        }
//        for (int i = 0; i < builder.length(); i++) {
//               builder.replace(".","[.]");
//        }
        return builder.replace(".","[.]");
    }
}