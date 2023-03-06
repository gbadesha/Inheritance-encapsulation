package EncapsulationPackage;

public class EncapsulatioSession {
    public static void main(String[] args){
        Student s1=new Student();
        //s1.firstname="Gurpreet";
        s1.setFirstName("Gurpreet");

        String s=s1.getFirstname();
        System.out.println(s);
            }


}
