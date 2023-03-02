public class Main {
    public static void main(String[] args) {

        Transaction transaction1 = new Transaction(1000);
        transaction1.display();
        Transaction transaction2 = new Transaction(1000);
        transaction2.display();
        Transaction transaction3 = new Transaction(-1000);



        transaction3.display();
        //System.out.println("Hello world!");
    }
}