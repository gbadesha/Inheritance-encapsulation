package inheritancePackage;

public class Child extends Parent{
    public void printA(){
        System.out.println(a);
    }
    public void display(){   //method overriding
        System.out.println("this is a display method of child");
        super.display();// will access display method of parent class
    }
}
