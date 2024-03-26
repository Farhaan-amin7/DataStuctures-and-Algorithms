package SuperPackage.OOPS;

public class Shapes {
    double height;
    double weight;
    double length;
    Shapes(double height, double weight, double length){
        this.height = height;
        this.weight = weight;
        this.length = length;
    }
    Shapes(){
        this.height = -1;
        this.weight = -1;
        this.length = -1;
    }

    public static void main(String[] args) {
        Triangle tri = new Triangle();
        double area = tri.AreaOfTheTriangle(10,20);
        System.out.println(area);
    }
}