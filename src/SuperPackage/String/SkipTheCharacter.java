package SuperPackage.String;

public class SkipTheCharacter {
    public static void main(String[] args) {
        System.out.println(skipAppNotApple("bcapplecad"));
    }
    static  void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char h = up.charAt(0);
        if(h == 'a'){
            skip(p, up.substring(1));
        } else{
            skip(p + h, up.substring(1));
        }
    }
    static String skip(String up){
        if(up.isEmpty()){
            return "";
        }
        char h = up.charAt(0);
        if(h == 'a'){
            return skip(up.substring(1));
        } else{
            return  h + skip( up.substring(1));
        }
    }
    static String skipApple(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("apple")){
            return skipApple(up.substring(5));
        } else{
            return  up.charAt(0) + skipApple( up.substring(1));
        }
    }
    static String skipAppNotApple(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("app") && !up.startsWith("apple")){

            return skipAppNotApple(up.substring(3));
        } else{
            return  up.charAt(0) + skipAppNotApple( up.substring(1));
        }
    }
}