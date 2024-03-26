package SuperPackage.OOPS;

public class Box {
    double length;
    double height;
    double width;

    public Box(double length, double height, double width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    Box(){
        this.length  = - 1;
        this.length = -1;
        this.width = -1;

    }
    Box(double length){
        width = height = length;
    }
    Box(Box obj){
        width = obj.width;
        length = obj.length;
        height = obj.height;
    }
    double volume()
    {
        return width * height * length;
    }
}