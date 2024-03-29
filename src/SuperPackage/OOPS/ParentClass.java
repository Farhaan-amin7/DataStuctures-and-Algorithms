package SuperPackage.OOPS;

import javax.print.attribute.standard.MediaPrintableArea;

public class ParentClass {
    protected int variable;
    protected String name;
    protected long marks;

    ParentClass(){
        this.variable = -1;
        this.name = null;
        this.marks = -1;
    }
    ParentClass(int variable, String name, long marks){
        this.variable = variable;
        this.name = name;
        this.marks = marks;
    }
    ParentClass(String name){
        this.name = name;
    }
    public void greeting(){
        System.out.println("Hey, Hello Good morning what's up. I am the greeting method in the ParentClass");
    }
    public void GetupAndWork(String name){
        System.out.println("Come'on man " + name + "You gotta get up and start working.");
    }
    public void extraMethod(){
        System.out.println("I am the extra method of the Parent class");
    }
}