import java.util.List;

/**
 * Many teachers, many students.
 * Implements teachers and student using an Array list
 * Created by Mahesh on 18/03/2021
 */
public class School {


    private List<Teacher> teachers;
    private List<Students> students;
    private int TotalMoneyEarned;
    private int totalMoneySpetnt;


    /**
     * new school obejct is created.
     * /@ param teacher list of teachers in the school
     * /@ param students list of students in the school.
     */
    public School(List<Teacher> teachers, List<Students> students){
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned=0;
        totalMoneySpetnt=0;
    }
    /**
     * 
     * /@ return the list of teachers in the school.
     */
     public List<Teacher> getTeachers(){
         return teachers;

     }
     
     /**
      * Adds a teachers to the school.
      * /@ param teacher the teacher to be added
      */
     public void addTeachers(Teacher teacher){
         teachers.add(teacher);
     }


     /**
      * 
      * @return the list of students in the school.
      */
     public List<Students> getStudents(){
         return students;
     }
      

     /**
      * add a student to the school
      * /@ param student the stident to be added.
      */
     public void addStudent(Students student) {
         students.add(student);
     }


     /**
      * 
      * 
      * /@ return the total money earned by the school.
      */

     public int getTotalMoneyEarned( int totalMoneyErned){
         this.totalMoneyEarned = totalMoneyErned;
     }


     /**
      * Adds the total money earned by the school.
      *  /@ param MoneyEarned money that is supposed to be added.
      */

      public void updateTotalMoneyEarned(int MoneyEarned){
             totalMoneyEarned += MoneyEarned;
      }

      /**
       * 
       * /@ return the total money spent by the school.
       */

     public int getTotalMoneySpent(){
         
         return totalMoneySpent;
     }


   /**
    * update the money that is spent by the school which the salary given by the school to its teachers.
    * 
    * / @ param MoneySpent the money spent by school
    */
     public void updateTotalMoneySpent(int MoneySpent){
         
         totalMoneyEarned-=MoneySpent;
     }

}
