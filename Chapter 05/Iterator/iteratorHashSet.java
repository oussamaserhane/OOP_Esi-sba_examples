import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class iteratorHashSet {
    public static void main(String[] args) {
        // create a set
        Set<Integer> set = new HashSet<>();
        // add some elements to the set
        set.add(7); set.add(6); set.add(4);
        set.add(5); set.add(9); set.add(1);
        // get an iterator for the set
        Iterator<Integer> iterator = set.iterator();
        // iterate over the elements using the iterator
        while (iterator.hasNext()) {
            int element = iterator.next();
            System.out.println(element);
        }
    }
}


