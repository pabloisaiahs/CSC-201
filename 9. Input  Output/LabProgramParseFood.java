import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.String;

public class LabProgramParseFood {
   public static void main(String[] args) throws IOException {
      Scanner scnr = new Scanner(System.in);
      Scanner inFile = null;
      String chosenFile = scnr.next();
      String data;
      String item;
      String category;
      String desc;
      FileInputStream file = new FileInputStream(chosenFile);
      inFile = new Scanner(file);
      String[] stat;
      
      //data = inFile.nextLine();
      //stat = data.split("(?=\\p{Upper})");
      //stat = data.split("\t");
      //System.out.println("Sentence: "+data);
      //System.out.println("sub: "+data.substring(0,data.indexOf("\t")));
      //System.out.println("sub2: "+data.substring(data.indexOf("\t"),data.indexOf("\t")));
      /*for(String ele: stat){
         System.out.println(ele);  
      }*/
      
      while(inFile.hasNext()){
         data = inFile.nextLine();       
         if(!data.contains("Not available")){
            //stat = data.split("(?=\\p{Upper})");
            stat = data.split("\t");
            category = stat[0].trim();
            item = stat [1].trim();
            desc = stat [2].trim();
            //System.out.println(data);
            //System.out.println(stat[0]);
            System.out.println(item+" ("+category+") "+"-- "+desc);
         }  
      }
      
   }
}
