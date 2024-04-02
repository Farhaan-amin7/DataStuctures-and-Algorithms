package SuperPackage.Hashing;

public class Main {
    public static void main(String[] args) {
        HashMapFinal<String, String> map = new HashMapFinal<>();
        map.put("Mango", "That's mine");
        map.put("Apple", "The kashmiri one");
        map.put("Potato", "Kunal's fav fruit");
        System.out.println(map.get("Apple"));

    }
}