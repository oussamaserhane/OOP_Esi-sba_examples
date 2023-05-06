import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> names = new LinkedList<>();
        // Add some elements to the list
        names.add("Amine");
        names.add("Aicha");
        names.add("Ahmed");

        // Demonstrate methods from Collection interface
        System.out.println("Size of list: " + names.size()); // prints 3
        System.out.println("List contains 'Amine': " + names.contains("Amine")); // true

        // Demonstrate methods from List interface
        System.out.println("Element at index 1: " + names.get(1)); // prints "Aicha"
        names.set(1, "Ibrahim");
        System.out.println("New element at index 1: " + names.get(1)); // prints "Ibrahim"
        names.add(1, "Mustapha");
        System.out.println("List after adding 'Mustapha' at index 1: " + names); 
                            // prints "[Amine, Mustapha, Ibrahim, Ahmed]"

        // Demonstrate methods from Deque interface
        names.addFirst("Yacine");
        System.out.println("List after adding 'Yacine' to front: " + names); 
                // prints "[Yacine, Amine, Mustapha, Ibrahim, Ahmed]"
        names.addLast("Houcine");
        System.out.println("List after adding 'Houcine' to back: " + names); 
                // prints "[Yacine, Amine, Mustapha, Ibrahim, Ahmed, Houcine]"
        System.out.println("First element in list: " + names.getFirst()); // prints "Yacine"
        System.out.println("Last element in list: " + names.getLast()); // prints "Houcine"
        System.out.println("Removed first element: " + names.removeFirst()); // prints "Yacine"
        System.out.println("Removed last element: " + names.removeLast()); // prints "Houcine"
    }
}





