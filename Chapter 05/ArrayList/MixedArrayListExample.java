import java.util.ArrayList;

public class MixedArrayListExample {
    public static void main(String[] args) {
        
        // Creating an ArrayList with different types of objects
        ArrayList<Object> mixedList = new ArrayList<>();
        
        // Adding elements to the ArrayList
        mixedList.add("Hello");
        mixedList.add(42);
        mixedList.add(3.14);
        mixedList.add(true);
        
        // Accessing elements in the ArrayList
        System.out.println("First element: " + mixedList.get(0));
        System.out.println("Second element: " + mixedList.get(1));
        System.out.println("Third element: " + mixedList.get(2));
        System.out.println("Fourth element: " + mixedList.get(3));
    }
}
