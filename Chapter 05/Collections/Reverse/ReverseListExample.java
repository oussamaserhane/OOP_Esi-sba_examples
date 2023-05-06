import java.util.ArrayList;
import java.util.Collections;

public class ReverseListExample {
    public static void main(String[] args) {
        // create a list of integers
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
		// print the original list
        System.out.println("original List: " + numbers);
        // reverse the list using Collections.reverse()
        Collections.reverse(numbers);
        // print the reversed list
        System.out.println("Reversed List: " + numbers);
    }
}





