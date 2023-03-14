package abstractPackage;

public class Run {
    public static void main(String[] args){
        WorkOnAbstractClass work=new WorkOnAbstractClass() {
            public void met() {

            }
        };
        work.met();
        work.work();

    }
}
