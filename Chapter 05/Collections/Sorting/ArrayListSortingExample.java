import java.util.ArrayList;
import java.util.Collections;
public class ArrayListSortingExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(15);
        // List before sorted
		System.out.println("Original List: " + numbers);
        // sort the list using Collections.sort()
        Collections.sort(numbers);
        // print the sorted list
        System.out.println("Sorted List: " + numbers);
    }
}


