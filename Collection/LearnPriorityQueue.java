import java.util.PriorityQueue;
    import java.util.Comparator;
    import java.util.Queue;

public class LearnPriorityQueue {
    public static void main(String[] args) {
        Queue <Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
       pq.offer(10);
       pq.offer(20);
       pq.offer(30);
       pq.offer(40);
       pq.offer(50);
       //System.out.println(pq);
      // System.out.println(pq.poll());
        System.out.println(pq.remove(10));
      //System.out.println(pq.peek());
    }

}
