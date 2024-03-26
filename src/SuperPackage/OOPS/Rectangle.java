package SuperPackage.OOPS;

public class Rectangle extends Shapes{
    double area;
    Rectangle(){
        System.out.println("The constructor of  Rectangle class awoke");
    }
    Rectangle(Shapes newshapes, double area){
        height = newshapes.height;
        length = newshapes.length;
        weight = newshapes.weight;
        this.area = area;
    }
    Rectangle(double height, double length){
        this.height = height;
        this.length = length;
    }
    public double Area(double height, double weight, double length){
        return 2 * (length + height) / 2;
    }
}