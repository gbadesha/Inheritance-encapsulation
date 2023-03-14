package inheritancePackage;

public class Inheritancesession {
    public static void main(String[] args){
        Child child=new Child();
        child.display();
       child.printA();
        Parent parent = new Parent(1,1,1);
        parent.display();
       GrandChild grandchild=new GrandChild(3,3,3);
      grandchild.display();
      grandchild.show();
      grandchild.printA();
        System.out.println(child.a+" "+child.b+ " " + child.c);

    }
}
