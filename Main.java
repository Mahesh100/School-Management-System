
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mahesh on 19/03/2021
 */

public class Main {
    public static void main(String[] args){
        int id;
        String name;
        int salary;
        Teacher lizzy = new Teacher(id=1, name="Lizzy", salary=500);
        Teacher mellisa = new Teacher(id=2, name="Mellisa", salary=700);
        Teacher vanderhorn = new Teacher( id=3, name="Vanderhorn", salary=600);
        

        List<Teacher>teacherList =new ArrayList<>();
        List<Teacher> teachrList;
        teachrList.add(lizzy);
        teachrList.add(mellisa);
        teachrList.add(vanderhorn);

        int grade;
        student tasmasha = new student(id=1, name="Tamasha", grade=4);
        student mahesh = new student(id=2, name="Mahesh", salary);
        student rabbi = new student(id=3, name="Rabbi", grade=5);
        List<student> studentList=new ArrayList<>();
       
        Object tamasha;
        studentList.add((student) tamasha);
        studentList.add(rabbi);
        studentList.add(mahesh);

         School ghs = new School(teacherList,StudentList);
         System.out.println("GHS has earned "+ ghs.getTotalMoneySpent());


    }

}
