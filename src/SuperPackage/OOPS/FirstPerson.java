package SuperPackage.OOPS;

public class FirstPerson extends Family{
    String name;
    FirstPerson(){
        System.out.println("I am the home's first person.");
    }

    FirstPerson(String name){
        super("TheBigPapa");
        value++;
        System.out.println("I am the First person in my family and My name is " + name);
    }
}