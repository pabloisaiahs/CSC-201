/*9.7 LAB: File name change
A photographer is organizing a photo collection about the national parks in the US and would like to annotate the information about each of the photos into 
a separate set of files. Write a program that reads the name of a text file containing a list of photo file names. The program then reads the photo file names 
from the text file, replaces the "_photo.jpg" portion of the file names with "_info.txt", and outputs the modified file names.

Assume the unchanged portion of the photo file names contains only letters and numbers, and the text file stores one photo file name per line. 
If the text file is empty, the program produces no output.*/
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
