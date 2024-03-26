package SuperPackage.OOPS;

public class Family {
    String HomeOwner;
    int value;

    Family(){
        System.out.println("This is my family.");
    }
    Family(String HomeOwner){
        this.HomeOwner = HomeOwner;
        value++;
        System.out.println("I am the owner of the family and ny name is: " + HomeOwner);
    }
    public void FamilyMembers(){
        System.out.println("We have this many members in our family " + value);
    }

    public static void main(String[] args) {
        OldPerson oldPerson = new OldPerson("OldSan");
        oldPerson.MembersOfTheFamily(oldPerson.value);
    }

}