import java.util.Scanner; // Import from java util package

class scannerInput {
  public static void main(String[] args) {
    Scanner myInput = new Scanner(System.in);

    System.out.println("Enter name and birthday date :");

    // String input
    String name = myInput.nextLine();

    // Numerical input
    int birthday = myInput.nextInt();
	
	// calculate age
	int age = 2023 - birthday;
	
    // Output input by user
    System.out.println("Name: " + name);
    System.out.println("your Age is: " + age);
  }
}



