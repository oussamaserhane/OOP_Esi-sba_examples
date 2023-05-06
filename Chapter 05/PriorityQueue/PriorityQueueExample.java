import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Create a new priority queue
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

        // Add elements to the queue
        queue.offer(100);
        queue.offer(1);
        queue.offer(15);

        // Print the elements in the queue
        System.out.println("Elements in the priority queue: " + queue);

        // Get and remove the highest priority element
        int highestPriorityElement = queue.poll();

        // Print the highest priority element
        System.out.println("Highest priority element: " + highestPriorityElement);

        // Print the elements in the queue after removing the highest priority element
        System.out.println("Elements in the priority queue after removing highest priority element: " + queue);
    }
}
