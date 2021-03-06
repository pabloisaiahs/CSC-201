/*10.18 LAB: Plant information (ArrayList)
Given a base Plant class and a derived Flower class, complete main() to create an ArrayList called myGarden. 
The ArrayList should be able to store objects that belong to the Plant class or the Flower class. Create a method called printArrayList(), 
that uses the printInfo() methods defined in the respective classes and prints each element in myGarden. The program should read plants or 
flowers from input (ending with -1), add each Plant or Flower to the myGarden ArrayList, and output each element in myGarden using the printInfo() method.*/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class PlantArrayListExample {

   // TODO: Define a printArrayList method that prints an ArrayList of plant (or flower) objects                                                       
   public static void printArrayList(ArrayList<Plant>list){
      for(Plant flow: list){
         flow.printInfo();
         System.out.println();
      }
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String input;
      // TODO: Declare an ArrayList called myGarden that can hold object of type plant
      ArrayList<Plant> myGarden = new ArrayList<>();
      // TODO: Declare variables - plantName, plantCost, colorOfFlowers, isAnnual
      String plantName;
      String plantCost;
      String colorOfFlowers;
      boolean isAnnual;
      input = scnr.next();
      while(!input.equals("-1")){
         // TODO: Check if input is a plant or flower
         //       Store as a plant object or flower object
         //       Add to the ArrayList myGarden
         plantName = scnr.next();
         plantCost = scnr.next();
         
         if(input.equals("plant")){
            Plant myPlant = new Plant();
            myPlant.setPlantName(plantName);
            myPlant.setPlantCost(plantCost);
            myGarden.add(myPlant);
         }
         else if(input.equals("flower")){
            Flower myFlower = new Flower();
            myFlower.setPlantName(plantName);
            myFlower.setPlantCost(plantCost);
            
            isAnnual = scnr.nextBoolean();
            colorOfFlowers = scnr.next();
            
            myFlower.setPlantType(isAnnual);
            myFlower.setColorOfFlowers(colorOfFlowers);
            
            myGarden.add(myFlower);
         }
         input = scnr.next();
      }
      
      // TODO: Call the method printArrayList to print myGarden
      printArrayList(myGarden);
   }
}
