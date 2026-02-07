
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

// Priority Queues -: Insert priority property in Queues(FIFO). 
class DSAPriorityQueue{
    public static void main(String[] args) {
        
        // Queue<String> queue = new PriorityQueue<>();

        Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());
        queue.offer("B");
        queue.offer("A");
        queue.offer("S");
        queue.offer("F");
        queue.offer("G");

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}


