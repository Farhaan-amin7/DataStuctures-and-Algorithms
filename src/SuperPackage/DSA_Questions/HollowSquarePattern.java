package SuperPackage.DSA_Questions;
public class HollowSquarePattern {
    public static void main(String[] args){
        int n = 6;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                 if(i == 0 && j == 0){
                     System.out.print("*");
                 }
                 else System.out.print(" ");
                 if( i == n - 1  && j == n - 1) System.out.print("* ");
            }
            System.out.println();
        }
    }
}