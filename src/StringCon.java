public class StringCon {
    String firstname;
    String middlename;
    String lastname;
    int age;
    public void name(String firstname){
        this.firstname=firstname;
    System.out.println("My Firstname is " + this.firstname);
    }
    //StringConcat()
    public void name(String firstname, String middlename) {
        this.firstname=firstname;
        this.middlename = middlename;
        //this.lastname = lastname;
        System.out.println("My Firstname is " + this.firstname + "\n My middlename is " + middlename);
    }
    public void name(String firstname, String middlename,String lastname){
        this.lastname=lastname;
        this.firstname=firstname;
        this.middlename=middlename;

        System.out.println("My name is " + this.firstname + " "+ this.middlename+ " "+ this.lastname+ " age ="+ age);
    }
    public void name(String firstname, int age){
        this.firstname=firstname;
        this.age=age;
        System.out.println("Age of "+this.firstname+" is " + this.age );
    }


    StringCon(String firstname, String middlename,String lastname,int age){
        /*this.lastname=lastname;
        this.firstname=firstname;
        this.middlename=middlename;*/


        System.out.println("My name is " + firstname + " "+ middlename+ " "+ lastname + " "+age);
    }
    StringCon(String firstname, String middlename) {
        //this.firstname=firstname;
        //this.middlename = middlename;
        //this.lastname = lastname;
        //System.out.println("My Firstname is " + this.firstname + "\n My middlename is " + middlename);*/
        this(firstname,middlename,null,0);
    }
    StringCon(String firstname, int age){
        //this.firstname=firstname;
        //this.age=age;
        //System.out.println("Age of "+this.firstname+" is " + this.age );
        this(firstname,null);
    }
    StringCon(){
        System.out.println("Default name");
    }


}
