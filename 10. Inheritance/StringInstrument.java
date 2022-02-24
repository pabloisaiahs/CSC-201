/*10.18 LAB: Plant information (ArrayList)
Given a base Plant class and a derived Flower class, complete main() to create an ArrayList called myGarden. 
The ArrayList should be able to store objects that belong to the Plant class or the Flower class. Create a method called printArrayList(), 
that uses the printInfo() methods defined in the respective classes and prints each element in myGarden. The program should read plants or 
flowers from input (ending with -1), add each Plant or Flower to the myGarden ArrayList, and output each element in myGarden using the printInfo() method.*/
// TODO: Define a class: StringInstrument that is derived from the Instrument class
public class StringInstrument extends Instrument {
   // TODO: Declare private fields: numStrings, numFrets
   private int numStrings;
   private int numFrets;
   // TODO: Define mutator methods - 
   //      setNumOfStrings(), setNumOfFrets()
   public void setNumOfStrings(int num) {
      numStrings = num;
   }
   
   public void setNumOfFrets(int num) {
      numFrets = num;
   }
   // TODO: Define accessor methods -
   //      getNumOfStrings(), getNumOfFrets()
   public int getNumOfStrings(){
      return numStrings;
   }
   
   public int getNumOfFrets(){
      return numFrets;
   }
}

