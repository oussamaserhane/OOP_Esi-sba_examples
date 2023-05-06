import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListExample2 {
    public static void main(String[] args) {
        // Create a new ArrayList
        List<String> fruits = new ArrayList<>();

        // Add elements using Collection interface methods
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Tomato");

        // Demonstrate List interface methods
        System.out.println("First element: " + fruits.get(0)); // prints "Apple"
        System.out.println("List size: " + fruits.size()); // prints 3

        // Add and remove elements using List interface methods
        fruits.add(1, "Strawberry");
        fruits.remove("Tomato");

        // Demonstrate Collection interface methods
        Collection<String> moreFruits = new ArrayList<>();
        moreFruits.add("Elderberry");
        moreFruits.add("Fig");
        fruits.addAll(moreFruits);

        // Iterate over elements using foreach loop
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        // prints "Apple", "Strawberry", "Banana", "Elderberry", "Fig"
    }
}
