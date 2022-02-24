/*10.14 LAB: Pet information (derived classes)
The base class Pet has protected fields petName, and petAge. The derived class Dog extends the Pet class and includes a private field for dogBreed. Complete main() to:

create a generic pet and print information using printInfo().
create a Dog pet, use printInfo() to print information, and add a statement to print the dog's breed using the getBreed() method.*/
import java.util.Scanner;

public class PetInformation {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      Pet myPet = new Pet();
      Dog myDog = new Dog();
      
      String petName, dogName, dogBreed;
      int petAge, dogAge;

      petName = scnr.nextLine();
      petAge = scnr.nextInt();
      scnr.nextLine();
      dogName = scnr.next();
      dogAge = scnr.nextInt();
      scnr.nextLine();
      dogBreed = scnr.nextLine();
      
      // TODO: Create generic pet (using petName, petAge) and then call printInfo       
      myPet.setName(petName);
      myPet.setAge(petAge);
      myPet.printInfo();
      // TODO: Create dog pet (using dogName, dogAge, dogBreed) and then call printInfo      
      myDog.setName(dogName);
      myDog.setAge(dogAge);
      myDog.setBreed(dogBreed);
      myDog.printInfo();
      // TODO: Use getBreed(), to output the breed of the dog
      System.out.println("   Breed: "+myDog.getBreed());
   }
}
