import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Creating an ArrayList of strings
        ArrayList<String> fruits = new ArrayList<>();
        
        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        
        // Accessing elements in the ArrayList
        System.out.println("First fruit: " + fruits.get(0));
        System.out.println("Second fruit: " + fruits.get(1));
        System.out.println("Third fruit: " + fruits.get(2));
        
        // Removing an element from the ArrayList
        fruits.remove(1);
        
        // Printing the ArrayList after removal
        System.out.println("Updated ArrayList: " + fruits);
        
        // Checking if the ArrayList contains a certain element
        boolean containsApple = fruits.contains("Apple");
        System.out.println("Does the ArrayList contain Apple? " + containsApple);
        
        // Getting the size of the ArrayList
        int size = fruits.size();
        System.out.println("Size of the ArrayList: " + size);
    }
}
