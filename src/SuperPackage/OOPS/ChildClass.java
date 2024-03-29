package SuperPackage.OOPS;

public class ChildClass extends ParentClass{


    public void GetUpAndWork(String name){
        System.out.println("come on man " + name +" Get up and start working.");
    }
     public void greeting(){
        System.out.println("Hey hows it going, I am the method of the childClass.");
    }

    public static void main(String[] args) {
        ParentClass parentClass = new ChildClass();
        parentClass.greeting();
    }
}