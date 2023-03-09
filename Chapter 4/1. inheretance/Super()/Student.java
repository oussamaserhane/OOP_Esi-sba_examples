public class Student extends Person { // Subclass (child)
  public void studentWalk() {
    super.walk(); // Call the superclass method
    System.out.println("The student walk faster ");
  }
}
