import java.util.ArrayList;
import java.util.Scanner;

public class DateParser {
   public static int getMonthAsInt(String monthString) {
      int monthInt;
      
      // Java switch/case statement                                                                
      switch (monthString) {
         case "January": 
            monthInt = 1; 
            break;
         case "February": 
            monthInt = 2; 
            break;
         case "March": 
            monthInt = 3; 
            break;
         case "April": 
            monthInt = 4; 
            break;
         case "May": 
            monthInt = 5; 
            break;
         case "June": 
            monthInt = 6; 
            break;
         case "July": 
            monthInt = 7; 
            break;
         case "August": 
            monthInt = 8; 
            break;
         case "September": 
            monthInt = 9; 
            break;
         case "October": 
            monthInt = 10; 
            break;
         case "November": 
            monthInt = 11; 
            break;
         case "December": 
            monthInt = 12; 
            break;
         default: 
            monthInt = 0;
      }
      
      return monthInt;
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      // TODO: Read dates from input, parse the dates to find the ones
      //       in the correct format, and output in m/d/yyyy format
      String checkVal = "";
      String p1;
      String month;
      String day;
      String year;
      
      boolean inputDone = false;
      ArrayList<String> dates = new ArrayList<String>();
      
      while(!inputDone) {
         p1 = scnr.nextLine();
         //System.out.println(p1.equals("-1"));
         if(p1.equals("-1")) {
            inputDone = true;
            break;
         }
         dates.add(p1);
      }   

     //System.out.println(dates.size());
     int place = 0;
     for(String ele: dates){
        try{
         if(ele.contains(",")) {  
            month = ele.substring(0,ele.indexOf(" "));
            //System.out.println(getMonthAsInt(month));
            day = ele.substring(ele.indexOf(" ")+1, ele.indexOf(","));
            //System.out.println(day);
            year = ele.substring(ele.indexOf(",")+2, ele.length());
            //System.out.println(year);
            System.out.println(getMonthAsInt(month)+"/"+day+"/"+year);
         }
        }catch (Exception e) {}
     }  
   }
}
