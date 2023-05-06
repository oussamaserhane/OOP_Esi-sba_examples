import java.util.Set;
import java.util.HashSet;

public class HashSetExample2 {
    public static void main(String[] args) {
        // Create a HashSet
        Set<Integer> numbers = new HashSet<>();
        // Add some elements to the set
        numbers.add(1); numbers.add(2); numbers.add(3);
        // Demonstrate methods from Collection interface
        System.out.println("Size of set: " + numbers.size());// 3
        System.out.println("Set contains 2: " + numbers.contains(2));//true
        // Demonstrate methods from Set interface
        Set<Integer> otherNumbers = new HashSet<>();
        otherNumbers.add(2); otherNumbers.add(3); otherNumbers.add(4);
        System.out.println("Set before intersection: " +numbers);//"[1,2,3]"
        numbers.retainAll(otherNumbers);
        System.out.println("Set after intersection: " + numbers);// "[2, 3]"
        System.out.println("Set before union: " + numbers);// "[2, 3]"
        numbers.addAll(otherNumbers);
        System.out.println("Set after union: " + numbers);// "[1, 2, 3, 4]"
        System.out.println("Set before difference: " +numbers);//"[1,2,3,4]"
        numbers.removeAll(otherNumbers);
        System.out.println("Set after difference: " + numbers); // "[1]"
 }}

