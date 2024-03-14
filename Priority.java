import java.util.PriorityQueue;

public class Priority {
   public static void main(String[] args) {
    PriorityQueue<Integer>minHeap = new PriorityQueue<>();
    PriorityQueue<Integer>maxHeap = new PriorityQueue<>((a,b)->b-a);
    minHeap.add(4);
    minHeap.add(1);
    minHeap.add(6);
    minHeap.add(2);
    minHeap.add(10);
    minHeap.add(5);

    while(!minHeap.isEmpty())
    {
        System.out.println(minHeap.poll());
    }

   } 
}
