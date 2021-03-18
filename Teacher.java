/**
 * created by Mahesh on 18/03/2021
 * This class is responsible for keeping the track
 * of teacher's name, id, salary.
 */

public class Teacher {
    private int id;
    private String name;
    private int salary;
    
    /**
     * Creates a new Teacher object
     * id for the teacher.
     * name of the teacher.
     * salary of the teacher.
     */
    public Teacher(int id, String name, int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    
   /**
   *return the id.
   */

    public int getId(){
        return id;
    }

    /**
     * @ return the name of the teacher
     */

    public String getName(){
        return name;
    }

    /**
     * return the salary of the teacher.
     */

    public int getSalary(){
        return salary;
    }
    
    /**
     * set the salary
     * @ param 
     */
    public void setSalary(int salary){
        this.salary=salary;
    }
}
