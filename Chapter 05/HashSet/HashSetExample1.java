import java.util.Set;

public class HashSetExample1 {
    public static void main(String[] args) {
        // Create a HashSet
        Set<Integer> numbers = new HashSet<>();
        // Add some elements to the set
        numbers.add(1); numbers.add(2); numbers.add(3);        
        // Demonstrate methods from Collection interface
        System.out.println("Size of set: " + numbers.size());// 3
        System.out.println("Set contains 2: " + numbers.contains(2)); // true
        // Demonstrate methods from Set interface
        Set<Integer> otherNumbers = new HashSet<>();
        otherNumbers.add(2);
        otherNumbers.add(4);
        System.out.println("Set before intersection: " + numbers); // "[1, 2, 3]"
        numbers.retainAll(otherNumbers);
        System.out.println("Set after intersection: " + numbers); // "[2]"
        // Add some more elements to the set
        numbers.add(3); numbers.add(4); numbers.add(5);        
        System.out.println("Set before removal: " + numbers); // "[2, 3, 4, 5]"
        // Remove an element from the set
        numbers.remove(4);
        System.out.println("Set after removal: " + numbers); // "[2, 3, 5]"
    }
}


