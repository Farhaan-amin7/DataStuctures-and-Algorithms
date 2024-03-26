package SuperPackage.OOPS;

public class DemoSuper {
    public static void main(String[] args) {
        BoxWeight boxWeight = new BoxWeight(10,20,30,40);
        BoxWeight boxWeight1 = new BoxWeight(10,20,30,0.0763);
        BoxWeight boxWeight2 = new BoxWeight();
        BoxWeight cube = new BoxWeight(3,2);
        BoxWeight clone = new BoxWeight(boxWeight);

        double volume = boxWeight.volume();

        System.out.println( "The volume of the box is: " +volume);
        System.out.println("The weight of the box is:" + boxWeight.weight);
        System.out.println();

        // Do the same for the rest of the reference variable's.


    }
}