/*10.17 LAB: Book information (overriding member methods)
Given main() and a base Book class, define a derived class called Encyclopedia. Within the derived Encyclopedia class, 
define a printInfo() method that overrides the Book class' printInfo() method by printing not only the title, author, 
publisher, and publication date, but also the edition and number of volumes.*/
public class Encyclopedia extends Book {
   // TODO: Declare private fields: edition, numVolumes
  private String edition;
   private int numVolumes;
   // TODO: Define mutator methods - 
   //       setEdition(), setNumVolumes()
   public void setEdition(String edition){
      this.edition = edition;  
   }
   public void setNumVolumes(int vol){
      numVolumes = vol;  
   }
  
   // TODO: Define accessor methods -
   //       getEdition(), getNumVolumes()
   public String getEdition(){
      return edition;  
   }
   public int getNumVolumes(){
      return numVolumes;  
   }
   
   // TODO: Define a printInfo() method that overrides 
   //       the printInfo in Book class 
   public void printInfo(){
      System.out.println("Book Information: ");
      System.out.println("   Book Title: " + this.getTitle());
      System.out.println("   Author: " + this.getAuthor());
      System.out.println("   Publisher: " + this.getPublisher());
      System.out.println("   Publication Date: " + this.getPublicationDate());
      System.out.println("   Edition: " + edition);
      System.out.println("   Number of Volumes: " + numVolumes);
   }
}
