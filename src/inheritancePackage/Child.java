package inheritancePackage;

public class Child extends Parent {
    public void printA() {
        System.out.println(a);
    }
    Child(int e,int f,int g){
        super(e,f,g);
    }
    Child(){

    }

    public void display() {   //method overriding
      System.out.println("this is a display method of child");
      accessTestMethod();
    }
}
       // super.display();// will access display method of p
