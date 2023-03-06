import java.util.Scanner;

public class StudentMarksMain {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter student marks ");
    System.out.println("Enter marks of  math ,eng, sci, sports");
    int[] student=new int[5];
    for(int i=0;i<5;i++){
        student[i]=sc.nextInt();
    }
    for(int i=0;i<5;i++){
        System.out.println("entered marks are "+ student[i]);
    }

        StudentMarks marks=new StudentMarks(4,4);
    }
}
