import java.util.PriorityQueue;
public class PriorityQueueExample2 {
    public static void main(String[] args) {
        // Create a PriorityQueue with Integer type elements
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // Add elements to the PriorityQueue with their priority values
        pq.add(5);  // priority value 5
        pq.add(10); // priority value 10
        pq.add(1);  // priority value 1
        pq.add(7);  // priority value 7
        pq.add(3);  // priority value 3
        // Print the elements of the PriorityQueue
        System.out.println("PriorityQueue elements: " + pq);
        // Retrieve and remove the highest priority element from the PriorityQueue
        int highestPriorityElement = pq.poll();
        System.out.println("Highest priority element: " + highestPriorityElement);
        // Print the remaining elements of the PriorityQueue
        System.out.println("PriorityQueue elements after poll(): " + pq);
    }  }




