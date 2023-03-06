package inheritancePackage;

public class Inheritancesession {
    public static void main(String[] args){
        Child child=new Child();
        child.display();
        child.printA();
        Parent parent = new Parent();
        parent.display();
        GrandChild grandchild=new GrandChild();
        grandchild.display();
        grandchild.show();
        grandchild.printA();

    }
}
