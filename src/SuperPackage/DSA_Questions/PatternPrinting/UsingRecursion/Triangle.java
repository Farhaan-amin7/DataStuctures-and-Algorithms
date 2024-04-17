package SuperPackage.DSA_Questions.PatternPrinting.UsingRecursion;

public class Triangle {
    public static void main(String[] args) {
    triangle(4, 0);
        System.out.println();
        System.out.println();
        normalTriangle(4, 0);
    }
    static void triangle(int row, int col){
        if(row == 0){
            return;
        }
        if( col < row){
            System.out.print("*");
            triangle(row, col + 1);
        } else{
            System.out.println();
            triangle(row - 1, 0);
        }
    }
    static void normalTriangle(int row, int col){
        if(row == 0){
            return;
        }
        if( col < row){
            normalTriangle(row, col + 1);
            System.out.print("*");
        } else{
            normalTriangle(row - 1, 0);
            System.out.println();
        }
    }
}