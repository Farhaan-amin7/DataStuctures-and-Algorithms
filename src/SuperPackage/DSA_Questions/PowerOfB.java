package SuperPackage.DSA_Questions;

public class PowerOfB {
    public static void main(String[] args) {
        int result = aPowerB(2, 5);
        System.out.println(result);
    }
    public static int aPowerB(int base, int power){
        int ans = 1;
        while(power>0){
            if((power & 1) == 1){
                ans = ans * base;
            }
             base = base * base;
             power = power >> 1;
        }
      return ans;
    }
}