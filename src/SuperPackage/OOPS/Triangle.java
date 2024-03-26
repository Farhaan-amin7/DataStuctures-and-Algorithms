package SuperPackage.OOPS;

public class Triangle extends Rectangle{
    double base;
    Triangle(){
//        super(10,20);
        System.out.println("Constructor of the Triangle awoke");
    }
    public double  AreaOfTheTriangle(double height, double base){
        return 0.5 * base * height;

    }
}