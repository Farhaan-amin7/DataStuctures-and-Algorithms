package SuperPackage.OOPS;
class A{
    void CallMe(){
        System.out.println("Inside A's call me method");
    }
}
class B extends A{
    void CallMe(){
        System.out.println("Inside B's call me method");
    }
}
class C extends A{
    void CallMe(){
        System.out.println("Inside C's void call me method");
    }
}
public class Dispatch {
    public static void main(String[] args) {
        A a = new A();   // This is an object of class A.
        B b =  new B();  // Object of class B.
        C c = new C();   // Object of class C.

        A r;  //  Reference of type A.

        r = a; // Put the Object reference of class A  in r.

        r.CallMe();  // As the reference is assigned to the r, so the r object is now refering to the A class object. So it will have all the methods and variables of the class A.

        r = b;     // Object reference of B is given to the r reference variable so r will have access to all the instances and the variables of the class B.
        r.CallMe();

        r = c;  // Object reference variable of C is given to the instance variable r so r will have the access to all the methods and variables of the C class.
        r.CallMe();
    }
}