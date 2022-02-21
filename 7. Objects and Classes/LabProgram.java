import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int toBuy = scnr.nextInt();
      int toRestock = scnr.nextInt(); 
      
      VendingMachine m1 = new VendingMachine();
      m1.purchase(toBuy);
      m1.restock(toRestock);
      m1.report();
   }
}
