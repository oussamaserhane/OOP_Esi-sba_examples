import java.util.LinkedList;
import java.util.Iterator;

public class iteratorLinkedList {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
		list.add("ananase");
		
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.startsWith("a")) {
                iterator.remove();
            }
        }
        System.out.println(list);
    }
}
