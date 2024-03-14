import java.util.PriorityQueue;

public class queue {
    public static void main(String[] args) {
        PriorityQueue<String> pq= new PriorityQueue<>();

        pq.add("1");
        pq.add("2");
        pq.add("3");

        System.out.println("InitialQueue"+ pq);

        pq.remove("1");
        System.out.println("After Queue" +pq);
        System.out.println("Poll Method" +pq.poll());
        System.out.println("Final Queue" +pq);
    }
    
}
