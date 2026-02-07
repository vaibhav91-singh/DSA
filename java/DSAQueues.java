// Queues-: FIFO Property (First come first serve) 
import java.util.LinkedList;
import java.util.Queue;
class DSAQueues{

    public static void main(String[]args){
    Queue<String> queues = new LinkedList<String>();
    // check is empty or not 
    System.out.println(queues.isEmpty());
    queues.offer("Vaibhav");
    queues.offer("Arjun");
    queues.offer("Krishna");
    queues.offer("Harold");
    System.out.println(queues);
    
// Tells length of Queues
    System.out.println(queues.size());
    // for (int i = 0; i < queues.size(); i++) {
    //     queues.poll();
    //     System.out.println(queues);
    // }
// check element are prent in queues or not 

System.out.println(queues.contains("Vaibhav"));
// Remove Element from Queues

    queues.poll();
    queues.poll();
    queues.poll();
    queues.poll();
    
    System.out.println(queues);
    
    
    
    }

}


