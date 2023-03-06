public class StudentMarks {
    StudentMarks(int math,int eng,int sci,int sports)
    {
        int avg=(math+eng+sci+sports)/4;
        System.out.println("Student has average marks as "+ avg);
    }
    StudentMarks(int math,int eng,int sci){
        this(math,eng,sci,0);
    }
    StudentMarks(int math,int eng){
        this(math,eng,0);
    }
    StudentMarks(int math){
        this(math,0);
    }
    StudentMarks(){
        System.out.println("Default constructor");
    }
}
