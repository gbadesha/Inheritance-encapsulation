package inheritancePackage;

public class Parent {
    static int a ;
    static int b ;
    static int c;
 Parent(){

 }
   Parent(int a,int b,int c){
       this.a=a;
       this.b=b;
       this.c=c;

    }

    public void display() {
        System.out.println(" entered value in clas parent are " + a + b + c);
    }

    void accessTestMethod() {
        System.out.println("hello");
    }
}