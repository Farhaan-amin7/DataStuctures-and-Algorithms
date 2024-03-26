package SuperPackage.OOPS;

public class OldPerson extends SecondPerson{
    OldPerson(String name){
        super("Alex");
        value++;
        System.out.println("The old person's name is " + name);
    }
    public void MembersOfTheFamily(int value){
        System.out.println("The members of the family are " + value);
    }

}