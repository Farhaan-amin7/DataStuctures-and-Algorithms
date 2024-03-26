package SuperPackage.OOPS;

public class SecondPerson extends FirstPerson{
    SecondPerson(String name){
        super("Robin");
        value++;
        this.name = name;
        System.out.println("I am the second person of my family and my name is " + name);
    }


}