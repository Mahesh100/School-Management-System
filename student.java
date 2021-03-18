
//package school.mamagement.system;
/**
 * Created by Mahesh on 18/03/2021
 * This class is responsible for keeping the track 
 * of students fees paid, name, id, grade.
 */

 public class student{
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * To create a new student by initilizing
     * Fees paid for every sudent is $30,000.
     * @param id id for student which is unique 
     * @param name name of the studet
     * @param grade grade of the student
     */
    
    public student(int id, String name,int grade){
        this.feesPaid=0;
        this.feesTotal=30000;
        this.id=id;
        this.name=name;
        this.grade=grade;
    }
 

 //Not going to alter student's name, student's id.
/**
 * Used to update the students grade
 * @param grade its the new grade of the student.
 */
 public void setGrade(int grade){
     this.grade=grade;
}
/**
 * Keep adding the fees to feesPaid Field.
 * feespaid=10,000+5000+15000
 * Add the fees to fees paid.
 * The school is going to recive the funds.
 * @param fees
 */
public void updateFeesPaid(int fees){
   feesPaid+=fees;
}


public student() {
}
         public int getID(){
            return id;
         }

         public String getName(){
            return name;
         }

         public int getGrade(){
            return grade;
         }

         public int feesPaid(){
            return feesPaid;
         }

         public int getFeesTotal(){
            return feesTotal;
         } 
     }
