import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class LabProgram {
   public static void main(String[] args) throws IOException {
      Scanner scnr = new Scanner(System.in);
      Scanner inFile = null;
      String fileName;
      String chosenFile = scnr.next();
      FileInputStream file = new FileInputStream(chosenFile);
      inFile = new Scanner(file);
      
      while(inFile.hasNext())
      {
         fileName = inFile.next();
         fileName = fileName.substring(0,fileName.indexOf("_")+1)+"info.txt";
         System.out.println(fileName);  
      }
   }
}
