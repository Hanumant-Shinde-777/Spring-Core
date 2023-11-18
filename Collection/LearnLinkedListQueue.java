import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {
    public static void main(String[] args) {
        Queue <Integer> queue = new LinkedList<>();
        queue.offer(12);
        queue.offer(13);
        queue.offer(14);
        queue.offer(15);
        queue.offer(16);
       System.out.println(queue);
       System.out.println(queue.peek());
       System.out.println(queue.poll());
        System.out.println(queue);
    }
}
/*
 * 2:14 Collection Interface
4:46 ArrayList
17:24 Iterator
19:12 Stack
22:27 Queue and LinkedList
29:19 PriorityQueue
34:19 ArrayDeque
39:03 HashSet
43:59 LinkedHashSet
44:46 TreeSet
46:00 Sets of Custom Classes (hashCode and equals)
53:03 HashMap
1:00:29 TreeMap
1:02:49 Arrays Class
1:05:35 Collections Class
1:07:49 Sorting Custom Collections 
1:08:55 Comparable Interface
1:11:57 Comparator Interface
 * 
 * 
 * 
 * 
 * 
 * 
 */
