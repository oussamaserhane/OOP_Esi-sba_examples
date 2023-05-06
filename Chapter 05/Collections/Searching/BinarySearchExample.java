import java.util.ArrayList;
import java.util.Collections;
public class BinarySearchExample  {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(15);
        // perform a binary search for the value 5
        int index = Collections.binarySearch(numbers, 5);
        // print the index of the value, or -1 if not found
        System.out.println("Index of 5: " + index);
    }
}



