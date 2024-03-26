package SuperPackage.OOPS;

public class BoxWeight extends Box{
    double weight;

    BoxWeight(BoxWeight obj){
        super(obj);
        weight = obj.weight;
    }
    BoxWeight(double weight, double height, double length, double width){
        super(width, length, height);
        this.weight = weight;
    }
    BoxWeight(){
        super();
        weight = -1;
    }
    BoxWeight(double length, double weight){
        super (length);
        weight = width;
    }
}