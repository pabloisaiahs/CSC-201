/*10.16 LAB: Course information (derived classes)
Given main(), define a Course base class with methods to set and get the courseNumber and courseTitle. 
Also define a derived class OfferedCourse with methods to set and get instructorName, term, and classTime.*/
public class OfferedCourse extends Course {
   // TODO: Declare private fields - instructorName, term, classTime
   private String instructorName;
   private String term;
   private String classTime;
   // TODO: Define mutator methods -
   //      setInstructorName(), setTerm(), setClassTime()
   public void setInstructorName(String name){
      instructorName = name;   
   }
   public void setTerm(String term){
      this.term = term;   
   }
   public void setClassTime(String time){
      classTime = time;  
   }
   // TODO: Define accessor methods -
   //      getInstructorName(), getTerm(), getClassTime()
   public String getInstructorName(){
      return instructorName;
   }
   public String getTerm(){
      return term;  
   }
   public String getClassTime(){
      return classTime;
   }
}
