package inheritancePackage;

public class GrandChild extends Child {
    int e;
    public void show(){
        //super.display();
        System.out.println(" entered value of e in grandchild class " +e +" from child a "+a);
    accessTestMethod();
    }
    GrandChild(int a,int b,int c){
        super(3,3,3);
    }

}
