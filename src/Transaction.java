public class Transaction {
    static int balance;// static means its value will be asigned in a static memory by the memory loader
    //and when we call an object its updated value will come.
    int amount;
    //public void Instructions(){

    //}
    Transaction(int amount){
      System.out.println("If deposit enter amount in plus and if withdrawl enter amount in minus");
        this.amount=amount;
        balance=balance+amount;

    }

    public void display(){
        System.out.println("Balance in account is " + balance);
    }
}
